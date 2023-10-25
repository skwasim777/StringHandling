package String;

import java.util.StringJoiner;

public class StringJoinerClass {
		public static void main(String[] args) {
			StringJoiner j = new StringJoiner(",");
			j.add("Hello");
			j.add("World");
			System.out.println(j);
		}
}
