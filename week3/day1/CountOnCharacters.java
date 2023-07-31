package week3.day1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import javax.xml.stream.events.Characters;

public class CountOnCharacters {

	public static void main(String[] args) {
		
		String s="google";
		
		char[] charArray = s.toCharArray();		
		
		List<Character> values=new LinkedList<Character>();
		
		for (int i = 0; i < charArray.length; i++) {
			values.add(charArray[i]);
					}
		
		int frequency = Collections.frequency(values, 'o');
		System.out.println(frequency);
		
		
		
	}

}
