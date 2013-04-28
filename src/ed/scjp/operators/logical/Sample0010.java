package ed.scjp.operators.logical;

public class Sample0010
{
    private static boolean BOOLEAN(int i, String string)
    {
        boolean result = i == 0 ? false : true;
        System.out.println(string + " - " + result);
        return result;
    }

    private static int INTEGER(String string)
    {
        System.out.println(string);
        return Integer.parseInt(string);
    }

    public static void main(String[] args)
    {
        if (BOOLEAN(0, "1") || BOOLEAN(1, "2") && BOOLEAN(0, "2") && BOOLEAN(1, "2") || BOOLEAN(1, "3"))
        {
            System.out.println("success");
        }

        int i = INTEGER("1") + INTEGER("2") * INTEGER("3");
        System.out.println("result = " + i);
    }
}
