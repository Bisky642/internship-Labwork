import java.util.*;

public class Exercise1 {
	public static List getValues(HashMap map)
	{
		List<Integer> list=new ArrayList<Integer>();
		Set set=map.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			Map.Entry out=(Map.Entry)itr.next();
			list.add((Integer) out.getValue());		
			}
		Collections.sort(list);
		return list;
	}
	public static void main(String[] args) {
		HashMap<String,Integer>map=new HashMap<String,Integer>();
		map.put("sai",10);
		map.put("kiran",15);
		map.put("me",15);
		System.out.println(getValues(map));
	}

}
