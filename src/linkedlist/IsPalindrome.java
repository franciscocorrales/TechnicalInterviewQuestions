package src.linkedlist;

import java.util.LinkedList;

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
	
	private static LinkedList<Object> string2LinkedList(String word){
		LinkedList<Object> ll = new LinkedList<Object>();
		if(word != null){
			for(int i = 0; i < word.length(); i++){
				ll.add( word.charAt(i) );
			}
		}
		return ll;
	}
	  
	public static void main(String[] args){
		IsPalindrome checker = new IsPalindrome();
		checker.isPalindrome(string2LinkedList("abba")); 
		checker.isPalindrome(string2LinkedList(null)); 
		checker.isPalindrome(string2LinkedList("abbanot")); 
		checker.isPalindrome(string2LinkedList("ababbaba"));
		checker.isPalindrome(string2LinkedList("")); 
		checker.isPalindrome(string2LinkedList("abba!#@$%^(^&*()(*abba")); 
		checker.isPalindrome(string2LinkedList("abcba")); 
		checker.isPalindrome(string2LinkedList("aa")); 
		checker.isPalindrome(string2LinkedList("a")); 
		checker.isPalindrome(string2LinkedList("ababcbaba")); 
		checker.isPalindrome(string2LinkedList("zababbabaz"));
	}	
	  
}
