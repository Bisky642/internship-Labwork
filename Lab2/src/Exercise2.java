import java.util.*;

public class Exercise2 {
	public static String sortStrings(String[] array) {
		int length;
		if (array.length % 2 == 0) {
			length = array.length / 2;
		} else {
			length = (array.length / 2) + 1;
		}
		Arrays.sort(array);
		for (int i = 0; i < length; i++) {
			array[i] = array[i].toUpperCase();
		}
		for (int j = length; j < array.length; j++) {
			array[j] = array[j].toLowerCase();
		}
		String arrayString = Arrays.toString(array);
		return arrayString;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int k = input.nextInt();
		String[] array1 = new String[k];
		for (int i = 0; i < array1.length; i++) {
			String literal = input.next();
			array1[i] = literal;
		}

		String[] array2 = { "sai", "kiran", "mani", "ratnam", "anil" };
		System.out.println(sortStrings(array2));

	}
}
