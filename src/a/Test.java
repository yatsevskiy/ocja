package a;
interface I_0 {

}

interface I_1 extends I_0 {

}

interface I_2 extends I_1 {

}

class C_0 implements I_2 {

}

class C_1 extends C_0 {

}

class C_2 extends C_1 {

}

public class Test {

    public static void main(String[] args) {

        I_0 i = new C_2();

        // class - implementation

        if (i.getClass() == I_0.class) {
            System.out.println("I_0.class");
        }

        if (i.getClass() == I_1.class) {
            System.out.println("I_1.class");
        }

        if (i.getClass() == I_2.class) {
            System.out.println("I_2.class");
        }

        if (i.getClass() == C_0.class) {
            System.out.println("C_0.class");
        }

        if (i.getClass() == C_1.class) {
            System.out.println("C_1.class");
        }

        if (i.getClass() == C_2.class) {
            System.out.println("C_2.class");
        }

        if (i.getClass().equals(I_0.class)) {
            System.out.println("I_0.class");
        }

        if (i.getClass().equals(I_1.class)) {
            System.out.println("I_1.class");
        }

        if (i.getClass().equals(I_2.class)) {
            System.out.println("I_2.class");
        }

        if (i.getClass().equals(C_0.class)) {
            System.out.println("C_0.class");
        }

        if (i.getClass().equals(C_1.class)) {
            System.out.println("C_1.class");
        }

        if (i.getClass().equals(C_2.class)) {
            System.out.println("C_2.class");
        }

        // interface - type

        if (i instanceof I_0) {
            System.out.println("I_0");
        }

        if (i instanceof I_1) {
            System.out.println("I_1");
        }

        if (i instanceof I_2) {
            System.out.println("I_2");
        }

        if (i instanceof C_0) {
            System.out.println("C_0");
        }

        if (i instanceof C_1) {
            System.out.println("C_1");
        }

        if (i instanceof C_2) {
            System.out.println("C_2");
        }

    }

}
