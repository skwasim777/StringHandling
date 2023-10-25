package StringMethods;

public class CountFrequencyOfCharacter {
	public static void main(String[] args) {
		String str = "Wasim Shaikh Ashraf";
		int count = 0;
		for (int i = 0; i <= str.length() - 1; i++) {
			if (str.charAt(i) == 'a') {
				count++;
			}
		}
		System.out.println(count);
	}
}
