package junit5tutoring;

public class C02FirstLastChars {
	
	public boolean areFirstAndLastTwoCharactersTheSame(String str) {

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
