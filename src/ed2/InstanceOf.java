package ed2;


public class InstanceOf
{
    public static void main(String[] args)
    {
        Q1 q = new Q2();
//        System.out.println(q instanceof W2);
        System.out.println(null instanceof W2);
        W2[] w2 = new W2[1];
//        System.out.println(w2 instanceof W2);
        
        
        System.out.println("s" + 1);
        System.out.println(1 + "s");
        
        String s = "123";
        s += "45";
        s += 67;
        System.out.println(s);
        
        System.out.println(FALSE()&TRUE());
        System.out.println(FALSE()&&TRUE());
    }
    
    static boolean FALSE()
    {
        System.out.println("FALSE");
        return false;
    }
    
    static boolean TRUE()
    {
        System.out.println("TRUE");
        return true;
    }
}


class Q1{}//
class Q2 extends Q1{}//
class W1{}
//
class W2 extends W1{}//

