package com.regexp.test;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.junit.Test;

import com.regexp.DollarVeriable;

public class DollarVeriableTest {

	@Test
	public void test() {
		Map<String, String> veriables = new HashMap<String, String>();
		generateVariables(veriables);

		StringBuilder b0 = new StringBuilder();
		StringBuilder b1 = new StringBuilder();
		generateRequestAndResponse(b0, b1);

		DollarVeriable dollarVeriable = new DollarVeriable();

		long b = System.currentTimeMillis();
		String result = dollarVeriable.interpreted(veriables, b0.toString());
		long e = System.currentTimeMillis();
		System.out.println(e - b + " ms");
		System.out.println("length:" + result.length());
		assertEquals(result, b1.toString());
	}

	private void generateRequestAndResponse(StringBuilder b0, StringBuilder b1) {
		Random random = new Random(System.currentTimeMillis());
		for (int i = 0; i < STRING_LENGTH; ++i) {

			final int key1 = Math.abs(random.nextInt()) % 100;
			final int key2 = Math.abs(random.nextInt()) % 10;

			for (int j = 0; j < key2; ++j) {
				b0.append('-');
				b1.append('-');
			}

			b0.append("${env").append(key1).append("}");
			b1.append(key1);
		}
	}

	private void generateVariables(Map<String, String> veriables) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < NUMBER_OF_VARIABLES; ++i) {
			builder.setLength(0);
			builder.append("${env").append(i).append("}");
			veriables.put(builder.toString(), Integer.toString(i));
		}
	}

	private static final int STRING_LENGTH = 1000000;
	private static final int NUMBER_OF_VARIABLES = 100;
}
