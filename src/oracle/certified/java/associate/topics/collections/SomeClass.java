package oracle.certified.java.associate.topics.collections;

import java.util.SortedMap;
import java.util.TreeMap;

public class SomeClass {
    public static void main(String... args) {
        SortedMap<String, Integer> map = new TreeMap<String, Integer>();

        map.put("0", 0);
        map.put("1", 1);
        map.put("2", 2);
        map.put("3", 3);
        map.put("4", 4);
        map.put("5", 5);
        map.put("6", 6);
        map.put("7", 7);
        map.put("8", 8);
        map.put("9", 9);

        System.out.println(map.headMap("3"));
        System.out.println(map.tailMap("6"));

        // System.out.println(map.headMap("3", true));
        // System.out.println(map.headMap("3", false));
        //
        // System.out.println(map.tailMap("6", true));
        // System.out.println(map.tailMap("6", false));

    }
}
