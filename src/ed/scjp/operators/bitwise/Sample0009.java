package ed.scjp.operators.bitwise;

public class Sample0009
{
    public static void main(String[] args)
    {
        final int a = Integer.parseInt("0011", 2);
        final int b = Integer.parseInt("0101", 2);

        System.out.println("    a: " + toFullBinaryString(a));
        System.out.println("    b: " + toFullBinaryString(b));

        System.out.println("   ~a: " + toFullBinaryString(~a));
        System.out.println("a & b: " + toFullBinaryString(a & b));
        System.out.println("a | b: " + toFullBinaryString(a | b));
        System.out.println("a ^ b: " + toFullBinaryString(a ^ b));
        System.out.println("a<< 1: " + toFullBinaryString(a << 1));
        System.out.println("a>> 1: " + toFullBinaryString(a >> 1));
        System.out.println("a>>>1: " + toFullBinaryString(a >>> 1));

        System.out.println();
        System.out.println();
        final int c = Integer.MIN_VALUE;
        System.out.println("    c: " + toFullBinaryString(c));
        System.out.println("c<< 1: " + toFullBinaryString(c << 1));
        System.out.println("c>> 1: " + toFullBinaryString(c >> 1));
        System.out.println("c>>>1: " + toFullBinaryString(c >>> 1));
    }

    private static String toFullBinaryString(int i)
    {
        return leftPad(Integer.toBinaryString(i), 32);
    }

    private static String leftPad(String s, int width)
    {
        return String.format("%" + width + "s", s).replace(' ', '0');
    }

    private static String rightPad(String s, int width)
    {
        return String.format("%-" + width + "s", s).replace(' ', '0');
    }
}
