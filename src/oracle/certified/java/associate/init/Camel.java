package oracle.certified.java.associate.init;

interface Rideable {
String getGait();
}
public class Camel implements Rideable {
int weight = 2;
public static void main(String[] args) {
new Camel().go(8);
}
void go(int speed) {
++speed;
weight++;
int walkrate = speed * weight;
System.out.print(walkrate + getGait());
}
String getGait() {
return " mph, lope";
}
}

