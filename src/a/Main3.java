package a;
public class Main3
{

    public static void main(String[] args){
        byte a = 0;
        byte b = 0;
//        f(a, b);
    }

//    private static void f(byte b){    }
//    private static void f(long b){    }
//    private static void f(Byte b){    }
//    private static void f(Object b){    }
//    private static void f(Byte ... b){    }
//    private static void f(Object ... b){    }


//    private static void f(byte b0, byte b1){    } //1
//    private static void f(byte b0, long b1){    } //2
//    private static void f(byte b0, Byte b1){    }//4
//    private static void f(byte b0, Object b1){    }
//    private static void f(byte b0, Byte ... b1){    }
//    private static void f(byte b0, Object ... b1){    }


//    private static void f(long b0, byte b1){    }//2
//    private static void f(long b0, long b1){    }//3
//    private static void f(long b0, Byte b1){    }
//    private static void f(long b0, Object b1){    }
//    private static void f(long b0, Byte ... b1){    }
//    private static void f(long b0, Object ... b1){    }


//    private static void f(Byte b0, byte b1){    }//k4
//    private static void f(Byte b0, long b1){    }//k4
//    private static void f(Byte b0, Byte b1){    }//k4
//    private static void f(Byte b0, Object b1){    }//k4
//    private static void f(Byte b0, Byte ... b1){    }
//    private static void f(Byte b0, Object ... b1){    }


    private static void f(Object b0, byte b1){    }//k4
    private static void f(Object b0, long b1){    }//k4
    private static void f(Object b0, Byte b1){    }//k4
    private static void f(Object b0, Object b1){    }//k4
    private static void f(Object b0, Byte ... b1){    }
    private static void f(Object b0, Object ... b1){    }
}
