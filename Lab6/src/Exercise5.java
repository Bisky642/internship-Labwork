import java.util.*;

public class Exercise5 {
	public static int getSecondSmallest(int[] array) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i:array)
		{
			list.add(i);
		}
		Collections.sort(list);
		int element = list.get(1);
		return element;

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int k = input.nextInt();
		int[] array = new int[k];
		for (int i = 0; i < array.length; i++) {
			int j = input.nextInt();
			array[i] = j;
		}
		input.close();

		System.out.println(getSecondSmallest(array));
	}

}
