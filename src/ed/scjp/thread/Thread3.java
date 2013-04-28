package ed.scjp.thread;

public class Thread3
{
    public static void main(String[] args)
    {
        Worker w = new Worker();

        for (int i = 0; i < 10; i++)
        {
            new MyThread(w).start();
        }
    }
}

class MyThread extends Thread
{
    private Worker mW;

    public MyThread(Worker w)
    {
        mW = w;
    }

    @Override
    public void run()
    {
        mW.doWork();
    }
}

class Worker
{
    private boolean ready;

    public synchronized void doWork()
    {
        if (!ready)
        {
            try
            {
                wait();
            }
            catch (InterruptedException e)
            {
                //
            }
        }
    }
}
