package week3.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] numbers= {1,3,2,4,2,5,4,6,3,4};
		
		Set<Integer>unique =new LinkedHashSet<Integer>();
		Set<Integer>dupVal=new LinkedHashSet<Integer>();
		
		for(int i=0;i<numbers.length;i++) {
			
			//Set will not allow dup 
			if(!unique.add(numbers[i])){
				dupVal.add(numbers[i]);
			}
		}
	
		System.out.println(unique);
		
		System.out.println(dupVal);
		
		
		
		
		
	}

}
