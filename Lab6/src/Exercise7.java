import java.util.*;
public class Exercise7 {
	public static int getSorted(int[] array)
	{
		String arrayString = "";
		for (int k = 0; k < array.length; k++) {
			arrayString = "" + array[k];
			StringBuffer sb = new StringBuffer(arrayString);
			sb.reverse();
			array[k] = Integer.parseInt(sb.toString());
		}
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i:array)
		{
			list.add(i);
		}
		Collections.sort(list);
		String str="";
		for(int i=0;i<array.length;i++)
		{
			str=str+array[i];
		}
		int output=Integer.parseInt(str);
		return output;
	}
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int k=input.nextInt();
		int[] array=new int[k];
		for(int i=0;i<array.length;i++)
		{
			int j=input.nextInt();
			array[i]=j;
		}
		input.close();
		System.out.println(getSorted(array));
		
	}
}
