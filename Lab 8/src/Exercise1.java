import java.util.*;
interface Exercise
{
	public int power(int x,int y);
}
public class Exercise1 {
	public static void main(String[] args) {
		Exercise obj=(x,y)->(int)Math.pow(x, y);
		System.out.println(obj.power(5, 10));
	}

}
