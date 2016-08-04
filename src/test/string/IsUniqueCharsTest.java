package src.test.string;

import static org.junit.Assert.*;

import org.junit.Test;

import src.java.string.IsUniqueChars;

public class IsUniqueCharsTest {

	@Test
	public void testIsUniqueCharsAscii() {
		assertTrue(new IsUniqueChars("a").isUniqueCharsAscii());
		assertTrue(new IsUniqueChars("").isUniqueCharsAscii());
		assertTrue(new IsUniqueChars("!@#$%^&*()_+|").isUniqueCharsAscii());
		assertTrue(new IsUniqueChars("abcdefghijklmnopqrstuvxyz").isUniqueCharsAscii());
		assertTrue(new IsUniqueChars("ABCDEFGHIJKLMNOPQRSTUVXYZ").isUniqueCharsAscii());
		
		assertFalse(new IsUniqueChars(null).isUniqueCharsAscii());
		assertFalse(new IsUniqueChars("aa").isUniqueCharsAscii());
		assertFalse(new IsUniqueChars("abcdefghijklmnopqrstuvxyza").isUniqueCharsAscii());
		assertFalse(new IsUniqueChars("ABCDEFGHIJKLMNOPQRSTUVXYZA").isUniqueCharsAscii());
		assertFalse(new IsUniqueChars("!ABCDEFGHIJKLMNOPQRSTUVXYZ!").isUniqueCharsAscii());
		assertFalse(new IsUniqueChars("ABCDEF$GHIJKLMNOP$QRSTUVXYZ").isUniqueCharsAscii());
		assertFalse(new IsUniqueChars("abababababababababa").isUniqueCharsAscii());
		assertFalse(new IsUniqueChars("aa").isUniqueCharsAscii());
	}

}
