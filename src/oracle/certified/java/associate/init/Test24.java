package oracle.certified.java.associate.init;

public class Test24 {
private static final Object[] lock = { "Zero", new Integer(1), Double.valueOf(2) };

static void notifyAndPrint(int who, int what) {
synchronized (lock[who]) {
System.out.print(what);
lock[who].notifyAll();
}
}

public static void main(String[] args) throws InterruptedException {
synchronized (lock[0]) {
synchronized (lock[1]) {
synchronized (lock[2]) {
new First().start();
new Second().start();
lock[0].wait();
lock[2].wait();
}
lock[1].wait();
}
notifyAndPrint(0, 1);
}
}

static class First extends Thread {
public void run() {
notifyAndPrint(0, 2);
notifyAndPrint(1, 3);
}
}

static class Second extends Thread {
public void run() {
notifyAndPrint(2, 4);
notifyAndPrint(0, 5);
}
}

}