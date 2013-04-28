package ed.scjp.thread;

public class Thread1
{
    public static void main(String[] args)
    {
        Thread11 t = new Thread11();
        t.start();
        t.doSomething();
    }
}

class Thread11 extends Thread
{
    public void doSomething()
    {
        System.out.println("in doSomething() method. Current thread is " + Thread.currentThread());
        try
        {
            join();
        }
        catch (InterruptedException e)
        {
            //
        }

        System.out.println("doSomething() method was invoked. Current thread is " + Thread.currentThread());
    }

    public void run()
    {
        System.out.println("in run() before go sleep. Current thread is " + Thread.currentThread());

        try
        {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            //
        }

        System.out.println("run() method was invoked. Current thread is " + Thread.currentThread());
    }
}
