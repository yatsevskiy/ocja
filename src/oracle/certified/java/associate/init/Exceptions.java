package oracle.certified.java.associate.init;

public class Exceptions {

	public static void main(String[] args) {
		
		byte b = 1;
		char c = 1;
		short s = 1;
		int i = 1;
		
		i = b << s;
		s +=i;
		b <<=s;
//		s=b*2;
//		c=c+b;
		
	}
	
	void m1(){throw new ArithmeticException();}
	void m2(){throw new ClassCastException();}
	void m3(){throw new IllegalArgumentException();}
	void m4(){throw new IndexOutOfBoundsException();}
	void m5(){throw new NullPointerException();}
	void m6(){throw new SecurityException();}

}


class Error {
	public static void main(String[] args) {
		
	}
}