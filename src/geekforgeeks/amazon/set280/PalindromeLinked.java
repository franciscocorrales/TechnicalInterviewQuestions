package src.geekforgeeks.amazon.set280;

import java.util.LinkedList;

public class PalindromeLinked {

	private Boolean isPalindrome;
	private LinkedList list;
	  	 
	public PalindromeLinked() {
		super();
	}

	public Boolean isPalindrome(LinkedList list){
		this.list = list;
		isPalindrome = true;
		if(isBaseCase()){
			isPalindrome = false;
		}
		else{
			checkFullText();
		}
		
		System.out.println(list.toString() + ": " + isPalindrome);
		return isPalindrome;
	}

	private void checkFullText() {
	      int requiredChecks = (list.size() / 2)  ;
	      for(int i = 0; i <=  requiredChecks ; i++){
	        if(checkChars(i) == false){
	        	isPalindrome = false;
	        }
	      }
	}

	private boolean isBaseCase() {
		return list == null || list.isEmpty();
	}
	
	  private boolean checkChars(int charIndex){
	  		int reverseIndex = list.size() - 1 - charIndex;
	        return (list.get(charIndex).equals(list.get(reverseIndex))) ;
	  }
	
}
