import java.util.*;
public class Exercise4 {
	public static int modifyNumber(int number1)
	{
		String string=String.valueOf(number1);
		int length=string.length();
		int[] numberArray=new int[length];
		int i=0;
		while(number1>0)
		{
			numberArray[length-i-1]=number1%10;
			i++;
			number1=number1/10;
		}
		String output="";
	
		for(int j=0;j<length-1;j++)
		{
			String string1=""+Math.abs(numberArray[j]-numberArray[j+1]);
			output=output+string1;
			//System.out.println(numberArray1[j]);
		}
		output+=numberArray[length-1];
		return Integer.parseInt(output);
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int number=input.nextInt();
		input.close();
		
		System.out.println(modifyNumber(number));
		
		 
		 
	}

}