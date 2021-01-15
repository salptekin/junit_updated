package junit5tutoring;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class J05TestingExceptions {
	
	@Test
	void testExceptions1() {
		
		String str = null;
		
		assertThrows(NullPointerException.class,
						()->{
							System.out.println("testExceptions1() executed");
							str.length();
						}				
					);
	}

	@Test
	  void testException2() {
	 
	    assertThrows(NumberFormatException.class, 
	    		() -> {
			      Integer.parseInt("One");
			    });
	  }
	   
	  // testExceptions4() does not throw any exception, so the test fails
	  @Test
	  void testExceptions4() {
	 
	    assertThrows(NumberFormatException.class, 
	    		() -> {
			      Integer.parseInt("1");
			    });
	  }
	  
	  // We should put a method after "() ->". Because of that I created divide() method 
	  @Test
	    void testExceptions5() {

	        assertThrows(
	            ArithmeticException.class, 
	            	() -> divide(6, 0)
	            );

	    }
	    int divide(int a, int b) {
	        return a / b;
	    }
	    
	    @Test
	    void testExceptions6() {

	        assertThrows(
	        		IllegalArgumentException.class, 
	            	() -> printAge(5)
	            );

	    }
	    void printAge(int age) {
	        if(age<0) {
	        	throw new IllegalArgumentException();
	        }else {
	        	System.out.println(age);
	        }
	    }

}
