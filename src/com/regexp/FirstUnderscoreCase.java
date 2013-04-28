package com.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstUnderscoreCase implements UnderscoreCase {


	@Override
	public String toUnderscoreCase(String camelCase) {
		return camelCase.replaceAll(String.format("%s|%s|%s", //
				"(?<=[A-Z])(?=[A-Z][a-z])", //
				"(?<=[^A-Z])(?=[A-Z])", //
				"(?<=[A-Za-z])(?=[^A-Za-z])"), //
				" ");
	}

	public static void main(String[] args) {
		String s = "AAAAAAAABbbbbbbbb";
		String regex = "(?<=[A-Z])(?=[A-Z][a-z])";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(s);

		while (m.find()) {
			System.out.println("MATCH!!!");
			int count = m.groupCount();
			for (int i = 0; i < count; ++i) {
				System.out.println(m.group(i));
			}

		}

	}
}
