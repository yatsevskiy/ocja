package oracle.certified.java.associate.init;

	public class Test {
	    private static Thread threadA, threadB;
	    
	    public static void main(String[] args) {
	        threadA = new Thread() {
	            public void run() {
	                System.out.println("A");
	                try {
	                    threadB.sleep(1000);
	                } catch(Exception e) {
	                    System.out.println("B");
	                }
	                System.out.println("C");
	            }
	        };
	        
	        threadB = new Thread() {
	            public void run() {
	                System.out.println("D");
	                try {
	                    threadA.wait();
	                } catch(Exception e) {
	                    System.out.println("E");
	                }
	                System.out.println("F");
	                
	            }
	        };
	        
	        threadA.start();
	        threadB.start();
	    }
	}

