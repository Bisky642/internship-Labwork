import java.util.*;
public class Exercise8 {
	public static boolean positiveString(String string)
	{
		boolean b=true;
		char words[]=string.toCharArray();
		for(int i=0;i<words.length-1;i++)
		{
			if(words[i+1]<words[i])
			{
				b=false;
			}
		}
		if(b==true)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String string=input.nextLine();
		input.close();
		System.out.println(positiveString(string));
	}

}