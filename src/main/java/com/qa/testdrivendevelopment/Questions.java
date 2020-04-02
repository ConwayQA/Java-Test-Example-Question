package com.qa.testdrivendevelopment;

public class Questions {
	/**
	 * There is a well known mnemonic which goes "I before E, except after C", which is used to determine which order "ei" or "ie" should be in a word.  <br>
	 *  <br>
	 * Write a function which returns the boolean True if a string follows the mnemonic, and returns the boolean False if not.  <br>
	 *  <br>
	 * For Example:  <br>
	 * iBeforeE("ceiling") → True  <br>
	 * iBeforeE("believe") → True  <br>
	 * iBeforeE("glacier") → False  <br>
	 * iBeforeE("height") → False
	 */
	public boolean iBeforeE(String input) {
		input = input.toLowerCase();
		String a = "";
		for (int i = 0; i < input.length(); i++) {
			a = input.substring(i, i + 1);
			if (a.contentEquals("e")) {
				if(input.substring(i - 1, i).contentEquals("c")) {
					if(input.substring(i + 1, i + 2).contentEquals("i")) {
						return true;
					}
				}
			} else if (a.contentEquals("i")) {
				if(!(input.substring(i - 1, i).contentEquals("c"))) {
					if(input.substring(i + 1, i + 2).contentEquals("e")) {
						return true;
					}
				}
			}
		
		
		}
		return false;
}
}
