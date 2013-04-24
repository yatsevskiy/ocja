package oracle.certified.java.associate.init;

public class Test15 {
public static void main(String[] args) {
A[] array = { new A(), new B() };
long test = 10;

for (A a : array) {
System.out.print(a.calc(10));
System.out.print(a.calc(test));
}

}

}

class A {
Object calc(int input) {
long mod = input % 2;
return calc(mod);
}

Object calc(long input) {
return input - 1;
}

}

class B extends A {
String calc(long input) {
if (input == 1)
return "A" + input;
else
return calc(3).toString() + "B" + input;
}
}