package junit5SubjectTutoring;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;


public class J07ParameterizedTest {
	
	//Not recommended
	@Test
	void length_greater_than_zero() {
		assertTrue("ABCD".length()>0);
		assertTrue("ABC".length()>0);
		assertTrue("A".length()>0);
		assertTrue("ABCDEF".length()>0);
	}
	
	/*
		 If @ParameterizedTest complains, follow the steps;
		 Eclipse->Preferences->Java->Editor->Content Assist->Advanced - Explicitly check Java Proposals - Apply
	*/
	
	//Normal Parameterized Test
	@ParameterizedTest
	@ValueSource(strings = {"ABCD", "ABC", "A", "ABCDEF"})
	void length_greater_than_zero_using_parameterized_test(String str) {
		assertTrue(str.length()>0);
	}
	
	//Advanced Parameterized Test
	@ParameterizedTest
	@CsvSource(value = {"ABCD, abcd", "ABC, aBc", "A, a"})
	void upperCaseTest(String capitalizedStr, String str) {
		assertEquals(capitalizedStr, str.toUpperCase());
	}

	/*
	  After @ParameterizedTest, if you type (name = "{0} length is {1}") then {0} stands for first value and 
	  {1} stands for second value for every pair.
	  When you run the test, you will see "ABCD length is 4", "ABC length is 3", etc. on the console...
	*/
	@ParameterizedTest(name = "The length of {0} is {1}")
	@CsvSource(value = {"ABCD, 4", "ABC, 3", "A, 1", "'', 0"})
	void lengthTest(String word, int expectedLength) {
		assertEquals(expectedLength, word.length());
	}
	
}
