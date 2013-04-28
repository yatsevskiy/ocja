package ed.scjp.wrapper;

public class Wrapper3
{
    public static void main(String[] args)
    {
        int i = 100;
        // can't decide which method invoke
        // f(i, i, i);
    }

    static void f(long l1, long l2, int l3)
    {
        System.out.println("long l1, long l2, int l3");
    }

    static void f(long l1, int l2, long l3)
    {
        System.out.println("long l1, int l2, long l3 ");
    }
}
