package junit5tutoring;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class J11GroupingTests {
	
	/*
	 	@Nested is new in JUnit%
	 */
	
	@BeforeEach
	void beforeEach(TestInfo info) {
		System.out.println("Initialize test data for " + info.getDisplayName());
	}
	
	@AfterEach
	void afterEach(TestInfo info) {
		System.out.println("Clean test data for " + info.getDisplayName());
	}
	
	@ParameterizedTest
	@CsvSource(value = {"12, 4, 3", "-12, 3, -4", "-12, -3, 4", "12, -4, -3"})
	void multiply(int rs, int x, int y) {
		assertEquals(rs, Math.multiplyExact(x, y));
	}
	
	@Nested
	class OperationsWithZeroTest {

		@ParameterizedTest
		@CsvSource(value = {"0, 4, 0", "0, 0, 4", "0, -4, 0", "0, 0, -4", "0, 0, 0"})
		void multiply(int rs, int x, int y) {
			assertEquals(rs, Math.multiplyExact(x, y));
		}
		
		@ParameterizedTest
		@CsvSource(value = {"4, 4, 0", "4, 0, 4", "-4, -4, 0", "-4, 0, -4", "0, 0, 0"})
		void add(int rs, int x, int y) {
			assertEquals(rs, Math.addExact(x, y));
		}
		
		@ParameterizedTest
		@CsvSource(value = {"4, 4, 0", "0, 0, 4", "-4, -4, 0", "0, 0, -4", "0, 0, 0"})
		void divide(int rs, int x, int y) {
			
			if(y==0) {
				assertThrows(
			            ArithmeticException.class, 
			            	() -> div(x, y)
			    );
			}else {
				assertEquals(rs, x/y);
			}
		}
		
		int div(int a, int b) {
	        return a / b;
	    }
		
	}

}




















