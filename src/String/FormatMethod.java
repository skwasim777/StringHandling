package String;

public class FormatMethod {
		public static void main(String[] args) {
			String s1 = "Hello";
			String s2 = "World";
			String s = s1.format("%s%s",s1,s2);
			System.out.println(s);
		}
}
