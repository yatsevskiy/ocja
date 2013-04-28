package com.regexp;

public interface UnderscoreCase {

	/**
	 * (?=X) X, via zero-width positive lookahead <br>
	 * (?!X) X, via zero-width negative lookahead <br>
	 * (?<=X) X, via zero-width positive lookbehind <br>
	 * (?<!X) X, via zero-width negative lookbehind <br>
	 */
	String toUnderscoreCase(String camelCase);
}
