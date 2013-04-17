package oracle.certified.java.associate.threads;

import java.util.*;

/**
 * Demonstration of the producer/consumer problem in Java.  In this
 * example one producer adds items to a fixed-length queue.  Multiple
 * consumers remove items from the queue.
 *
 * Run this with a smallish buffer (3, perhaps) to verify that the
 * producer waits when the buffer is full (you'll see that the items
 * it adds are never too far ahead of what the consumer is getting)
 * and that the consumer waits when it catches up to the producer.
 *
 * @author Jim Glenn
 * @version 0.2 10/22/2007 (semaphore version)
 * @version 0.1 2/10/2004 (Java synchronization version)
 */

public class ProducerConsumer
{
    /**
     * The fixed-length queue for this demonstration.
     */

    private Buffer b;
    private Semaphore full, empty, mutex;

    /**
     * Encapsulates the data and operations on the fixed-length queue.
     */

    public class Buffer
    {
    /**
     * Storage for items on this queue.
     */

    private LinkedList buf;

    /**
     * The number of items currently on this queue.
     */

    private int items;

    /**
     * The maximum number of items that can be on this queue.
     */

    private int size;

    /**
     * Creates a queue that can hold up to the given number of items.
     *
     * @param n the capacity of the new queue
     */

    public Buffer(int n)
    {
        buf = new LinkedList();
        items = 0;
        size = n;
    }

    /**
     * Removes an item from this queue.  If no item is available,
     * the calling thread sleeps until one is available.
     *
     * @return the item removed
     */

    public Object remove()
    {
        Object result = buf.getFirst();
        buf.remove(0);
        items--;
        return result;
    }

    /**
     * Adds an item to this queue.  If there is no more room on the
     * queue, the calling thread sleeps.
     *
     * @param item the item to add
     */

    public void add(Object item)
    {
        buf.add(item);
        items++;
    }
    }

    /**
     * Threads that add items to the queue.
     */

    public class Producer implements Runnable
    {
    /**
     * The number of items for this thread to add.
     */

    private int itemsToAdd;

    /**
     * Creates a producer that will add the given number of items
     * to the queue.  The items will be numbered 0,...,<CODE>n</CODE>-1
     */

    public Producer(int n)
    {
        itemsToAdd = n;
    }

    /**
     * Adds items to the queue.
     */

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

            // code modified from Tanenbaum, p. 112

            empty.down();
            mutex.down();
            b.add(new Integer(i));
            System.out.println("Producer added " + i);
            i++;
            mutex.up();
            full.up();
        }
    }
    }

    /**
     * Threads that remove items from the queue.
     */

    public class Consumer extends Thread
    {
    /**
     * An identifier for this consumer.
     */

    private int id;

    /**
     * Creates a consumer thread with the given id.
     *
     * @param i the id of the new consumer
     */

    public Consumer(int i)
    {
        id = i;
    }

    /**
     * Causes this consumer to start removing things from the queue.
     */

    public void run()
    {
        while (true)
        {
            // code modified from Tanenbaum, p. 112

            full.down();
            mutex.down();
            Integer item = (Integer)(b.remove());
            System.out.println("Consumer " + id + " removed " + item);
            mutex.up();
            empty.up();
            
            try
            {
                sleep((int)(Math.random() * 10) * 100);
            }
            catch (InterruptedException e)
            {
            }
        }
    }
    }

    /**
     * Creates a new example of the producer/consumer problem.
     * The arguments specify the number of items the producer will add,
     * the size of the queue that will hold the items, and the number
     * of consumers that access the queue.
     *
     * @param items the number of items for the producer to add
     * @param bufferSize the size of the fixed-length queue
     * @param consumers the number of consumers to create
     */

    public ProducerConsumer(int items, int bufferSize, int consumers)
    {
    b = new Buffer(bufferSize);
    empty = new Semaphore(bufferSize, "Producer sleeping");
    mutex = new Semaphore(1, null);
    full = new Semaphore(0, "Consumer sleeping");
    
    for (int id = 0; id < consumers; id++)
        {
        Thread t = new Consumer(id);
        t.start();
        }

    (new Thread(new Producer(items))).start();
    }

    /**
     * Creates an instance of the producer/consumer problem given
     * parameters specified on the command line.
     *
     * @param args an array containing the decimal representation of the
     * number of items to add, the size of the queue, and the number
     * of consumers in its first three elements
     */

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