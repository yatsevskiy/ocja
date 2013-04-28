package edu.inner;

public class Outer
{
    private int field1 = 100;
    private int field2 = 200;

    class Inner
    {
        private int field2 = 250;

        public void accessToOuterObject()
        {
            System.out.println("Field of outer class= " + field1);
            System.out.println("Field of inner class= " + field2);

            System.out.println("Field of outer class= " + Outer.this.field2);
        }
    }

    static class Nested
    {
        private int field2 = 250;

        public void accessToOuterObject()
        {
//            System.out.println("Field of outer class= " + field1);
            System.out.println("Field of inner class= " + field2);

//            System.out.println("Field of outer class= " + OuterClass.this.field2);
        }
    }

    public static void main(String[] args)
    {
        Outer o = new Outer();
        Inner i = o.new Inner();
        i.accessToOuterObject();
        Nested n = new Nested();
        n.accessToOuterObject();
    }
}
