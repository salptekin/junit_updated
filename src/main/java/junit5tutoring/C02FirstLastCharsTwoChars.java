package junit5tutoring;

public class C02FirstLastCharsTwoChars {
	
	//ABCD==>false, ABAB==>true, AB==>true, A==>false, ""==>false
	public boolean areFirstAndLastTwoCharsSame(String str) {

		if (str.length() <= 1) {
			return false;
		}
		if (str.length() == 2) {
			return true;
		}

		String firstTwoChars = str.substring(0, 2);

		String lastTwoChars = str.substring(str.length() - 2);

		return firstTwoChars.equals(lastTwoChars);
	}

}
