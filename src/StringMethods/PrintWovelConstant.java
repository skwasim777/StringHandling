package StringMethods;

import java.util.ArrayList;

public class PrintWovelConstant {
	ArrayList<Character> al;

	public PrintWovelConstant() {
		al = new ArrayList<Character>();
		al.add('A');
		al.add('E');
		al.add('a');
		al.add('e');
		al.add('I');
		al.add('O');
		al.add('i');
		al.add('o');
		al.add('U');
		al.add('u');
	}

	// a method that cheks weather the character c is vowel or not
	public boolean isVowel(char c) {
		for (int i = 0; i < al.size(); i++) {
			if (c == al.get(i)) {
				return true;
			}
		}
		return false;
	}

	// a method that calculates vowel in the string
	public int countVowel(String str) {
		int countVowel = 0;// store total number of vowels
		int size = str.length();
		for (int j = 0; j < size; j++) {
			char c = str.charAt(j);
			if (isVowel(c)) {
				countVowel = countVowel + 1;
			}
		}
		return countVowel;

	}

	// main method
	public static void main(String[] args) {
		PrintWovelConstant o = new PrintWovelConstant();
		String str = "Java is the best language to learn in upcoming year";
		int numberOfVowel = o.countVowel(str);
		System.out.println("String -> " + str);
		System.out.println("The Number Of vowel in string are " + numberOfVowel);
	}
}
