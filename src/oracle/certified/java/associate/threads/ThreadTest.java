package oracle.certified.java.associate.threads;

class Checker implements Runnable {
    private Data data;
    public Checker(Data data){
        this.data = data;
    }
    public void run(){
        while(true){
            int t = data.get();
            if(t % 4 != 0){
                System.out.println("ERROR");
            }
        }
    }
}

class Changer implements Runnable {
    private Data data;
    public Changer(Data data){
        this.data = data;
    }
    public void run(){
        while(true){
            data.increment();
        }
    }
}

class Data {
    private int i;
    public synchronized void increment(){
        i++;
        i++;
        i++;
        i++;
        if(i > 1000){
            i = 0;
        }
    }
    public int get(){
        return i;
    }
}

public class ThreadTest {
    public static void main(String args[]){
        Data data = new Data();
        Runnable checker = new Checker(data),
                 changer = new Changer(data);

        new Thread(checker).start();
        new Thread(changer).start();
    }
}