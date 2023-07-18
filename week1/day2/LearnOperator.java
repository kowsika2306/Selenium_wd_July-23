package week1.day2;

public class LearnOperator {

	public static void main(String[] args) {
	
		int x=10;
		int y=3;
		
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x/y); //quotient 
		System.out.println(x*y);
		System.out.println(x%y);
		//mod-->% -->remainder of the division

		if(y%2==0) {// == comparision
			System.out.println("Number is divisible by 2");
		}
		else {
			System.out.println("Number is not divisible by 2");

		}
	}

}
