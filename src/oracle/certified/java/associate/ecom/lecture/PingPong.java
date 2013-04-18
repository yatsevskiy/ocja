package oracle.certified.java.associate.ecom.lecture;

import java.io.*;
import java.util.*;

public class PingPong extends java.lang.Thread {
    private String word; // word to print
    private int delay;

    // constructor:
    public PingPong (String whatToSay, int delayTime) {
	word = whatToSay;
	delay = delayTime;
    }

    public void run() {
	try {
	    while(true) {
		System.out.print(word + " ");
		Thread.sleep(delay); // class method
	    }
	} catch (java.lang.InterruptedException ex) {return;}
    }

    public static void main (String args[]) {
	PingPong ping = new PingPong("ping", 300); 
	PingPong pong = new PingPong("PONG", 1000);
	ping.start();
	pong.start();
    }
}
