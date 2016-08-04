package src.java.string;

/*
 * Implement an algorithm to determine if a string has all unique characters
 * 
 * It's important to know the encode of the string, since we can have a better algorithm.
 * */

public class IsUniqueChars {

	private static final int ASCII_ALPHABET_LENGTH = 256;
	private boolean[] checks;
	private String str;
	private boolean isUnique;
	
	public IsUniqueChars(String strToCheck) {
		str = strToCheck;
		isUnique = true;
	}

	public boolean isUniqueCharsAscii(){
		if(isBaseCase()){
			isUnique = false;
		}
		else{
			setChecksArrayForAscii();
			searchFullString();
		}
		
		return isUnique;
	}
	
	private void searchFullString() {
		
		for(int i = 0; shouldContinueSearching(i); i++){
			int currentChar = str.charAt(i);
			if(checks[currentChar]){
				isUnique = false;
			}
			else{
				checks[currentChar] = true;
			}
		}		
	}

	private boolean shouldContinueSearching(int index) {
		return (index < str.length()); // somehow we should check if we already know that is not unique, so we can stop the execution.
	}

	private boolean isBaseCase(){
		return str == null || longerThanAlphabet();
	}
	
	private void setChecksArrayForAscii() {
		checks = new boolean[ASCII_ALPHABET_LENGTH];
	}


	private boolean longerThanAlphabet(){
		return str.length() > ASCII_ALPHABET_LENGTH;
	}
}
