import java.util.*;
import java.lang.*;

public class Exercise1 {
	public static int getSecondSmallest(int[] array) {
		Arrays.sort(array);
		return array[1];
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int k = input.nextInt();
		int array1[] = new int[k];
		for (int i = 0; i < array1.length; i++) {
			int literal = input.nextInt();
			array1[i] = literal;
		}
		System.out.println(getSecondSmallest(array1));
	}

}
