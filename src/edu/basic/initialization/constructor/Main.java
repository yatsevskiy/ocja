package edu.basic.initialization.constructor;

public class Main
{
    public static void main(String[] args)
    {
        @SuppressWarnings("unused")
        Derived derived = new Derived();
    }
}
class Inner
{
    public Inner()
    {
        System.out.println("Inner");
    }
}

class Base
{
    public Base()
    {
        System.out.println("Base");
    }
}

class Derived extends Base
{
    @SuppressWarnings("unused")
    private Inner inner = new Inner();

    public Derived()
    {
        System.out.println("Derived");
    }
}