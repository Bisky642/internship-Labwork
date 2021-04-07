import java.util.*;
class NameException extends Exception
{
	String fName;
	String lName;
	public NameException(String fName, String lName) {
		super();
		this.fName = fName;
		this.lName = lName;
	}
	@Override
	public String toString() {
		return "invalid names";
	}
	
}
public class Exercise2 {
	public static void name(String fName,String lName) throws NameException
	{
		
		if(fName.length()==0 && lName.length()==0)
		{
			throw new NameException(fName,lName);
		}
		else
		{
			System.out.println("Your name is: "+fName+" "+lName);
		}
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String fName=input.nextLine();
		String lName=input.nextLine();
		input.close();
		try
		{
			Exercise2.name(fName,lName);
		}
		catch(NameException e)
		{
			System.out.println("Null pointer exception occured");
			System.out.println(e);
		}
		}

}
