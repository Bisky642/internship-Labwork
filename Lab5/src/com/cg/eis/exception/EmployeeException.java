package com.cg.eis.exception;
import java.util.*;
class SalaryException extends Exception
{
	int salary;

	public SalaryException(int salary) {
		super();
		this.salary = salary;
	}
	@Override
	public String toString() {
		return salary+" Rs"+" salary is below 3000 Rs";
	}
	
	
}
public class EmployeeException {
	public static void salary(int salary) throws SalaryException
	{
		if(salary<3000)
		{
			throw new SalaryException(salary);
		}
		else
		{
			System.out.println("Your salary is: "+salary);
		}
	}
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int salary=input.nextInt();
		input.close();
		try
		{
			salary(salary);
		}
		catch(SalaryException e)
		{
			System.out.println("salary exception occured");
			System.out.println(e);
		}
	}

}
