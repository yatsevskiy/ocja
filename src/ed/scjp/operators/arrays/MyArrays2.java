package ed.scjp.operators.arrays;

import java.util.ArrayList;

public class MyArrays2
{
    public static void main(String[] args)
    {
        int[] arr = {
                0, 0, 0, 0
        };

        char c = 'c';
        byte b = 10;
        short s = 100;
        int i = 1000;

        arr[0] = c;
        arr[1] = b;
        arr[2] = s;
        arr[3] = i;

        A[] arr5 = new B[4];

        // ------------------------------------------------------------------
        // ------------------------------------------------------------------
        // ------------------------------------------------------------------

        Object o;

        C[] ac = new C[3];

        ac[0] = new C();
        ac[1] = new C();
        ac[2] = new C();

        o = ac;

        // B[] ab = (B[]) o; // illegal Runtime error;

        // ------------------------------------------------------------------

        ArrayList<C> alc = new ArrayList<C>(3);

        alc.add(new C());
        alc.add(new C());
        alc.add(new C());

        o = alc;

        ArrayList<B> list = (ArrayList<B>) o;

        // for (B bObj : list)
        // // illegal Runtime error;
        // ;
        // ------------------------------------------------------------------
    }
}

class A
{
    //
}

class B extends A
{
    //
}

class C
{
    //
}
