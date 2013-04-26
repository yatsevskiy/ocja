package oracle.certified.java.associate.init;

import java.util.Vector;

public class Init {
    static Vector<Integer> v = new Vector<Integer>();
    { v.add(7); }
    static { v.add(5); }
    static { v = new Vector() { { add(8); addAll(v); addAll(this); } }; }
    public static void main(String[] args) {
        System.out.println(new Init().v);
    }
}