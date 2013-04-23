package oracle.certified.java.associate.topics.classes;

public class Test1 {

	int out;

	public class Inner {

		// static int i;//compile error
		static final int j = 0;

		public void bar() {
			++out;
		}

	}

	public static class Nested {
		static int i;
		static final int j = 0;

		public void bar() {
			// ++out;
		}
	}

	public void foo() {

		int locat = 0;
		final int const_locat = 0;

		new Object() {
			// static int i;
			static final int j = 0;

			public void bar() {
				++out;
				// ++locat;
				System.out.println(const_locat);
			}

		};

		class Local {
			// static int i;
			static final int j = 0;

			public void bar() {
				++out;
				// ++locat;
				System.out.println(const_locat);
			}
		}
	}

	public static void main(String[] args) {
	}

}
