package com.regexp;

public class SecondUnderscoreCase implements UnderscoreCase {

	@Override
	public String toUnderscoreCase(String camelCase) {
		return camelCase.replaceAll(String.format("%s|%s", //
				"(?<!(^|[A-Z]))(?=[A-Z])", //
				"(?<!^)(?=[A-Z][a-z])"), //
				" ");
		
		
		
		
//		(?=X) 	X, via zero-width positive lookahead
//		(?!X) 	X, via zero-width negative lookahead
		
//		(?<=X) 	X, via zero-width positive lookbehind
//		(?<!X) 	X, via zero-width negative lookbehind
		
		
	}
}
