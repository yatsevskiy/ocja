package ed.scjp.string;

public class MyString
{
    public static void main(String[] args)
    {
        StringBuilder sb1 = new StringBuilder("AAAA");
        StringBuilder sb2 = new StringBuilder("AAAA");
        sb1.append("BBBB");
        sb2.append("BBBB");

        System.out.println(sb1.toString() == sb1.toString());
        System.out.println(sb1.toString() == sb2.toString());
        System.out.println(sb1.toString().intern() == sb2.toString().intern());
    }
}
