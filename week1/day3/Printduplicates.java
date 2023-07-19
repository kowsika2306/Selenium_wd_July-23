package week1.day3;

import java.util.Arrays;

public class Printduplicates {

	public static void main(String[] args) {
		int[] nums = {2, 5, 7, 7, 5, 9, 2, 3};
		
		
	// two ways
		//easiest way
		//sort the array  int[] nums=	{2,2,3,5,5,7,7,9};
	/*
	 * Arrays.sort(nums); for(int i=0;i<nums.length-1;i++) { if (nums[i]==nums[i+1])
	 * { System.out.println(nums[i]); }
	 * 
	 * }ctrl shift / or ctrl /
	 */
		
		//m2
		
		for(int i=0;i<nums.length;i++) {//outer loop i=1
			for(int j=i+1;j<nums.length;j++) {//inner loop 
				if(nums[i]==nums[j]) {//(0,1) (0,2) (0,3)..length of the array
					//(1,1) 1,2) (1,3)..length
					System.out.println(nums[i]);
				}
			}
			
		}
		
		
		
		
		
		
		

	}

}
