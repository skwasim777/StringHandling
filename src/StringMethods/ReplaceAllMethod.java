package StringMethods;

public class ReplaceAllMethod {
	public static void main(String[] args) {
		String str = "javatpoint is very good website";
		String rep = str.replaceAll("a", "e");
		System.out.println(rep);

		// replcae word
		String str1 = "my name is wasim.my name is md.my name is afjal";
		String rep1 = str1.replaceAll("is", "was");

		System.out.println(rep1);

		// add spaces between character
		String str2 = "JavaTpoint";
		System.out.println(str2);
		String regex = "";
		str2 = str2.replaceAll(regex, " ");
		System.out.println(str2);
	}
}
