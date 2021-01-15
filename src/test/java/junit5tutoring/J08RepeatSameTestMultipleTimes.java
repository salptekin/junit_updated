package junit5tutoring;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class J08RepeatSameTestMultipleTimes {
	
	/*
	 	@RepeatedTest is new in JUnit5
	 */
	
	@BeforeEach
	void beforeEachTest() {
	    System.out.println("Before Each Test");
	}

	@AfterEach
	void afterEachTest() {
	    System.out.println("After Each Test");
	    System.out.println("=====================");
	}
	
	//First type and run just one
	@Test
	@RepeatedTest(10)
	void containsTest() {
		assertFalse("abcdefg".contains("ijk"));
		System.out.println("containsTest is executed");
	}
	
	//Secondly type and run that one
	//Thirdly type @BeforeEach and @AfterEach, then run the addTest() and display beforeEachTest()
	//and afterEachTest() are excuted before and after every repetation
	@Test
	@RepeatedTest(10)
	void addTest() {
		assertEquals(3, Math.addExact(1, 2));
		System.out.println("addTest is executed");
	}

}
