package junit5SubjectTutoring;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class J10DisableUnitTest {
	
	/*
	 First run the test without using @Disabled annotation and display on the left bar both are executed.
	 Then put @Disabled annotation and run the test, and display testWithArrays() is not executed.
	 Note: In JUnit4 we were using @Ignored instead of @Disabled
	 */
	
	@Test
	@Disabled
	void testWithArrays() {
		
		String str = "Unit test with JUnit5";
		String actualResult[] = str.split(" ");
		String expectedResult[] = { "Unit", "test", "with", "JUnit5"};
		
		assertArrayEquals(expectedResult, actualResult, "Arrays are not equal");
		
		System.out.println("testWithArrays() executed");
	}
	
	@Test
	void testStringLength() {
		
		String str = "Unit test with JUnit5";
		int actualLength = str.length();
		int expectedLength = 21;
		
		assertEquals(expectedLength, actualLength, "Lengths are not equal");
		
		System.out.println("testStringLength() executed");
	}

}
