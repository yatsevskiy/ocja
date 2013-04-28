package ed2;

public class F
{
    private static int i;

    public static void main(String[] args)
    {
        int[] n = new int[16];
        n[0] = 1;
        for (int i = 1; i < n.length; i++)
        {
            n[i] = n[i - 1] * 2;
        }
        for (int i = 0; i < n.length; i++)
        {
            System.out.println(i + " " + Integer.toString(n[i]));
        }
        System.out.println();
        for (int i = 0; i < n.length; i++)
        {
            System.out.println(Integer.toBinaryString(n[i]));
        }
        System.out.println();
        for (int i = 0; i < n.length; i++)
        {
            System.out.println(Integer.toOctalString(n[i]));
        }
        System.out.println();
        for (int i = 0; i < n.length; i++)
        {
            System.out.println(Integer.toHexString(n[i]));
        }
        System.out.println();

        try
        {
            go();
        }
        catch (StackOverflowError e)
        {
            System.out.println(i);
        }

    }

    private static void go()
    {
        i++;
        go();
    }
}
