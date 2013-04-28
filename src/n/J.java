package n;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class J {
	  public static void main(String[] args) {
		    List<String> list = Arrays.asList("a", "b", "c", "d", "e");
		    NavigableSet<String> set = new TreeSet<String>(list);
		    
		    Iterator<String> iter = set.descendingIterator();
		    StringBuilder sb = new StringBuilder("Set: ");
		    while (iter.hasNext()) {
		      String m = iter.next();
		      sb.append(m + " ");
		    }
		    System.out.println(sb);
		    System.out.println("Less c: " + set.lower("c"));
		    System.out.println("Greater c: " + set.higher("c"));
		    
		    
		    
		  }
}
