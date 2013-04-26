package oracle.certified.java.associate.init;

import java.util.Arrays;
import java.util.List;

public class AsList {

	public static void main(String[] args) {
		
		class item {
			String name = "s";
		}

		item item = new item();
		
		item.name = "w";
		
		item[] a = new item[]{item};
		System.out.println(a[0].name);
		List<item> l = Arrays.asList(a);
		System.out.println(l.get(0).name);
		
	}

}
