package edu.reflaction.instance;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main
{
    public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException,
                                          ClassNotFoundException
    {
        Derived d1 = new Derived();
        Class<? extends Derived> c = d1.getClass();

        Derived d2;
        d2 = c.newInstance();
        d2 = (Derived) Class.forName("edu.reflaction.instance.Derived").newInstance();

        // d2.function1();
        d2.function2();
        d2.function3();
        // d2.function4();
        d2.function5();
        d2.function6();

        Class<?> c2;

        c2 = d1.getClass();

        do
        {
            System.out.println("Class name [" + c2.getName() + "]");
            System.out.println("Simple class name [" + c2.getSimpleName() + "]");

            for (Method m : c2.getMethods())
            {
                System.out.println("Method name " + m.getName());
            }
        }
        while (!Object.class.equals(c2 = c2.getSuperclass()));

        c2 = d1.getClass();

        do
        {
            System.out.println("Class name [" + c2.getName() + "]");
            System.out.println("Simple class name [" + c2.getSimpleName() + "]");

            for (Method m : c2.getDeclaredMethods())
            {
                System.out.println("Declared method name " + m.getName());
            }
        }
        while (!Object.class.equals(c2 = c2.getSuperclass()));

        c2 = d1.getClass();

        do
        {
            System.out.println("Class name [" + c2.getName() + "]");
            System.out.println("Simple class name [" + c2.getSimpleName() + "]");

            for (Field f : c2.getFields())
            {
                System.out.println("Field name " + f.getName());
            }
        }
        while (!Object.class.equals(c2 = c2.getSuperclass()));

        c2 = d1.getClass();

        do
        {
            System.out.println("Class name [" + c2.getName() + "]");
            System.out.println("Simple class name [" + c2.getSimpleName() + "]");

            for (Field f : c2.getDeclaredFields())
            {
                System.out.println("Declared field name" + f.getName());
            }
        }
        while (!Object.class.equals(c2 = c2.getSuperclass()));

        c2 = d1.getClass();

        for (Method m : c2.getDeclaredMethods())
        {
            System.out.println("Declared method name " + m.getName());
            if (m.getModifiers() == Modifier.PUBLIC)
            {
                m.invoke(d1, (Object[]) null);
            }
        }
    }
}

class Base
{
    @SuppressWarnings("unused")
    private int   field1;
    protected int field2;
    public int    field3;

    @SuppressWarnings("unused")
    private void function1()
    {
    }
    protected void function2()
    {
    }
    public void function3()
    {
    }
}
class Derived extends Base
{
    @SuppressWarnings("unused")
    private int   field4;
    protected int field5;
    public int    field6;

    @SuppressWarnings("unused")
    private void function4()
    {
    }
    protected void function5()
    {
    }
    public void function6()
    {
        System.out.println("Invoking function6 method");
    }
}