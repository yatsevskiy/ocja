package k;

import java.util.Formatter;

public class Test1 {
	public static void main(String args[]) {
		System.out.println((-(byte) 128) >>> 1 == 128 >>> 1);

		// -128
		// int: 11111111111111111111111110000000
		// to byte 10000000
		// 128
		// int: 10000000

		byte b;

		b = 127;
		b = (byte) (b + 1);

		System.out.println(b);

		b = 127;
		b += 1;

		
		
		System.out.println(b);

		
		
		
		Formatter formatter = new Formatter();
		System.out.println(formatter.format("%b|%b|%b|%b", true,
				new Boolean(null), new Boolean("bool"), 8));
		formatter.close();
		// s != null && s.equalsIgnoreCase("true")

		
		
		
		
		
		System.out.println(-1 == (-1 >> 1));

		System.out.println(-1 >>> 1 == Integer.MAX_VALUE);

		System.out.println((byte) -1 == (byte) (-1 >>> 4));
		
		a a = new b();
		a.foo();

	}
}

class a{public void foo(){System.out.println("a");}}
class b extends a { public void foo(){System.out.println("b");}}
