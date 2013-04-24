package oracle.certified.java.associate.init;

import java.util.ArrayList;
import java.util.Collection;

public class Test18 {
public static void main(String[] args) {
Collection<User> users = new ArrayList<User>();
users.add(new User(31.1, "Jeff"));
users.add(new User(42.0, "Boris"));
users.add(new User(25.6, "Samuel"));
users.add(new User(13.9, "Lisa"));

users.remove(new User(42.0, "Boris"));
System.out.print(users.size());

}

static class User {
double age;
String name;

public User(double age, String name) {
this.age = age;
this.name = name;
}

}

}