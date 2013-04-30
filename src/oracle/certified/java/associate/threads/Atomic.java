package oracle.certified.java.associate.threads;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

abstract class Atom implements Runnable {

    public abstract int getCount();
}

class Broken extends Atom {

    private int count;

    public int getCount() {
        return count;
    }

    @Override
    public void run() {

        for (int i = 0; i < Atomic.COUNT; ++i) {
            ++count;
        }
    }
}

class Unsafe extends Atom {

    private volatile int count;

    public int getCount() {
        return count;
    }

    @Override
    public void run() {

        for (int i = 0; i < Atomic.COUNT; ++i) {
            ++count;
        }
    }
}

class Locked extends Atom {

    private int count;

    public int getCount() {
        synchronized (this) {
            return count;
        }
    }

    @Override
    public void run() {

        for (int i = 0; i < Atomic.COUNT; ++i) {
            synchronized (this) {
                ++count;
            }
        }
    }
}

class Safe extends Atom {

    private final AtomicInteger count = new AtomicInteger();

    public int getCount() {
        return count.get();
    }

    @Override
    public void run() {

        for (int i = 0; i < Atomic.COUNT; ++i) {
            count.incrementAndGet();
        }
    }
}

public class Atomic {

    static final int COUNT = 100000000;
    private static final int THREDS = 1;
    private static final int EXPECTED_RESULT = COUNT * THREDS;

    public static void main(String[] args) {

        ArrayList<Atom> atoms = new ArrayList<Atom>();
        atoms.add(new Broken());
        atoms.add(new Unsafe());
        atoms.add(new Safe());
        atoms.add(new Locked());

        for (Atom atom : atoms) {

            long s = System.currentTimeMillis();
            ArrayList<Thread> threads = new ArrayList<Thread>();
            for (int i = 0; i < THREDS; ++i) {
                threads.add(new Thread(atom));
            }

            for (Thread thread : threads) {
                thread.start();
            }

            for (Thread thread : threads) {
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException();
                }
            }

            for (Thread thread : threads) {
                if (thread.getState() != Thread.State.TERMINATED) {
                    throw new RuntimeException();
                }
            }
            System.out.print(atom.toString() + ": " + (System.currentTimeMillis() - s)
                    + " ms; ");

            if (atom.getCount() != EXPECTED_RESULT) {
                System.out.println("Result " + atom.getCount() + " but expected "
                        + EXPECTED_RESULT);
            } else {
                System.out.println("done");
            }
        }
    }
}
