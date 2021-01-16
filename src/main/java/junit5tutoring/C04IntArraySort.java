package junit5tutoring;

import java.util.Arrays;
import java.util.Random;

public class C04IntArraySort {

	public void sortArrayInAspecifiedTime() {
		
		 Random rand = new Random();
		
		 int[] a = new int[5];
		 
		 for(int i=0; i<a.length; i++) {
			 a[i] = rand.nextInt(100);
		 }
		 Arrays.sort(a);
		 
		 System.out.println(Arrays.toString(a));
		 
	}


}
