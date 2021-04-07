import java.util.*;

public class Exercise4 {
	public static HashMap<Integer, String> getStudents(HashMap<Integer, Integer> map) {
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		for (Map.Entry m : map.entrySet()) {
			int marks = (int) m.getValue();
			if (marks >= 90) {
				map1.put((Integer) m.getKey(), "Gold");
			} else if (marks >= 80 && marks < 90) {
				map1.put((Integer) m.getKey(), "Silver");
			} else if (marks >= 70 && marks < 80) {
				map1.put((Integer) m.getKey(), "Bronze");
			} else {
				map1.put((Integer) m.getKey(), "No Medal");
			}
		}
		return map1;
	}

	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(9451, 95);
		map.put(9452, 85);
		map.put(9453, 75);
		map.put(9454, 65);
		System.out.println(getStudents(map));
	}

}
