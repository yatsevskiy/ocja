package ed.scjp.wrapper;

public class Wrapper2
{
    public static void main(String[] args)
    {
        byte b = 5;
        f(b);
    }

    // byte --> Byte --> Object
    static void f(Object o)
    {
        System.out.println("Object o");
    }

    // byte --> long --> Long -- illegal, compiler not so smart
    // byte --> Byte --> Long -- illegal, Byte IS-A Long test fail
    static void f(Long l)
    {
        System.out.println("Long l");
    }

}
