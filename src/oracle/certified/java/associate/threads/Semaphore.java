package oracle.certified.java.associate.threads;


public class Semaphore
{

    private int value;

    private int waiting;

    private String message;

    public Semaphore(int value, String message)
    {
    this.value = value;
    this.message = message;
    }

    public Semaphore(int value) {
        this.value = value;
    }

    public synchronized void lock()
    {
    if (value > 0)
        {
        value--;
        }
    else
        {
        try
            {
            waiting++;
            if (message != null) {
                System.err.println(message);
            }
            wait();
            }
        catch (InterruptedException e)
            {
            System.err.println(e.getMessage());
            }
        }
    }

    public synchronized void unlock()
    {
    if (waiting > 0)
        {
        notify();
        waiting--;
        }
    else
        {
        value++;
        }
    }
}