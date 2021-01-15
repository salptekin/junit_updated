package junit5SubjectTutoring;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class J06DisplayName {

	/*
	    1)In JUnit4 access modifier of all test methods should have been public. 
	    Java is creating a main method behind, to run the test methods. 
	    And the main methods should be able to access to the test methods.
	    To be able to access the test methods should be "public".
	    
	    But in JUnit5 no need to type "public" as access modifier. 
	    If you type nothing for access modifier, JUnit5 will accept the access modifier "public" or "protected"
	    "public" and "protected" works in JUnit5 without any issue.
	    
	    The benefit is typing less code
	    
	 	2)@DisplayName annotation Declares a custom display name for the test class or test method.
	 */
	@Test
	@DisplayName("When the String is null, throws an Exception")
	void testExceptions() {
		
		String str = null;
		
		assertThrows(NullPointerException.class,
						()->{
							System.out.println("testExceptions1() executed");
							str.length();
						}				
					);
	}
}
