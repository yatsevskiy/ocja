package ed.scjp.overloading;

public class Sample0007
{
    public static void main(String[] args)
    {
        Base b = new Base();
        Base d = new Derived();
        Q q = new Y();

        b.f(1f);
        b.f(1);
        b.f((Q) null);
        b.f(q);
        b.f((Y) null);
        b.f(null);

        d.f(1f);
        d.f(1);
        d.f((Q) null);
        d.f(q);
        d.f((Y) null);
        d.f(null);
    }
}

class Base
{
    public void f(int a)
    {
        System.out.println("Base::f(int)");
    }

    public void f(float a)
    {
        System.out.println("Base::f(float)");
    }

    public void f(Q q)
    {
        System.out.println("Base::f(Q)");
    }

    public void f(Y y)
    {
        System.out.println("Base::f(Y)");
    }
}

class Derived extends Base
{
    public void f(int a)
    {
        System.out.println("Derived::f(int)");
    }

    public void f(float a)
    {
        System.out.println("Derived::f(float)");
    }

    public void f(Q q)
    {
        System.out.println("Derived::f(Q)");
    }

    public void f(Y y)
    {
        System.out.println("Derived::f(Y)");
    }
}

class Q
{
    //
}

class Y extends Q
{
    //
}
