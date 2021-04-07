import java.util.*;

interface Exercis {
	public String space(String string);
}

public class Exercise2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String string = input.nextLine();
		Exercis obj = (str1) -> {
			String str2 = "";
			for (int i = 0; i < str1.length(); i++) {
				if (i == 0) {
					str2 = str2 + str1.charAt(i);
				} else
					str2 = str2 + " " + str1.charAt(i);
			}
			return str2;
		};
		System.out.println(obj.space(string));
	}

}
