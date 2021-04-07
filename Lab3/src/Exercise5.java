import java.util.*;
public class Exercise5 {
	public static void count(String string)
	{
		int lines=0;
		char ch[]=string.toCharArray();
		int characters=ch.length;
		String[] word=string.split("\\s");
		int words=word.length;
		for(int i=0;i<word.length;i++)
		{
			if(word[i]=="\n")
			{
				lines=lines+1;
			}
		}
		System.out.println("characters: "+characters);
		System.out.println("words: "+words);
		System.out.println("lines: "+lines);
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String string=input.nextLine();
		input.close();
		count(string);
	}

}