import java.util.function.Supplier;

public class Exercise4 {

	public static void main(String[] args) {
		Supplier<Student_4> sup=Student_4::new;
		System.out.println(sup.get().getName());
		System.out.println(sup.get().getRoll_num());
	}

}
