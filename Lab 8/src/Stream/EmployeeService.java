package Stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeService {
	public static void sumOfSalary() {
		List<Employee> list = EmployeeRepository.getEmployees();
		Stream<Employee> stream = list.stream();
		Optional<Double> op = stream.map(a -> a.getSalary()).reduce((a, b) -> a + b);
		if (op.isPresent()) {
			System.out.println("sum of salaries: " + op.get());
		}
	}

	public static void dept() {
		Map<String, Long> deptList = EmployeeRepository.getEmployees().stream().filter(e -> e.getDepartment() != null)
				.map(e -> e.getDepartment())
				.collect(Collectors.groupingBy(Department::getDepartmentName, Collectors.counting()));
		System.out.println(deptList);
	}
	public static void seniorEmployee(){
		Optional<Employee> opt=  EmployeeRepository.getEmployees().stream().min((a,b)->a.getHireDate().compareTo(b.getHireDate()));
		System.out.println(opt.get());
	}
	public static void deptNull(){
		List<Employee> list= EmployeeRepository.getEmployees().stream().filter(e->e.getDepartment()==null).collect(Collectors.toList());
		System.out.println(list);
	}
	public static void main(String[] args) {
		sumOfSalary();
		dept();
		seniorEmployee();
		deptNull();
		}
}
