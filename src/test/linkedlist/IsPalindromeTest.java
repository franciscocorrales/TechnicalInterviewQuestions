package src.test.linkedlist;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Test;

import src.java.linkedlist.IsPalindrome;


public class IsPalindromeTest {

	@Test
	public void testIsPalindrome() {
		IsPalindrome checker = new IsPalindrome();
		
		assertTrue(checker.isPalindrome(string2LinkedList("abba")));
		assertTrue(checker.isPalindrome(string2LinkedList("ababbaba")));
		assertTrue(checker.isPalindrome(string2LinkedList("")));
		assertTrue(checker.isPalindrome(string2LinkedList("abcba")));
		assertTrue(checker.isPalindrome(string2LinkedList("aa")));
		assertTrue(checker.isPalindrome(string2LinkedList("a")));
		assertTrue(checker.isPalindrome(string2LinkedList("$")));
		assertTrue(checker.isPalindrome(string2LinkedList("ababcbaba")));
		assertTrue(checker.isPalindrome(string2LinkedList("zababbabaz")));
		
		assertFalse(checker.isPalindrome(string2LinkedList("abbanot")));
		assertFalse(checker.isPalindrome(string2LinkedList("abba!#@$%^(^&*()(*abba")));
		assertFalse(checker.isPalindrome(string2LinkedList("oa")));
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
}
