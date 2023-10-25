package StringMethods;

public class PrintOdd {
	public static void main(String[] args) {

		String str = "Wasim Shaikh Ashraf";
		for (int i = 0; i <= str.length() - 1; i++) {
			if (i % 2 != 0) {
				System.out.println("Char at " + i + " Palce " + str.charAt(i));
			}
		}
	}
}