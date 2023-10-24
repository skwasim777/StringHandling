package String;

public class DoubleEqualOperator {
		public static void main(String[] args) {
			String s1 = "Wasim";
			String s2 = "Wasim";
			String s3 = new String("Wasim");
			System.out.println(s1==s2);
			System.out.println(s1==s3);
		}
}
