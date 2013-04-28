package ed.scjp.initialization;

public class Sample0008
{
    public static void main(String[] args)
    {
        new B();
    }
}

class A
{
    public A()
    {
        super();
        f();
    }

    public void f()
    {
        System.out.println("A::f();");
    }
}

class B extends A
{
    public B()
    {
        super();
    }

    public void f()
    {
        System.out.println("B::f();");
    }
}
