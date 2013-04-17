package oracle.certified.java.associate.threads;

import java.util.*;


public class ProducerConsumer
{

    private Buffer b;
    private Semaphore full, empty, mutex;


    public static class Buffer
    {
    private Queue<Integer> buf;
    public Buffer(int n)
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


    public class Producer implements Runnable
    {
    private int id;

    public Producer(int n)
    {
        id = n;
    }

    public void run()
    {
        int i = 0;

        while (true)
        {
            try
            {
                Thread.sleep((int)(Math.random() * 10) * 100);
            }
            catch (InterruptedException e)
            {
            }

            empty.lock();
            mutex.lock();
            b.add(new Integer(i));
            System.out.println("Producer "+id+" added " + i);
            i++;
            mutex.unlock();
            full.unlock();
        }
    }
    }


    public class Consumer implements Runnable
    {

    private int id;

    public Consumer(int i)
    {
        id = i;
    }


    public void run()
    {
        while (true)
        {

            full.lock();
            mutex.lock();
            Integer item = (Integer)(b.remove());
            System.out.println("Consumer " + id + " removed " + item);
            mutex.unlock();
            empty.unlock();
            
            try
            {
                Thread.sleep((int)(Math.random() * 10) * 100);
            }
            catch (InterruptedException e)
            {
            }
        }
    }
    }


    public ProducerConsumer(int items, int bufferSize, int consumers)
    {
    b = new Buffer(bufferSize);
    empty = new Semaphore(bufferSize, "Producer sleeping");
    mutex = new Semaphore(1, null);
    full = new Semaphore(0, "Consumer sleeping");
    
    for (int id = 0; id < consumers; id++)
        {
        Thread t = new Thread(new Consumer(id));
        t.start();
        }

    (new Thread(new Producer(items))).start();
    }


    public static void main(String[] args)
    {
    if (args.length < 1)
        {
        System.err.println("USAGE: java buffer-size");
        System.exit(1);
        }

    int bufferSize = Integer.parseInt(args[0]);
    int consumers = 1;

    new ProducerConsumer(0, bufferSize, consumers);
    }
}