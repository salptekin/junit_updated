package junit5SubjectTutoring;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

public class J03beforeEach_afterEach {
	
	/*
	    1)When do we need @BeforeEach and @AfterEach?
	    If a test method is annotated with @BeforeEach, it will be executed before each test method
	    For example; to initialize test data
	    If a test method is annotated with @AfterEach, it will be executed after each test method
	    For example; to clean test data
	    
	 	2)First run "J03beforeEach_afterEach" without using "TestInfo info"
	 		@BeforeEach
			void beforeEach() {
				System.out.println("Initialize test data");
			}
	 	3)Then run "J03beforeEach_afterEach" after using "TestInfo info" in method parenthesis 
	 	  and "info.getDisplayName()" in message
	 	    @BeforeEach
			void beforeEach(TestInfo info) {
				System.out.println("Initialize test data for " + info.getDisplayName());
			}
		4)Follow the same steps for afterEach()	
		
		5)In JUnit4 we were using @Before and @After for that functionality
    */
	
	@BeforeEach
	void beforeEach(TestInfo info) {
		System.out.println("Initialize test data for " + info.getDisplayName());
	}
	
	@AfterEach
	void afterEach(TestInfo info) {
		System.out.println("Clean test data for " + info.getDisplayName());
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
