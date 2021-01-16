package junit5tutoring;

import java.util.Arrays;

public class C03CompareArrayElements {

	public <T>  boolean compareElementsOfTwoArrays(T[] a, T[] b) {

		Arrays.sort(a);
		Arrays.sort(b);
		
		if (Arrays.equals(a, b)) {
			return true;	
		} else {
			return false;
		}
	}
}
