package ed.scjp.classes;
import java.lang.reflect.Method;

public class Sample0003
{
    protected class Inner
    {

    }

    private static class Nested
    {

    }

    private static void showAllMethods(Class<? extends Object> clazz)
    {
        System.out.println(clazz);

        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods)
        {
            System.out.println(method);
        }
    }

    public static void main(String[] args)
    {
        showAllMethods(Sample0003.class);
    }
}

class InTheSameFile
{

}
