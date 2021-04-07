import java.util.*;

public class Exercise3 {
	public static int getSorted(int[] array) {
		String arrayString = "";
		for (int k = 0; k < array.length; k++) {
			arrayString = "" + array[k];
			StringBuffer sb = new StringBuffer(arrayString);
			sb.reverse();
			array[k] = Integer.parseInt(sb.toString());
		}

		Arrays.sort(array);
		String str="";
		for(int i=0;i<array.length;i++)
		{
			str=str+array[i];
		}
		int output=Integer.parseInt(str);
		return output;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int k = input.nextInt();
		int array1[] = new int[k];
		for (int i = 0; i < array1.length; i++) {
			int literal = input.nextInt();
			array1[i] = literal;
		}
		input.close();
		System.out.println(getSorted(array1));

		
	}

}
