package oracle.certified.java.associate.init;

import java.util.Vector;

public class dfd {
    static int b = dfd.a;
    static int a = 3;
    static {
       System.out.println("a=" + a + ", b=" + b);
    }
    
    public static void main(String[] args) {
        
    }
}
