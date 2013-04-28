package m;

public class l11 {
	public static void main(String[] args) {
		t(new A());
		t(new B());
	}

	private static void t(A a) {
		// System.out.println(a.non_static_private);
		System.out.println(a.non_static_default);
		System.out.println(a.non_static_protected);
		System.out.println(a.non_static_public);

		System.out.println("---");

		// System.out.println(a.non_static_private());
		System.out.println(a.non_static_default());
		System.out.println(a.non_static_protected());
		System.out.println(a.non_static_public());

		System.out.println("---");

		// System.out.println(a.static_private);
		System.out.println(a.static_default);
		System.out.println(a.static_protected);
		System.out.println(a.static_public);

		System.out.println("---");

		// System.out.println(a.static_private());
		System.out.println(a.static_default());
		System.out.println(a.static_protected());
		System.out.println(a.static_public());

		System.out.println("---");
	}
}

class A {
	static private String static_private = "A::static_private";
	static String static_default = "A::static_default";
	static protected String static_protected = "A::static_protected";
	static public String static_public = "A::static_public";

	static private String static_private() {
		return "A::static_private()";
	}

	static String static_default() {
		return "A::static_default()";
	}

	static protected String static_protected() {
		return "A::static_protected()";
	}

	static public String static_public() {
		return "A::static_public()";
	}

	private String non_static_private = "A::non_static_private";
	protected String non_static_protected = "A::non_static_protected";
	String non_static_default = "A::non_static_default";
	public String non_static_public = "A::non_static_public";

	private String non_static_private() {
		return "A::non_static_private()";
	}

	String non_static_default() {
		return "A::non_static_default()";
	}

	protected String non_static_protected() {
		return "A::non_static_protected()";
	}

	public String non_static_public() {
		return "A::non_static_public()";
	}

}

class B extends A {

	static private String static_private = "B::static_private";
	static String static_default = "B::static_default";
	static protected String static_protected = "B::static_protected";
	static public String static_public = "B::static_public";

	static private String static_private() {
		return "B::static_private()";
	}

	static String static_default() {
		return "B::static_default()";
	}

	static protected String static_protected() {
		return "B::static_protected()";
	}

	static public String static_public() {
		return "B::static_public()";
	}

	private String non_static_private = "B::non_static_private";
	String non_static_default = "B::non_static_default";
	protected String non_static_protected = "B::non_static_protected";
	public String non_static_public = "B::non_static_public";

	private String non_static_private() {
		return "B::non_static_private()";
	}

	@Override
	String non_static_default() {
		return "B::non_static_default()";
	}

	@Override
	protected String non_static_protected() {
		return "B::non_static_protected()";
	}

	@Override
	public String non_static_public() {
		return "B::non_static_public()";
	}

}
