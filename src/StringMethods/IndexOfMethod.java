package StringMethods;

public class IndexOfMethod {
	public static void main(String[] args) {
		String s = "hey gys how are u";
		int i1 = s.indexOf("hey");
		int i2 = s.indexOf("gys");
		System.out.println(i1 + " " + i2);
		
		// passing substring with from index
		int i3 = s.indexOf("gys",4);
		System.out.println(i3);
	}
}
