package junit5tutoring;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class C02FirstLastTwoCharsTest {
	
	C02FirstLastCharsTwoChars str;
	
	@BeforeEach
	void setUp() {
		str = new C02FirstLastCharsTwoChars();
		System.out.println("Test data is initialized");
	}
	
	@AfterEach
	void tearDown() {
		str = null;
		System.out.println("Test data is null");
	}
	//ABAB==>true, AB==>true, A==>false, ""==>false, ABCD==>false
	@ParameterizedTest
	@ValueSource(strings = {"ABAB", "AB"})
	void checkFirstLastTwoCharsSame_PositiveScenario(String actual) {
		assertTrue(str.areFirstAndLastTwoCharsSame(actual));
		System.out.println("Test is executed");
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"ABCD", "A", ""})
	void checkFirstLastTwoCharsSame_NegativeScenario(String actual) {
		assertFalse(str.areFirstAndLastTwoCharsSame(actual));
		System.out.println("Test is executed");
	}

}
