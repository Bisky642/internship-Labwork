import java.util.Scanner;

public class Exercise3 {
	public static boolean checkNumber(int number) {
		boolean flag = true;
		int currDigit = number % 10;
		number = number / 10;
		while (number > 0) {
			if (currDigit < number % 10) {
				flag = false;
				break;
			}

			currDigit = number % 10;
			number = number / 10;
		}
		if (flag) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int j = input.nextInt();
		System.out.println(checkNumber(j));
	}

}
