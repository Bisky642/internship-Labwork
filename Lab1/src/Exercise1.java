import java.util.Scanner;

public class Exercise1 {
	public static int calculateSum(int number) {
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int j = input.nextInt();
		System.out.println(calculateSum(j));
	}

}
