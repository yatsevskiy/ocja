package oracle.certified.java.associate.topics.collections;

import java.util.NavigableMap;
import java.util.TreeMap;

public class Test1 {

	public static void main(String[] args) {
		TreeMap<String, Integer> myMap = new TreeMap<String, Integer>();
		myMap.put("a", 50);
		myMap.put("b", 60);
		myMap.put("c", 70);
		NavigableMap<String, Integer> myMap2 = myMap.headMap("d", true);
		myMap.put("e", 90);
		myMap2.put("f", 100);
		System.out.println(myMap.size() + " " + myMap2.size());
	}

}
