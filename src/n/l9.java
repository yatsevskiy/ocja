package n;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.Formatter;
import java.util.Locale;
import java.util.NavigableMap;
import java.util.Scanner;
import java.util.TreeMap;

public class l9 {
	class A {
		private void act() {
		};
	}

	class B extends A {
		protected void act() {
		};
	}

	class C extends B {
		public void act() {
		};
	}

	class D extends B {
		// void act(){};
	}

	public static void main(String[] args) {
		A obj = new l9().new D();

		// -------------
		// -------------
		// -------------
		// -------------

		Formatter formatter = new Formatter();
		System.out.println(formatter.format("%b|%b|%b|%b|%b", true, null,
				"false", new Boolean("false"), 0));

		// -------------
		// -------------
		// -------------
		// -------------

		try {
			formatter = new Formatter("text.txt", "UTF-8", new Locale("ru"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		formatter.format("%n%d", new Integer("1500"));
		formatter.flush();
		formatter.close();

		// -------------
		// -------------
		// -------------
		// -------------

		TreeMap<String, Integer> myMap = new TreeMap<String, Integer>();
		myMap.put("ab", 1);
		myMap.put("ca", 2);
		myMap.put("ba", 3);
		NavigableMap<String, Integer> myMap1 = myMap.headMap("da", true);
		myMap.put("ea", 4);
		myMap1.put("bc", 5);
		System.out.println(myMap.size() + " " + myMap1.size());

		// -------------
		// -------------
		// -------------
		// -------------


		byte b = 0;

		byte c = (--b < 0) ? ++b : (byte) -b;

		Scanner s = new Scanner("e 44 nky 09 rp d 5 c");
		s.useDelimiter("\\d");

		while (s.hasNext())
			System.out.println(s.next());

		Clone clone1 = new Clone();

		Clone clone2 = null;
		try {
			clone2 = (Clone) clone1.clone();
		} catch (CloneNotSupportedException e) {
		}

		
		System.out.println(clone1);
		System.out.println(clone2);
	}

}


class Clone implements Cloneable {

	@Override
	public int hashCode() {
		return 0;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

