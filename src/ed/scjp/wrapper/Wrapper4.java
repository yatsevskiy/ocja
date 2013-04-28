package ed.scjp.wrapper;

public class Wrapper4
{
    public static void main(String[] args)
    {
        byte b = 5;
        go(b, b);
    }

    static void go(int x, int y)
    {
        System.out.println("int, int");
    }

    static void go(Byte x, Byte y)
    {
        System.out.println("Byte, Byte");
    }

    static void go(byte ... x)
    {
        System.out.println("byte ... ");
    }
}
