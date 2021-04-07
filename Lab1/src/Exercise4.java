import java.util.Scanner;

public class Exercise4 {
	public static boolean checkNumber(int number) {
		while (number % 2 == 0) {
			number = number / 2;
		}
		if (number == 1) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int j = input.nextInt();
		System.out.println(checkNumber(j));
		;
	}

}
