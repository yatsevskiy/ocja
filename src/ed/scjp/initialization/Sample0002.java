package ed.scjp.initialization;
public class Sample0002
{
    public static void main(String[] args)
    {
        System.out.println("initialize guard begin");
        System.out.println();
        new Sub();
        System.out.println();
        System.out.println("initialize guard end");
    }
}

class Super
{
    public Super(int i)
    {
        System.out.println("Super::constructor");
        System.out.println();
    }

    // --- instance variables and blocks

    {
        System.out.println("Super::initialization block");
    }

    Z mSuperZ = new Z("Super::instance variable");

    // --- static variables and blocks

    static
    {
        System.out.println("Super::static initialization block");
    }

    static Z superZ = new Z("Super::static (class) variable");
}

class Sub extends Super
{
    public Sub()
    {
        super(getSuperArgs());
        System.out.println("Sub::constructor");
    }

    private static int getSuperArgs()
    {
        System.out.println("invoke Super constructor from Sub constructor");
        return 0;
    }

    // --- instance variables and blocks

    Z mSubZ = new Z("Sub::instance variable");

    {
        System.out.println("Sub::initialization block");
    }

    // --- static variables and blocks

    static Z subZ = new Z("Sub::static (class) variable");

    static
    {
        System.out.println("Sub::static initialization block");
        System.out.println();
    }

}

class Z
{
    public Z(String s)
    {
        System.out.println(s);
    }

    public Z()
    {
        // TODO Auto-generated constructor stub
    }
}
