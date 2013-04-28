package k;

public class Main {
	public static void main(String[] args) {

		Correct c = new Correct();
		c.f(1, 1);

		Wrong w = new Wrong();
		//w.f(1, 1); // Compiler error  

	}
}

class Correct {

	public void f(int b, Integer a) {
		System.out.println("int, Integer");
	}

	public void f(long b, Integer a) {
		System.out.println("long, Integer");
	}

}

class Wrong {

	public void f(int b, Integer a) {
		System.out.println("int, Integer");
	}

	public void f(Integer b, long a) {
		System.out.println("Integer, long"); //ambiguous
	}

}
