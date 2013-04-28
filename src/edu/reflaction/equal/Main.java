package edu.reflaction.equal;
public class Main
{
    public static void main(String[] args)
    {
        Derived3 d = new Derived3();

        if (d instanceof Derived1)
        {
            System.out.println("d instanceof Derived1");
        }
        if (d instanceof Derived2)
        {
            System.out.println("d instanceof Derived2");
        }
        if (d instanceof Derived3)
        {
            System.out.println("d instanceof Derived3");
        }
        if (d instanceof Interface1)
        {
            System.out.println("d instanceof Interface1");
        }
        if (d instanceof Interface2)
        {
            System.out.println("d instanceof Interface2");
        }
        if (d instanceof Interface3)
        {
            System.out.println("d instanceof Interface3");
        }
        if (Derived1.class.equals(d.getClass()))
        {
            System.out.println("d equals Derived1");
        }
        if (Derived2.class.equals(d.getClass()))
        {
            System.out.println("d equals Derived2");
        }
        if (Derived3.class.equals(d.getClass()))
        {
            System.out.println("d equals Derived3");
        }
        if (Interface1.class.equals(d.getClass()))
        {
            System.out.println("d equals Interface1");
        }
        if (Interface2.class.equals(d.getClass()))
        {
            System.out.println("d equals Interface2");
        }
        if (Interface3.class.equals(d.getClass()))
        {
            System.out.println("d equals Interface3");
        }
    }
}

class Base
{
}
class Derived1 extends Base
{
}
class Derived2 extends Derived1
{
}
class Derived3 extends Derived2 implements Interface1, Interface2
{
}
interface Interface1
{
}
interface Interface2
{
}
interface Interface3
{
}
