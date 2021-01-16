package junit5tutoring;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class C03ArraysCompareTest {

	@ParameterizedTest
	@MethodSource("arrayProvider")
	void compareArrayElementsTest(Boolean result, Object[] a1, Object[] a2) {
		
		C03CompareArrayElements str = new C03CompareArrayElements();
		
		assertEquals(result, str.compareElementsOfTwoArrays(a1, a2));
		
		System.out.println("Test is executed");
	}
	
	static Stream<Arguments> arrayProvider() {
		Integer a1[] = {1, 2, 3};
		Integer a2[] = {1, 3, 2};
		
		String s1[] = {"a", "b"};
		String s2[] = {"b", "a"};
		
		Double d1[] = {2.3, 3.4};
		Double d2[] = {2.3, 3.4};
		
		Boolean b1[] = {};
		Boolean b2[] = {};
		
		Float f1[] = {1f, 2.3f, 3.51f};
		Float f2[] = {2.3f, 2f, 3.51f};
		
        return Stream.of(
        		Arguments.of(true, a1, a2),
        		Arguments.of(true, s1, s2),
        		Arguments.of(true, d1, d2),
        		Arguments.of(true, b1, b2),
        		Arguments.of(false, f1, f2)
        );
    } 

}
