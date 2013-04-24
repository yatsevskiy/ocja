package oracle.certified.java.associate.init;

public class Test10 {
public static void main(String[] args) {
java.util.HashSet<Coin> coins = new java.util.HashSet<Coin>();
coins.add(new Coin(4));
coins.add(new Coin(4));
coins.add(new Coin(3));
coins.add(new Coin(2));
coins.add(new Coin(1));
System.out.print(count);
System.out.print(coins.size());
}

static int count = 0;
static final class Coin {
int value;

Coin(int value) {
this.value = value;
}

public int hashCode() {
return value % 2;
}

public boolean equals(Object obj) {
++count;
return (obj instanceof Coin) ? ((Coin) obj).value == value : false;
}

}

}