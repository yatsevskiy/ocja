package n;

class Test {
    private int i;
    public void setI(int i) {
      this.i = i;
    }

    public int getI() {
      return i;
    }
}

public class L5 {
     private Test t;
     public int getSomeInteger() {
         try {
             return t.getI();
         } finally {
             return 0;
         }
     }

     public static void main(String[] args) throws Exception {
    	 L5 m = new L5();
         System.out.println(m.getSomeInteger());
     }
}
