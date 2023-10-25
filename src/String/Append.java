package String;

public class Append {
	public static void main(String[] args) {
		StringBuilder s1 =new StringBuilder("Wasim");
		StringBuilder s2 =new StringBuilder("Shaikh");
		StringBuilder s3 = s1.append(s2);
		System.out.println(s3.toString());
	}
}
