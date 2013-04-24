package oracle.certified.java.associate.overload;

public class Test1 {
	static void methodA(Long l) {
		System.out.println(l);
	}

	static void methodB(Object o) {
		Byte b = (Byte) o;
		System.out.println(b);
	}

	public static void main(String[] args) {
		byte b = 5;

		// methodA(b); // 1
		methodB(b); // 2
	}
}
