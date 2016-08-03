package src.java.linkedlist;

import java.util.LinkedList;

/*
 * http://www.geeksforgeeks.org/function-to-check-if-a-singly-linked-list-is-palindrome/
 * */

public class IsPalindrome {

	private Boolean isPalindrome;
	private LinkedList list;
	  	 
	public IsPalindrome() {
		super();
	}

	public Boolean isPalindrome(LinkedList list){
		this.list = list;
		isPalindrome = true;
		if(isBaseCase()){
			isPalindrome = false;
		}
		if(isEmpty()){
			isPalindrome = true;
		}
		else{
			checkFullText();
		}
		
		//System.out.println(list.toString() + ": " + isPalindrome);
		return isPalindrome;
	}

	private boolean isEmpty() {
		return list.isEmpty();
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
		return list == null;
	}
	
	private boolean checkChars(int charIndex){
	  		int reverseIndex = list.size() - 1 - charIndex;
	        return (list.get(charIndex).equals(list.get(reverseIndex))) ;
	}	  
}