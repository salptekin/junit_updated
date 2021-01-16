package junit5tutoring;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;

class C04IntArraySortTest {

	@Test
	void C04IntArraySortPerformanceTest() {
		
		C04IntArraySort obj = new C04IntArraySort();
		
		assertTimeout(Duration.ofSeconds(1), 
				
				() -> {
					IntStream.rangeClosed(0, 100000).forEach(t->obj.sortArrayInAspecifiedTime());
				}

		     );	
	}

}
