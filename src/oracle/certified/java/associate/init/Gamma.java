package oracle.certified.java.associate.init;

class Alpha {
String getType() { return "alpha"; }
}
class Beta extends Alpha {
String getType() { return "beta"; }
}
public class Gamma extends Beta {
String getType() { return "gamma"; }
public static void main(String[] args) {
Gamma g1 = new Alpha();
Gamma g2 = new Beta();
System.out.println(g1.getType() + " "
+ g2.getType());
}
}
