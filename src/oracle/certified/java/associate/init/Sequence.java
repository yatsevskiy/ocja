package oracle.certified.java.associate.init;

import java.util.ArrayList;

public class Sequence {

    {
        new Observer("Initialization Block 1");
    }

    static Observer static_observer1 = new Observer("Static Field 1");

    static {
        new Observer("Static Initialization Block 1");
    }

    Observer observer = new Observer("Field 1");

    static Observer static_observer2 = new Observer("Static Field 2");

    public Sequence() {
        new Observer("Constructor");
    }

    {
        new Observer("Initialization Block 2");
    }

    public static void main(String[] args) {
        new Observer("main");
        new Sequence();
    }

    static {
        new Observer("Static Initialization Block 2");
    }

    static Observer static_final_observer1 = new Observer("Static Final Field 1");
    static Observer static_final_observer2 = new Observer("Static Final Field 1");
}
