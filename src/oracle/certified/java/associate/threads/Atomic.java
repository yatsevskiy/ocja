package oracle.certified.java.associate.threads;

class Atom implements Runnable {

	Object mutex = new Object();

	int count;

	Thread f;
	Thread s;

	void dumpState(String tag) {
		System.out.println(tag);
		System.out.println(f.getName() + ": " + f.getState());
		System.out.println(s.getName() + ": " + s.getState());
	}

	@Override
	public void run() {

		for (int i = 0; i < Atomic.COUNT; ++i) {
			++count;
		}
	}
}

public class Atomic {

	static final int COUNT = 100000000;

	public static void main(String[] args) {

		long s = System.currentTimeMillis();

		Atom atom = new Atom();

		(atom.f = new Thread(atom)).start();
		(atom.s = new Thread(atom)).start();

		try {
			atom.f.join();
			atom.s.join();
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}

		if (atom.f.getState() != Thread.State.TERMINATED
				&& atom.s.getState() != Thread.State.TERMINATED)
			throw new RuntimeException();

		if (atom.count != COUNT * 2) {
			throw new RuntimeException(atom.count + " but expected result was "
					+ COUNT * 2 + ", Integer.MAX_VALUE: " + Integer.MAX_VALUE);
		} else {
			System.out.println("done");
		}

		System.out.println(System.currentTimeMillis() - s + " ms");

	}

}
