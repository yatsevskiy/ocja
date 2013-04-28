package n;

public class L7 {
	  enum Enum {
	        ONE("oneInfo"), TWO("twoInfo"), THREE("threeInfo");
	        
	        private static String info = ""; //1
	        
	        Enum(String info) {
//	            this.info = info;     //2
	        }
	        
	        public static String getInfo() {
	            return info;
	        }
	    }

	    public static void main(String[] args) {
	        System.out.println(Enum.TWO.getInfo()); // 3
	    }
}
