import java.util.Scanner;
import java.util.function.Function;

public class Exercise5 {
	public static int factorial(int num)
	{
		int sum=1;
		for(int i=1;i<=num;i++)
		{
			sum=sum*i;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int k=input.nextInt();
		Function<Integer,Integer> fun=Exercise5::factorial;
		System.out.println(fun.apply(k));
	}

}
