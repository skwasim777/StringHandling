package StringMethods;

public class GetByteMethod {
	public static void main(String[] args) {
		String str = "ABCD";
		byte[] b = str.getBytes();
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		String s= "abcdefg";
		byte[] br = s.getBytes();
		for(int i=0;i<br.length;i++) {
			System.out.println(br[i]);
		}
		// getting string back
		String s1 = new String(s);
		System.out.println(s1);
	}
}
