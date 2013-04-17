package oracle.certified.java.associate.threads;

import java.util.*;


public class ProducerConsumer
{

    private Buffer b;
    private Semaphore full, empty, mutex;


    public static class Buffer
    {
    private Queue<Integer> buf;
    public Buffer()
    {
        buf = new LinkedList<Integer>();
    }

    public Integer remove()
    {
        return buf.poll();
    }

    public void add(Integer item)
    {
        buf.offer(item);
    }
    }
    
    private void sleep() {
        try
        {
            Thread.sleep((int)(Math.random() * 10) * 100);
        }
        catch (InterruptedException e)
        {
        }
    }

    public class Producer implements Runnable
    {
    private int id;
    public Producer(int n){id = n;}
    public void run()
    {
        int item = 0;

        while (true)
        {
            sleep();

            empty.lock();
            mutex.lock();
            b.add(Integer.valueOf(item));
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
    public Consumer(int i){id = i; }
    public void run()
    {
        while (true)
        {
            full.lock();
            mutex.lock();
            Integer item = b.remove();
            System.out.println("Consumer " + id + " removed " + item);
            mutex.unlock();
            empty.unlock();
            
            sleep();
        }
    }
    }


    public ProducerConsumer(int consumers, int producers)
    {
    b = new Buffer();
    empty = new Semaphore(5, "Producer sleeping");
    mutex = new Semaphore(1, null);
    full = new Semaphore(0, "Consumer sleeping");
    
    for (int i = 0; i < consumers; i++){
        new Thread(new Consumer(i)).start();
     }
    for (int i = 0; i < producers; i++) {
        new Thread(new Producer(i)).start();
    }
    }

    public static void main(String[] args)
    {
    new ProducerConsumer(5,5);
    }
}