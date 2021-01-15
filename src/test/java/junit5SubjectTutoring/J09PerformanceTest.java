package junit5SubjectTutoring;

import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;

public class J09PerformanceTest {
	
	@Test
	void performanceTest() {
		
		assertTimeout(Duration.ofSeconds(5), 
				
						() -> {
							IntStream.rangeClosed(0, 1000000).forEach(System.out::println);
						}
	
				     );		
	}
}
