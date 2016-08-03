package src;

import java.awt.List;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;

import src.geekforgeeks.amazon.set280.Palindrome;
import src.geekforgeeks.amazon.set280.PalindromeLinked;

public class main{
	
	private static void assertTrue(Boolean executedValue){
		if(executedValue != true){
			System.out.println("Error!");
		}
	}
	private static void assertFalse(Boolean executedValue){
		if(executedValue != false){
			System.out.println("Error!");
		}
	}
	
	private static void test(){
		Palindrome p1 = new Palindrome("abba");
	    Palindrome p2 = new Palindrome(null);
	    Palindrome p3 = new Palindrome("abbanot");
	    Palindrome p4 = new Palindrome("ababbaba");
	    Palindrome p5 = new Palindrome("");
	    Palindrome p6 = new Palindrome("abba!#@$%^(^&*()(*abba");
	    Palindrome p7 = new Palindrome("abcba");
	    Palindrome p8 = new Palindrome("aa");
	    Palindrome p9 = new Palindrome("a");
	    Palindrome p10 = new Palindrome("ababcbaba");
	    Palindrome p11 = new Palindrome("zababbabaz");
	}
	
	private static LinkedList string2LinkedList(String word){
		LinkedList ll = new LinkedList();
		if(word != null){
			for(int i = 0; i < word.length(); i++){
				ll.add( word.charAt(i) );
			}
		}
		return ll;
	}
	
	private static void testLinked(){
				
		PalindromeLinked checker = new PalindromeLinked();
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
	
  public static void main(String[] args)
  {
	    test();
	    testLinked();
  }	
}
