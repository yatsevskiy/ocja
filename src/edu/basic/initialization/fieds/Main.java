package edu.basic.initialization.fieds;

public class Main
{
    public Main()
    {
//        field5 = new Field("static final field5");
        field6 = new Field("static field6");
        field7 = new Field("non static final field7");
        field8 = new Field("non static field8");
    }

    public void displayValues()
    {
        System.out.println("field1 = " + field1);
        System.out.println("field2 = " + field2);
        System.out.println("field3 = " + field3);
        System.out.println("field4 = " + field4);
//        System.out.println("field5 = " + field5);
        System.out.println("field6 = " + field6);
        System.out.println("field7 = " + field7);
        System.out.println("field8 = " + field8);
    }
//    private static final Field field5;
    private static Field       field6;
    private final Field        field7;
    private Field              field8;

    {
        System.out.println("Non static block");
    }

    private Field              field3 = new Field("non static field3");
    private final Field        field4 = new Field("non static final field4");

    static
    {
        System.out.println("Static block");
    }

    private static Field       field1 = new Field("static field1");
    private static final Field field2 = new Field("static final field2");

    public static void main(String[] args)
    {

        System.out.println("Before class loading");
        Main m = new Main();
        System.out.println("After class loading");
        m.displayValues();
    }
}

class Field
{
    private String string;

    public Field(String string)
    {
        this.string = string;
        System.out.println("Initialized " + string);
    }

    @Override
    public String toString()
    {
        return this.string;
    }
}
