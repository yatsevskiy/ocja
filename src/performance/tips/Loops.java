package performance.tips;

public class Loops {

	static class O {
		int data;
	}

	O[] mO = new O[10000000];

	public Loops() {
		for (int i = 0; i < mO.length; ++i) {
			mO[i] = new O();
		}
	}

	public int f0(int sum) {
		O[] o = mO;
		int length = o.length;
		long s = System.currentTimeMillis();
		for (int i = 0; i < length; ++i) {
			sum += o[i].data;
		}
		System.out.println("f0:" + (System.currentTimeMillis() - s) + " ms");
		return sum;
	}

	public int f1(int sum) {
		long s = System.currentTimeMillis();
		for (O a : mO) {
			sum += a.data;
		}
		System.out.println("f1:" + (System.currentTimeMillis() - s) + " ms");
		return sum;
	}

	public int f2(int sum) {
		long s = System.currentTimeMillis();
		for (int i = 0; i < mO.length; ++i) {
			sum += mO[i].data;
		}
		System.out.println("f2:" + (System.currentTimeMillis() - s) + " ms");
		return sum;
	}

	public static void main(String[] args) {
		Loops l = new Loops();
		l.f0(0);
		l.f1(0);
		l.f2(0);
	}

}
