package junit5tutoring;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class J02Assertions {

	@Test
	void testToFindMin() {
		
		int actualMin = Math.min(12, 14);
		int expectedMin = 12;
		
		//assertEquals()
		//a)
		assertEquals(expectedMin,actualMin);
		//b)
		assertEquals(expectedMin, actualMin, "Minimum value is not true");
		
		//assertTrue()
		//a)
		assertTrue(actualMin==expectedMin);
		//b)
		assertTrue(actualMin==expectedMin, "Minimum value is not true");
		
		//assertFalse()
		//a)
		assertFalse(actualMin!=expectedMin);
		//b)
		assertFalse(actualMin==expectedMin, "Minimum value is 12");
	}
	
	@Test
	void testWithArrays() {
		
		String str = "Unit test with JUnit5";
		String actualResult[] = str.split(" ");
		String expectedResult[] = { "Unit", "test", "with", "JUnit5"};
		
		//assertArrayEquals()
		//Note 1: Show what is changing on the failure message when you switch the expectedResult and actualResult
		//Note 2: 'Inline' is not recommended over here because it is not making the code more readable
		assertArrayEquals(expectedResult, actualResult);
		
		assertArrayEquals(expectedResult, actualResult, "Arrays are not equal");
	}

}
