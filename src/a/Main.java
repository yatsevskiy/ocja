package a;
public class Main
{
    static class Base
    {
        public Base()
        {
            super();
            foo();
            bar();
        }

        public void foo()
        {
            System.out.println("Base::foo");
        }

        private void bar()
        {
            System.out.println("Base::bar");
        }
    }

    static class Derive extends Base
    {
        public Derive()
        {
            super();
            foo();
            bar();
        }

        public void foo()
        {
            System.out.println("Derive::foo");
        }

        private void bar()
        {
            System.out.println("Derive::bar");
        }
    }

    public static void main(String[] args)
    {
        new Derive();
    }
}
