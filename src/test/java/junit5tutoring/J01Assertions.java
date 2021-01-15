package junit5tutoring;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class J01Assertions {
	
	/*
	 	1) fail() method return red line everytime.
	 	   "Not yet implemented" is displayed on 'Failure Trace' window
	 	   
	 	2) If you remove  fail("Not yet implemented"); you get green line it means the test passed.
	 	   In JUnit if a test does not fail it means it passed 
	 	   
	 	3) In unit test, there are 3 main steps a) Write test code
	 	   										b) Call method ==> square(4) (Called 'Code Under Test')
	 	   										c) Check if the result matching ==> square(4) = 16 (Called 'Assertions')
	 */

	@Test
	void testToFail() {
		fail("Not yet implemented");
	}
	
	@Test
	void testToAssert() {
		int actualLength = "ABCD".length();
		int expectedLength = 4;
		
		//1. Assertion ==>assertEquals()
		//a)
		assertEquals(expectedLength,actualLength);
		//b)
		assertEquals(expectedLength, actualLength, "String length is not true");
		
		//2. Assertion
		//a)
		assertTrue(actualLength==expectedLength);
		//b)
		assertTrue(actualLength==expectedLength+1, "String length is not true");
		
		//3. Assertion
		//a)
		assertFalse(actualLength!=expectedLength);
		//b)
		assertFalse(actualLength==expectedLength, "String length is 4");

	}
	
	@Test
	void testToConvertUpper() {
		
		String actualString = "abcd".toUpperCase();
		String expectedString = "ABCD";
		
		//assertEquals()
		//a)
		assertEquals(expectedString,actualString);
		//b)
		assertEquals(expectedString, actualString, "String could not be converted to uppercase");
		
		//assertTrue()
		//a)
		assertTrue(actualString.equals(expectedString));
		//b)
		assertTrue(actualString.equals(expectedString), "String could not be converted to uppercase");
		
		//assertFalse()
		//a)
		assertFalse(!actualString.equals(expectedString));
		//b)
		assertFalse(actualString.equals(expectedString), "String could not be converted to uppercase");
		
		//assertNotNull()
		assertNotNull(actualString);
		
		//assertNull()
		assertNull(actualString);		
	}
	
	@Test
	void testToContainNormal() {
		
		boolean actualResult = "abcd".contains("hi");
		boolean expectedResult = false;
		
		//a)
		assertEquals(expectedResult,actualResult);
		//b)
		assertEquals(expectedResult, actualResult, "String is containing 'hi' but it should not");
		
		
	}
	
	/*
	 	How to use "inline" ==> 1)Go to variable name 2)Refactor 3)Inline
	 	The right part of the variable will be used in method parenthesis.
	 	This makes the code more readable
	*/
	
	@Test
	void testToContainInlined() {
		
		//a)
		assertEquals(false,"abcd".contains("hi"));
		//b)
		assertEquals(false, "abcd".contains("hi"), "String is containing 'hi' but it should not");
			
	}
}
