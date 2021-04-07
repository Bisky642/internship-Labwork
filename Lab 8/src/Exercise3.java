import java.util.*;
import java.util.function.BiPredicate;
public class Exercise3 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String name1=input.nextLine();
		int pass=input.nextInt();
		BiPredicate<String,Integer> pred=(name,password)->{
			if(name.equals("veltech") && password==1234)
			{
				return true;
			}
			else
			{
				return false;
			}
	};
	System.out.println(pred.test(name1,pass));
	}
}
