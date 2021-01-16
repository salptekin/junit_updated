package junit5tutoring;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class C01StringModifierTest {
	/*
	  Note Test methods naming convention is MethodName + Tests ==> truncateAInFirst2PositionsTests 
	*/
	
	C01StringModifier strToModify;
	
	@BeforeEach
	void setUp() {
		strToModify = new C01StringModifier();
		System.out.println("Test data is initialized");
	}
	
	@AfterEach
	void tearDown() {
		strToModify = null;
		System.out.println("Test data is null");
	}
	
	@ParameterizedTest
	@CsvSource(value = {"BC, AABC", "BC, ABC", "BCDE, BCDE", "BCAA, BCAA", "\"\", \"A\"", "\"B\", \"B\""})
	void truncateAInFirst2PositionsTests(String expected, String actual) {
		assertEquals(expected, strToModify.truncateAInFirst2Positions(actual));
		System.out.println("Test is executed");
	}

}
