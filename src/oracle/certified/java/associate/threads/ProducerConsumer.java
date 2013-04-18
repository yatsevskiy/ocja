package oracle.certified.java.associate.threads;

import java.util.LinkedList;
import java.util.Queue;


public class ProducerConsumer
{
    private Semaphore empty = new Semaphore(5, "Producer sleeping");
    private Semaphore mutex = new Semaphore(1);
    private Semaphore full = new Semaphore(0, "Consumer sleeping");

    private Queue<Integer> buf = new LinkedList<Integer>();

    private void sleep() {
        try
        {
            Thread.sleep((int)(Math.random() * 10) * 100);
        }
        catch (InterruptedException e)
        {
            System.err.println(e.getMessage());
        }
    }

    public class Producer implements Runnable
    {
    private int id;
    public Producer(int id){this.id = id;}
    public void run()
    {
        int item = 0;

        while (true)
        {
            sleep();

            empty.lock();
            mutex.lock();
            buf.offer(Integer.valueOf(item));
            System.out.println("Producer "+id+" added " + item);
            item++;
            mutex.unlock();
            full.unlock();
        }
    }
    }

    public class Consumer implements Runnable
    {
    private int id;
    public Consumer(int id){this.id = id; }
    public void run()
    {
        while (true)
        {
            full.lock();
            mutex.lock();
            Integer item = buf.poll();;
            System.out.println("Consumer " + id + " removed " + item);
            mutex.unlock();
            empty.unlock();
            
            sleep();
        }
    }
    }


    public ProducerConsumer(int consumersCount, int producersCount)
    {
    for (int i = 0; i < consumersCount; ++i){
        new Thread(new Consumer(i)).start();
     }
    for (int i = 0; i < producersCount; ++i) {
        new Thread(new Producer(i)).start();
    }
    }

    public static void main(String[] args)
    {
    new ProducerConsumer(5,5);
    }
}