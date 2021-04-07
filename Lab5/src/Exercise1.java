import java.util.*;
class AgeException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int age;
	AgeException(int a)
	{
		age=a;
	}
	public String toString() {
		return age+" is an invalid age"; }
	
}
public class Exercise1 {
	public void age () throws AgeException
	{
		Scanner input=new Scanner(System.in);
		int age=input.nextInt();
		input.close();
		if(age<15)
		{
			throw new AgeException(age);
		}
		else
		{
			System.out.println("You are eligible");
		}
	}
	public static void main(String[] args) throws AgeException {
		
		Exercise1 ex=new Exercise1();
		try
		{
			ex.age();
		}
		catch(AgeException e)
		{
			System.out.println("Age exception occured");
			System.out.println(e);
		}
	}

}
