package edu.reflaction.instance;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class A {

	interface Foo {
		int foo();
	}

	static class H implements InvocationHandler {
		@Override
		public Object invoke(Object proxy, Method method, Object[] args)
				throws Throwable {

			System.out.println(proxy.getClass());
			System.out.println(method);
			System.out.println(args);

			return 100;
		}
	}

	public static void main(String[] args) throws IllegalArgumentException,
			SecurityException, InstantiationException, IllegalAccessException,
			InvocationTargetException, NoSuchMethodException {

		Foo f0 = (Foo) Proxy
				.getProxyClass(Foo.class.getClassLoader(),
						new Class<?>[]{Foo.class})
				.getConstructor(new Class<?>[]{InvocationHandler.class})
				.newInstance(new Object[]{new H()});

		Foo f1 = (Foo) Proxy.newProxyInstance(Foo.class.getClassLoader(),
				new Class<?>[]{Foo.class}, new H());

		System.out.println(f0.foo());
		System.out.println(f1.foo());

	}

}
