package oracle.certified.java.associate.init;

public class Test22 {
public static void main(String[] args) {
String result = "40" + 2;

result += getArray()[0];
result += new Object();

System.out.print(result);

}

public static int[] getArray() {
int[] array = { 100 };
try {
return array;
} finally {
array[0] = 123;
}
}

}