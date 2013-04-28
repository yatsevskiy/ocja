package a;
public class CountingThread extends Thread {
    private int _initialCount;
    private int _millisBetweenCount;
    private CountingListener _listener;
    private boolean _stopCounting = false;
    private boolean _hardAbort = false;

    /**
     * Initializes a counting thread.
     * 
     * @param listener
     *            a counting listener for the thread.
     * @param initialCount
     *            the initial counter of the thread.
     * @param millisBetweenCount
     *            milliseconds between counter subtraction.
     */
    public CountingThread(CountingListener listener, int initialCount,
            int millisBetweenCount) {
        _listener = listener;
        _initialCount = initialCount;
        _millisBetweenCount = millisBetweenCount;
    }

    @Override
    public void run() {
        int counter = _initialCount;

        _listener.onCountBegin(counter);

        while (!_stopCounting && counter > 0) {
            try {
                Thread.sleep(_millisBetweenCount);
            } catch (InterruptedException e) {
                // someone wants us out
                _listener.onCountAborted(counter);

                return;
            }

            counter--;
            _listener.onCount(counter);
        }

        if (_stopCounting) {
            if (!_hardAbort) {
                _listener.onCountAborted(counter);
            }
        } else {
            _listener.onCountComplete();
        }
    }

    public static void main(String[] args) {
        new CountingThread(new CountingListener() {
            
        	@Override
            public void onCountComplete() {
                System.out.println("onCountComplete()");
                // TODO Auto-generated method stub
                
            }
            
            @Override
            public void onCountBegin(int counter) {
                System.out.println("onCountBegin("+counter+")");
                // TODO Auto-generated method stub
                
            }
            
            @Override
            public void onCountAborted(int counter) {
                System.out.println("onCountAborted("+counter+")");
                // TODO Auto-generated method stub
                
            }
            
            @Override
            public void onCount(int counter) {
                System.out.println("onCount("+counter+")");
                // TODO Auto-generated method stub
                
            }
        }, 10, 1000).start();
    }

    /**
     * Aborts the counting thread and calls the onCountAborted listener.
     */
    public void abort() {
        _stopCounting = true;

        this.interrupt();
    }

    /**
     * Aborts the counting thread and doesn't call onCountAborted().
     */
    public void hardAbort() {
        _hardAbort = true;

        abort();
    }
}

interface CountingListener {
    /**
     * Fires when counting is starting.
     * 
     * @param counter
     *            current value of the counter.
     */
    public void onCountBegin(int counter);

    /**
     * Fires when counting is being decreased.
     * 
     * @param counter
     *            current value of the counter.
     */
    public void onCount(int counter);

    /**
     * Fires when the counting is complete.
     */
    public void onCountComplete();

    /**
     * Fires if counting has been aborted.
     * 
     * @param counter
     *            the counter value while aborting.
     */
    public void onCountAborted(int counter);
}
