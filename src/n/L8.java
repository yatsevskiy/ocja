package n;

public class L8 {
	  public static void var(Integer x, int y) { 
	        System.out.println("Integer int"); 
	    } 
	 
	    public static void var(Object... x) { 
	        System.out.println("Object"); 
	    } 
	 
	    public static void var(int... x) { 
	        System.out.println("int... x"); 
	    } 
	 
	    public static void var(Integer... x) { 
	        System.out.println("Integer..."); 
	    } 
	 
	    public static void main(String... args) {  
	        byte i = 0; 
	        Integer i2 = 127; 
//	        var(i, i2); 
	    } 
	    
	    
	    interface I {
	    	class C {
	    		static int i;
	    	}
	    	
	    	
	    }
}
