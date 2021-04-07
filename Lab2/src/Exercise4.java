import java.util.*;

public class Exercise4 {
	static int removeDuplicates(int array[]) {
		int length = array.length;
		Arrays.sort(array);

		int[] temp = new int[length];

		int j = 0;
		for (int i = 0; i < length - 1; i++) {
			if (array[i] != array[i + 1]) {
				temp[j] = array[i];
				j++;
			}
		}
		temp[j++] = array[length - 1];
		for (int i = 0; i < j; i++) {
			array[i] = temp[i];
		}

		return j;
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int k=input.nextInt();
		int[] array1=new int[k];
		for(int i=0;i<array1.length;i++)
		{
			int literal=input.nextInt();
			array1[i]=literal;
		}
		input.close();
		int n = array1.length;

		n = removeDuplicates(array1);
		int[] arr1 = new int[n];
		int a = n;
		for (int i = 0; i < n; i++) {
			arr1[a - 1] = array1[i];
			a = a - 1;
		}
		for (int i = 0; i < n; i++)
			System.out.print(arr1[i] + " ");
	}
}