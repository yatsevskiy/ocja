package k;


public class A2 {

	public static void main(String[] args) {
		// int[][] matrix = { { 1, 2, 3 }, { 0, 0, 0 }, { 3, 2, 1 } };
		//
		// for (int row[] : matrix) {
		// for (int column : row)
		// System.out.print(column + " ");
		// System.out.println();
		// }

		A2 a = new A2();

		a.f(10, 10);
	}

	// void f(int a) {
	// System.out.println("int");
	// }
	//
	// void f(long a) {
	// System.out.println("long");
	// }
	//
	// void f(Integer a) {
	// System.out.println("Integer");
	// }
	//
	// void f(int... a) {
	// System.out.println("int ...");
	// }
	//
	// void f(long... a) {
	// System.out.println("long ...");
	// }
	//
	// void f(Integer... a) {
	// System.out.println("Integer ...");
	// }

//	void f(int b, int a) {
//		System.out.println("int, int");
//		System.out.println("1");
//	}

//	void f(int b, long a) {
//		System.out.println("int, long");
//		System.out.println("2");
//	}

	void f(int b, Integer a) {
		System.out.println("int, Integer");
		System.out.println("4");
		
//	void f(Integer b, int a) {
//	void f(Integer b, long a) {
//	void f(Integer b, Integer a) {
		
	}
	void f(int b, int... a) {
		System.out.println("int, int ...");
	}

	void f(int b, long... a) {
		System.out.println("int, long ...");
	}

	void f(int b, Integer... a) {
		System.out.println("int, Integer ...");
	}

	// -----------------------------------------

//	void f(long b, int a) {
//		System.out.println("long, int");
//		System.out.println("2");
//	}

//	void f(long b, long a) {
//		System.out.println("long, long");
//		System.out.println("3");
//	}

	void f(long b, Integer a) {
		System.out.println("long, Integer");
		System.out.println("5");
	}

	void f(long b, int... a) {
		System.out.println("long, int ...");
	}

	void f(long b, long... a) {
		System.out.println("long, long ...");
	}

	void f(long b, Integer... a) {
		System.out.println("long, Integer ...");
	}

	
	
	
//	void f(Integer b, int a) {
//		System.out.println("Integer, int");
//	}
//
//	void f(Integer b, long a) {
//		System.out.println("Integer, long");
//	}
//
//	void f(Integer b, Integer a) {
//		System.out.println("Integer, Integer");
//	}

	void f(Integer b, int... a) {
		System.out.println("Integer, int ...");
	}

	void f(Integer b, long... a) {
		System.out.println("Integer, long ...");
	}

	void f(Integer b, Integer... a) {
		System.out.println("Integer, Integer ...");
	}

}
