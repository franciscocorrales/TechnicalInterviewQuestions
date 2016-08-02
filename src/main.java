package src;

import solutions.GFG_A_280.*;

public class main{
	
	public static void test(){
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
	
	public static void testLinked(){
		PalindromeLinked p1 = new PalindromeLinked("abba");
		PalindromeLinked p2 = new PalindromeLinked(null);
		PalindromeLinked p3 = new PalindromeLinked("abbanot");
	    PalindromeLinked p4 = new PalindromeLinked("ababbaba");
	    PalindromeLinked p5 = new PalindromeLinked("");
	    PalindromeLinked p6 = new PalindromeLinked("abba!#@$%^(^&*()(*abba");
	    PalindromeLinked p7 = new PalindromeLinked("abcba");
	    PalindromeLinked p8 = new PalindromeLinked("aa");
	    PalindromeLinked p9 = new PalindromeLinked("a");
	    PalindromeLinked p10 = new PalindromeLinked("ababcbaba");
	    PalindromeLinked p11 = new PalindromeLinked("zababbabaz");
	}
	
  public static void main(String[] args)
  {
	    test();
	    testLinked();
  }	
}
