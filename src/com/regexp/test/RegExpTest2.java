package com.regexp.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.regexp.SecondUnderscoreCase;
import com.regexp.UnderscoreCase;

public class RegExpTest2 {

	@Test
	public void test() {

		UnderscoreCase second = new SecondUnderscoreCase();

		assertEquals(second.toUnderscoreCase("lowercase"), "lowercase");
		assertEquals(second.toUnderscoreCase("Class"), "Class");
		assertEquals(second.toUnderscoreCase("MyClass"), "My Class");
		assertEquals(second.toUnderscoreCase("HTML"), "HTML");
		assertEquals(second.toUnderscoreCase("PDFLoader"), "PDF Loader");
		assertEquals(second.toUnderscoreCase("AString"), "A String");
		assertEquals(second.toUnderscoreCase("SimpleXMLParser"), "Simple XML Parser");
		assertEquals(second.toUnderscoreCase("GL11Version"), "GL 11 Version");
		assertEquals(second.toUnderscoreCase("99Bottles"), "99 Bottles");
		assertEquals(second.toUnderscoreCase("May5"), "May 5");
		assertEquals(second.toUnderscoreCase("BFG9000"), "BFG 9000");
	}

}
