package X;

public class X<X> {
	X X;

	public X() {
	}

	public X(X X) {
		this.X = X;
	}

	public <Y extends X> Y Y(Y y) {
		return y;
	}
}

class Y<Y extends X> extends X {

	private static Integer Y = 5;

	public static void main(String... X) {
		System.out.print(new X().Y(Y).toString());
	}
}
