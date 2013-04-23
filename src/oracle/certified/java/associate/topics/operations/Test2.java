package oracle.certified.java.associate.topics.operations;

public class Test2 {

	public static void main(String[] args) {
		String str = "19"; // 1
		str.concat(".5"); // 2
		Double d = new Double(str); // 3
		Long l = new Long(str); // 4
		System.out.println(d.intValue() + d.doubleValue() + l.doubleValue()); // 5
	}

}
