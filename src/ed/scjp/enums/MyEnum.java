package ed.scjp.enums;

public enum MyEnum
{
    A
    {
        @Override
        public String toString()
        {
            return super.toString();
        }
    },
    B
    {
        @Override
        public String toString()
        {
            return super.toString();
        }
    },
    C
    {
        @Override
        public String toString()
        {
            return super.toString();
        }
    },
    D
    {
        @Override
        public String toString()
        {
            return super.toString();
        }
    },
    E
    {
        private int b;

        @Override
        public String toString()
        {
            return Integer.toString(b);
        }
    };

    private int a;

    @Override
    public String toString()
    {
        return Integer.toString(a);
        // return super.toString();
    }
}

enum OtherEnum
{
    A, B, C, D, E
}

class SomeClass
{
    enum OtherEnum
    {
        A, B, C, D, E;

        @Override
        public String toString()
        {
            return super.toString();
        }
    }
}
