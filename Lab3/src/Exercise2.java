import java.util.*;

public class Exercise2 {
	public static String getImage(String string) {
		StringBuffer sb = new StringBuffer(string);
		String string1 = sb.reverse().toString();
		String string2 = string + "|" + string1;
		return string2;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String string = input.nextLine();
		input.close();
		System.out.println(getImage(string));
	}

}
