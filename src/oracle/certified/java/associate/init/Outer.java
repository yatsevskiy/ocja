package oracle.certified.java.associate.init;

import java.lang.reflect.Method;

public class Outer {

	private int pri0 = 0;
	private int pri1 = 0;
	private int pri2 = 0;
	private int pri3 = 0;
	int def = 0;
	protected int pro = 0;
	public int pub = 0;

	class Inner {
		void access() {
			pri0=0;
			pri1=0;
			pri2=0;
			pri3=0;
			
			System.out.println(pri0);
			System.out.println(pri1);
			System.out.println(pri2);
			System.out.println(pri3);
			
			System.out.println(def);
			System.out.println(pro);
			System.out.println(pub);
		}
	}

	public static void main(String[] args) {
		Outer.Inner in = new Outer().new Inner();
		in.access();

		for (Method m : Outer.class.getDeclaredMethods()) {
			System.out.println(m);
		}
	}
}
