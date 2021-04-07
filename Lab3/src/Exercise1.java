import java.util.*;
public class Exercise1 {
	public static void display(String string)
	{
		StringTokenizer stringToken=new StringTokenizer(string,",");
		int sum=0;
		while(stringToken.hasMoreElements())
		{
			String temp=stringToken.nextToken();
			int n=Integer.parseInt(temp);
			System.out.print(n+" ");
			sum+=n;
		}
		System.out.println(" ");
		System.out.println("sum: "+sum);
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String string=input.nextLine();
		input.close();
		display(string);
	}

}
