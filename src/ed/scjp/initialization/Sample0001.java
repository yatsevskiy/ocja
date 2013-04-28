package ed.scjp.initialization;
public class Sample0001
{
    static int mVar1 = getInt();

    static int mVar2 = 20;

    public static int getInt()
    {
        return mVar2;
    }

    public static void main(String[] args)
    {
        System.out.println(mVar1 + "  " + mVar2);
    }
}
