import java.util.Scanner;
import java.lang.Math;

public class Exercise2 {
	public static int calculateDifference(int number) {
		int sum2 = 0, sum;
		for (int i = 1; i <= number; i++) {
			sum2 = sum2 + (int) Math.pow(i, 2);
		}
		int sum1 = 0, square;
		for (int j = 1; j <= number; j++) {
			sum1 = sum1 + j;
		}
		square = (int) Math.pow(sum1, 2);
		sum = sum2 - square;
		return sum;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int k = input.nextInt();
		System.out.println(calculateDifference(k));
	}

}
