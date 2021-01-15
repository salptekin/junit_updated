package junit5tutoring;

public class C01StringModifier {
	
	/*
	 	Note: Do not mix the test codes with the source codes
	 	Note: Create the test under src/test/java
	 	      Click on the right button of the mouse ==> JUnit Test Case ==> Browse ==> Select C01StringModifier
	 	Note: Make the package name under src/test/java same with the package name under src/main/java
	 	Note: Naming convention for the test class is like "ClassName + Test" ==>  C01StringModifierTest     
	*/
	
	//AABC==>BC, ABC==>BC, BCDE==>BCD, BCAA==>BCAA
	public String truncateAInFirst2Positions(String str) {
		
		if (str.length() <= 2) {
			return str.replaceAll("A", "");
		}	

		String firstTwoChars = str.substring(0, 2);
		String stringAfterFirstTwoChars = str.substring(2);

		return firstTwoChars.replaceAll("A", "") + stringAfterFirstTwoChars;
	}

}
