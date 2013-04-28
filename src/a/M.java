package a;


import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class M {
	public static void main(String[] args) {
		TreeSet<Foo> t = new TreeSet<Foo>();
		Random r = new Random(47);
		for (int i = 0; i < 10; i++)
			t.add(new Foo(r.nextInt(10)));

		Iterator<Foo> it = t.iterator();
		for (; it.hasNext();)
			System.out.println(it.next());
	}
}

// class Foo<T> implements Comparable<T> {
class Foo implements Comparable<Foo> {

	public Foo(int x) {
		super();
		// System.out.println(x);
		this.x = x;
	}

	private final int x;

	@Override
	public int compareTo(Foo o) {
		return x - o.x;
	}

	@Override
	public String toString() {
		return String.valueOf(x);
	}
}
