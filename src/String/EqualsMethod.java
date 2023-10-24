package String;

public class EqualsMethod {
		public static void main(String[] args) {
			String s1 = "Wasim";
			String s2 = "Wasim";
			String s3 = new String("Wasim");
			String s4 = "Shaikh";
			System.out.println(s1.equals(s2));
			System.out.println(s1.equals(s3));
			System.out.println(s1.equals(s4));
		}
}
