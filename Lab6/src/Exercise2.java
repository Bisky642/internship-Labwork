import java.util.*;
public class Exercise2 {
	public static Map<Character,Integer> countChars(char[] arr)
	{
		Map<Character, Integer> map=new HashMap<Character,Integer>();
		for(char i:arr) {
            if(map.containsKey(i))
            {
                map.put(i,map.get(i)+1);
            }
            else
            {
                map.put(i, 1);
            }
        }
        return map;
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String string=input.nextLine();
		char[] ch=string.toCharArray();
		System.out.println(countChars(ch));
		}
	}

