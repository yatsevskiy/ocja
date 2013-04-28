package k;

public class D {
	public static void main(String[] args) {

		 f(-1);
		 f(-1 >>> 1);
		 f(-1 >> 1);
		 f(-1 << 1);

		double d1 = 1024.0d;
		double d2 = 1.0e-12d;
		double sum = d1 + d2;

		if (sum > d1) {
			System.out.println(">");
		} else if (sum < d1) {
			System.out.println("<");
		} else if (sum == d1) {
			System.out.println("==");
		}

		Boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		if ((b1 & b2) | (b2 & b3) & b3)
			System.out.print("alpha ");
		if ((b1 = false) | (b1 & b3) | (b1 | b2))
			System.out.print("beta ");

		byte b = 1;
		char c = 1;
		short s = 1;
		int i = 1;

		s += i;
		b <<= s;
		i = b << s;
//		s = b * 2;
//		c = c + b;
		
		

	}

	private static void f(int a) {
		System.out.println(String.format("%32s", Integer.toBinaryString(a))
				.replace(' ', '0'));
	}
}

class ClassA<U> implements Comparable<U> {
	public int compareTo(U a) {
		return 0;
	}
}

class InnerExample {
	class Inner {
		static final int x = 3;
		// static int y = 4;
	}

	static class Nested {
		static int z = 5;
	}
}

