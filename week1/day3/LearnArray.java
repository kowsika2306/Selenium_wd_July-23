package week1.day3;

public class LearnArray {

	public static void main(String[] args) {

		// Declare the array
		int scores[] = { 98, 87, 89, 95, 78, 78 };

		System.out.println(scores[4]);

		// to count number of elements in the array
		// property of array

		int length = scores.length;
		System.out.println(length);
		System.out.println(scores[length - 1]);

		System.out.println(scores);// address of the array

		// to retreive all the elements of the array

		for (int i = 0; i < length; i++) {
			System.out.println(scores[i]);
		}

		//to print reverse order
		
		for(int i=length-1;i>=0;i--) {
			System.out.println(scores[i]);
		}
		
		
	}

}
//ArrayIndexOutOfBoundsException
//-->when you find the array elements out of the index