package n;

class A {
    private static int v = func();
    private static int func() {
        System.out.print("A");
        return 0;
    }
}

class B {
    private static int v = func();
    public static int func() {
        System.out.print("B");
        return 0;
    }
}

class C {
    private static int v = func();
    public static int func() {
        System.out.print("C");
        return 0;
    }
}

public class G {
    public static void main(String[] args) {
        B b;
        C.func();
        b = new B();
        System.out.println();
    }
}


