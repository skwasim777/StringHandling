package String;

public class Example01 {
	public static void main(String[] args) {
		// creating string by java string literal
		String s1 = "java";
		char ch[] = { 's', 't', 'r', 'i', 'n', 'g' };
		// converting char into string object
		String s2 = new String(ch);
		// creating java string by new keyword
		String s3 = new String("wasim");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
