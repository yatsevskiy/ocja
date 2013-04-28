package com.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Greedy {

	public static void find(String target, String regexp) {

		Pattern p = Pattern.compile(regexp);
		Matcher m = p.matcher(target);

		boolean found = false;

		while (m.find()) {

			System.out
					.format("I found the text" + " \"%s\" starting at "
							+ "index %d and ending at index %d.%n", m.group(), m.start(),
							m.end());

			int count = m.groupCount();
			for (int i = 0; i < count; ++i) {
				System.out.println(m.group(i));
			}

			found = true;
		}

		if (!found) {
			System.out.println("No match found.");
		}
	}

	public static void main(String[] args) {

		String s = "xfooxxxxxxfoo";

		// greedy quantifier
		find(s, ".*foo");

		// reluctant quantifier
		find(s, ".*?foo");

		// possessive quantifier
		find(s, ".*+foo");

		find("AAAAAAABbbbbbbbbbb", "(?<=[A-Z])(?=[A-Z][a-z])");
		find("9Bbbbbbbbbbb", "(?<=[^A-Z])(?=[A-Z])");

		
		
		
		
//		String a = "ababaaaab";
//
//		System.out.println("---------------");
//		find(a, "a*");
//		System.out.println("---------------");
//		find(a, "a?");
//		System.out.println("---------------");
//		find(a, "a+");
//		System.out.println("---------------");

	}
}
