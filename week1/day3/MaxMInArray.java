package week1.day3;

import java.util.Arrays;

public class MaxMInArray {

	public static void main(String[] args) {

		int scores[] = { 98, 87, 89, 56, 78 };

		Arrays.sort(scores);// arrange the values in ascending order

		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}

		System.out.println("The minimum value in the array " + scores[0]);
		System.out.println("The maximum value in the array " + scores[(scores.length) - 1]);
		// cant change the size of the array and once it is declared it is fixed
		// other way to declare the array
		// using new keyword -->using object/instantiation

		// datatype[] objName=new dataType[size];

		int[] marks = new int[6];
		marks[0] = 67;
		marks[1] = 89;
		marks[2] = 90;
		marks[3] = 45;
		marks[4] = 78;
		marks[5] = 68;

	}

}
