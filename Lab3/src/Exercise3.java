import java.util.*;
public class Exercise3 {
	public static String alterString(String string)
	{
		char words[]=string.toCharArray();
		for(int i=0;i<string.length();i++)
		{
			if(words[i]!='a'&&words[i]!='e'&&words[i]!='i'&&words[i]!='o'&&words[i]!='u'&&words[i]!='A'&&words[i]!='E'&&words[i]!='I'&&words[i]!='O'&&words[i]!='U')
			{
				char ch=words[i];
				words[i]=(char) (ch+1);
			}
		}
		string=String.valueOf(words);
		return string;
	}
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	String string=input.nextLine();
	input.close();
	System.out.println(alterString(string));
	}
}
