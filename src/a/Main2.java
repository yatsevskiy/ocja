package a;

public class Main2 {
public static void main(String[] args) {
	String s1 = "India";
	String s2 = new String("India");
	System.out.println(s1==s2);
	s2=s2.intern();
	System.out.println(s1==s2); 
}
}
