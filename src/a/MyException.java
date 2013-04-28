package a;
import java.util.Arrays;

public class MyException
{
    public static void main(String ... args)
    {
    }

    public void a()
    {
        try
        {
            System.out.println(b());
        }
        catch (Exception e)
        {
            System.out.println("a::catch");
        }
        finally
        {
            System.out.println("a::finally");
        }
    }

    public int b()
    {
        try
        {
            if (true)
                throw new Exception();
            return -1;
        }
        catch (Exception e)
        {
            System.out.println("b::catch");
            return 0;
        }
        finally
        {
            System.out.println("b::finally");
            return 1;
        }
    }
}
