package a;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class UnicodeTricks {
	public static void main(String[] args) {

		print_string("US-ASCII");
		print_string("ISO-8859-1");
		print_string("UTF-8");
		print_string("UTF-16BE");
		print_string("UTF-16LE");
		print_string("UTF-16");
	}

	private static void print_string(String charset) {
		try {
			byte[] bytes = "0123456789".getBytes(charset);
			System.out.println(Arrays.toString(bytes) + " : " + charset);
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}
	}
}
