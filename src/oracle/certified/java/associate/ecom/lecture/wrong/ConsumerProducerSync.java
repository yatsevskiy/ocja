package oracle.certified.java.associate.ecom.lecture.wrong;


import java.util.*;
import java.io.*;

// We would like to synchronize producer and consumer so that
// producer puts a number in the buffer, then the consumer takes it
// out, then the producer puts another number, and so on.

// This solution does not provide this kind of synchronization

public class ConsumerProducerSync {

  public static void main (String [] args) {
    Buffer buf = new Buffer();
    
    // create new threads
    Thread prod = new Producer(10, buf);
    Thread cons = new Consumer(10, buf);
    
    // starting threads
    prod.start();
    cons.start();
    
    // Wait for the threads to finish
    try {
    	prod.join();
    	cons.join();
    } catch (InterruptedException e) {return;}
  }
 
} 

class Buffer {
  		private int contents;
  		
  		public synchronized void put (int i)  { 
  			contents = i;
  			System.out.println("Producer: put..." + contents);
  		} 
  		
  		public synchronized int get () {
  			int val = contents;
  			System.out.println("Consumer: got..." + val);
  			return val;
  		}
}


 class Producer extends Thread {
  	private int n;
  	private Buffer prodBuf;
  	
  	public Producer (int m, Buffer buf) {
  		n = m;
  		prodBuf = buf;
    }
    
    public void run() {
    	for (int i = 0; i < n; i++) {
    		try {
    			Thread.sleep( (int) Math.random() * 100); // sleep for a randomly chosen time
    		} catch (InterruptedException e) {return;}
    		
    		
    	    prodBuf.put(i + 1); //starting from 1, not 0
    		
    	}
    }
  }

 class Consumer extends Thread {
  	private int n;
  	private Buffer consBuf;
  	
  	public Consumer (int m, Buffer buf) {
  		n = m;
  		consBuf = buf;
    }
    
    public void run() {
    	int value;
    	for (int i = 0; i < n; i++) {
    		value = consBuf.get();
    		try {
    			Thread.sleep( (int) Math.random() * 100); // sleep for a randomly chosen time
    		} catch (InterruptedException e) {return;}
    		
    	}
    }
  }



