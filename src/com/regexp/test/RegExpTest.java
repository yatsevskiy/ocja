package com.regexp.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.regexp.FirstUnderscoreCase;
import com.regexp.UnderscoreCase;

public class RegExpTest {

	@Test
	public void test() {

		UnderscoreCase first = new FirstUnderscoreCase();

		assertEquals(first.toUnderscoreCase("lowercase"), "lowercase");
		assertEquals(first.toUnderscoreCase("Class"), "Class");
		assertEquals(first.toUnderscoreCase("MyClass"), "My Class");
		assertEquals(first.toUnderscoreCase("HTML"), "HTML");
		assertEquals(first.toUnderscoreCase("PDFLoader"), "PDF Loader");
		assertEquals(first.toUnderscoreCase("AString"), "A String");
		assertEquals(first.toUnderscoreCase("SimpleXMLParser"), "Simple XML Parser");
		assertEquals(first.toUnderscoreCase("GL11Version"), "GL 11 Version");
		assertEquals(first.toUnderscoreCase("99Bottles"), "99 Bottles");
		assertEquals(first.toUnderscoreCase("May5"), "May 5");
		assertEquals(first.toUnderscoreCase("BFG9000"), "BFG 9000");
	}

}
