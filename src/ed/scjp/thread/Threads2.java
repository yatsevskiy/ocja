package ed.scjp.thread;

import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

public class Threads2
{
    public static void main(String[] args)
    {
        Thread[] threads = new Thread[10];

        int[] sharedData = {
            0
        };

        for (int i = 0; i < threads.length; i++)
        {
            threads[i] = new Thread21(sharedData);
            threads[i].start();
        }

        for (int i = 0; i < threads.length; i++)
        {
            try
            {
                threads[i].join();
            }
            catch (InterruptedException e)
            {
                //
            }
        }
    }
}

class Thread21 extends Thread
{
    private int[] mData;

    static ReentrantLock lock = new ReentrantLock();

    public Thread21(int[] data)
    {
        mData = data;
    }

    @Override
    public void run()
    {
        lock.lock();
        // synchronized (mData)
        {
            int data = mData[0];

            try
            {
                sleep(new Random().nextInt(100));
            }
            catch (InterruptedException e)
            {
                //
            }

            data = data + 1;
            mData[0] = data;
        }

        lock.unlock();
    }
}
