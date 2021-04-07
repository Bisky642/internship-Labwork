import java.lang.reflect.Array;
import java.util.*;
public class Exercise3 {
	public static Map getSquares(int[] array)
	{
		Map<Integer,Integer>map=new HashMap<Integer,Integer>();
		for(int j:array)
		{
			map.put(j,(int) Math.pow(j,2));
		}
		return map;
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int k=input.nextInt();
		int[] array=new int[k];
		for(int i=0;i<array.length;i++)
		{
			int j=input.nextInt();
			array[i]=j;
		}
		input.close();
		System.out.println(getSquares(array));
	}

}
