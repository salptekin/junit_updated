package junit5SubjectTutoring;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class J04beforeAll_afterAll {
	
	/*
	    1)When do we need @BeforeAll and @AfterAll?
	    If a test method is annotated with @BeforeAll, it will be executed just once before all test methods will be executed
	    For example; to create connection with database
	    If a test method is annotated with @AfterAll, it will be executed after all test methods executed just once
	    For example; to close the connection with database
	    
	    Note: The method annotated with @BeforeAll must be static
	    Note: In JUnit4 we were using @BeforeClass instead of @BeforeAll
	          In JUnit4 we were using @AfterClass instead of @AfterAll
    */
	
	@BeforeAll
	static void beforeAll() {
		System.out.println("Create connection with database");
	}
	
	@AfterAll
	static void afterAll() {
		System.out.println("Close the connection with database");
	}
	
	@Test
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
