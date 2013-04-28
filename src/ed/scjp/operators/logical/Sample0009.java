package ed.scjp.operators.logical;

public class Sample0009
{
    public static void main(String[] args)
    {
        int i;
        i = 5;

        final int one = 1; // getOne() -- illegal
        final Integer two = Integer.valueOf(2); // -- illegal

        switch (i)
        {
            default :
            {
                break;
            }
            case one :
            {
                break;
            }
            case 2 /* two -- illegal */:
            {
                break;
            }
            case 4 :
            {
                break;
            }
        }
    }
}
