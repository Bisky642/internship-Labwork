import java.util.*;

public class Exercise6 {
	public static List votersList(Map<Integer, Integer> map) {
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		for (Map.Entry m : map.entrySet()) {
			int age = (int) m.getValue();
			if (age > 18) {
				map1.put((Integer) m.getKey(), "Eligible");
			}

		}
		List<Integer> list = new ArrayList<Integer>(map1.keySet());
		return list;
	}

	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(8001, 21);
		map.put(8002, 17);
		map.put(8003, 39);
		map.put(8004, 12);
		map.put(8005, 28);
		System.out.println(votersList(map));
	}

}
