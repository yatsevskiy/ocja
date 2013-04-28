package oracle.certified.java.associate.threads;

class Env implements Runnable {

    Object mutex = new Object();

    boolean sleep = true;

    Thread f;
    Thread s;

    void dumpState(String tag) {
        System.out.println(tag);
        System.out.println(f.getName() + ": " + f.getState());
        System.out.println(s.getName() + ": " + s.getState());
    }

    @Override
    public void run() {

        synchronized (mutex) {
            if (sleep) {
                sleep = false;

                try {
                    dumpState("1.0");
                    mutex.wait();
                    dumpState("1.1");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } else {
                dumpState("2.0");
                mutex.notifyAll();
                try {
                    dumpState("2.1");
                    mutex.wait(10000);
                    dumpState("2.2");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

public class Synchronized {

    public static void main(String[] args) {

        Env env = new Env();

        (env.f = new Thread(env)).start();
        (env.s = new Thread(env)).start();

    }
}
