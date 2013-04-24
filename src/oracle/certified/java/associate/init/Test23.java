package oracle.certified.java.associate.init;

public class Test23 {
public static void main(String[] args) {
try {
User user = new User();
if (user.age >= 0) System.out.print("1");
if (user.name.length() >= 0) System.out.print("2");
} catch (Throwable ex) {
System.out.print("3");
}
}

static class User {
int age;
String name;
}

}