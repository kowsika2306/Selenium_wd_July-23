package week3.day1;


import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDupCharacters {

	public static void main(String[] args) {

		String s = "google";
		// convert the string to char array
		char[] charArray = s.toCharArray();

		Set<Character> uniqueChar = new LinkedHashSet<Character>();
		Set<Character> dChar = new LinkedHashSet<Character>();

		for (int i = 0; i < charArray.length; i++) {
			if (!uniqueChar.add(charArray[i])) {

				dChar.add(charArray[i]);
			}
		}

		for (Character character : uniqueChar) {
			System.out.print(character);
		}

		System.out.println(dChar);
		
		
		
		

	}

}
