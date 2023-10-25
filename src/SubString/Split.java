package SubString;

import java.util.Arrays;

public class Split {
	public static void main(String[] args) {
		String txt = new String("Hello, My Name Is Wasim");
		String[] sentences = txt.split("\\.");
		System.out.println(Arrays.toString(sentences));
	}
}
