package com.regexp;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DollarVeriable {

	private static final String r = "(\\$\\{[^}]+\\})";
	private static final Pattern p = Pattern.compile(r);
	private final StringBuffer sb = new StringBuffer();

	public String interpreted(Map<String, String> veriables, String query) {
		sb.setLength(0);
		final Matcher m = p.matcher(query);

		while (m.find()) {
			String value = veriables.get(m.group(1));
			m.appendReplacement(sb, value);
		}
		m.appendTail(sb);

		return sb.toString();
	}
}
