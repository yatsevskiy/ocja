package performance.tips;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Invocation {

	long count;

	long _public;
	long _protected;
	long _default;
	long _private;

	public void _public() {
		++count;
	}
	protected void _protected() {
		++count;
	}
	void _default() {
		++count;
	}
	private void _private() {
		++count;
	}

	static final int COUNT = 20000000;

	public static void main(String[] args) {
		Invocation invocation = new Invocation();

		method(invocation);

		field(invocation);

		reflaction(invocation);

	}
	private static void field(Invocation invocation) {
		long s;
		s = System.currentTimeMillis();
		for (int i = 0; i < COUNT; ++i) {
			++invocation._public;
		}
		System.out.println("public field: " + (System.currentTimeMillis() - s)
				+ " ms");

		s = System.currentTimeMillis();
		for (int i = 0; i < COUNT; ++i) {
			++invocation._protected;
		}
		System.out.println("protected field: "
				+ (System.currentTimeMillis() - s) + " ms");

		s = System.currentTimeMillis();
		for (int i = 0; i < COUNT; ++i) {
			++invocation._default;
		}
		System.out.println("default field: " + (System.currentTimeMillis() - s)
				+ " ms");

		s = System.currentTimeMillis();
		for (int i = 0; i < COUNT; ++i) {
			++invocation._private;
		}
		System.out.println("private field: " + (System.currentTimeMillis() - s)
				+ " ms");
	}
	private static void method(Invocation invocation) {
		long s;
		s = System.currentTimeMillis();
		for (int i = 0; i < COUNT; ++i) {
			invocation._public();
		}
		System.out.println("public method: " + (System.currentTimeMillis() - s)
				+ " ms");

		s = System.currentTimeMillis();
		for (int i = 0; i < COUNT; ++i) {
			invocation._protected();
		}
		System.out.println("protected method: "
				+ (System.currentTimeMillis() - s) + " ms");

		s = System.currentTimeMillis();
		for (int i = 0; i < COUNT; ++i) {
			invocation._default();
		}
		System.out.println("default method: "
				+ (System.currentTimeMillis() - s) + " ms");

		s = System.currentTimeMillis();
		for (int i = 0; i < COUNT; ++i) {
			invocation._private();
		}
		System.out.println("private method: "
				+ (System.currentTimeMillis() - s) + " ms");
	}
	private static void reflaction(Invocation invocation) {
		long s;
		Method _public;
		try {
			_public = Invocation.class.getDeclaredMethod("_public");
		} catch (SecurityException e) {
			throw new RuntimeException(e);
		} catch (NoSuchMethodException e) {
			throw new RuntimeException(e);
		}

		try {
			s = System.currentTimeMillis();
			for (int i = 0; i < COUNT; ++i) {
				_public.invoke(invocation);
			}
			System.out.println("public method[ref]: "
					+ (System.currentTimeMillis() - s) + " ms");
		} catch (IllegalArgumentException e) {
			throw new RuntimeException(e);
		} catch (IllegalAccessException e) {
			throw new RuntimeException(e);
		} catch (InvocationTargetException e) {
			throw new RuntimeException(e);
		}
	}

}
