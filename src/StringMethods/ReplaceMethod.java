package StringMethods;

public class ReplaceMethod {
	public static void main(String[] args) {
		String str = "Java is very easy but not for everyone";
		String rep = str.replace('a', 'e');
		System.out.println(rep);

		String s = "my name is khan my name is java";
		String rep1 = s.replace("is", "was");
		System.out.println(rep1);

		String s1 = "oooooo-hhhhhh-oooooooo";
		String rs = s1.replace('h', 's');
		System.out.println(rs);
		rs = s1.replace('s', 'h');
		System.out.println(rs);
	}
}
