package week1.day2;

public class LearnForLoop {

	public static void main(String[] args) {
		
		
		// to loop a condition 
		// to print number from 10 to 20
		
		//for(initializing the variable; range of variable;incrementValue){}
		//++ -->increment operator adding one value to it  i++ -->i+1
		//-- -->decrement operator i--
		
		for(int i=10;i<=20;i++) {			
		System.out.println(i);				
		}
		
		for(int i=20;i>=10;i--) {
			System.out.println(i);
		}
		
		
		//to print hte number which are divisible by 2 from the range of numbers 10 to 20

		
		for(int y=10;y<=20;y++) {
		if(y%2==0) {// == comparision
			System.out.println("Number is "+y+" divisible by 2");
		}
		else {
			System.out.println("Number is "+y+" not divisible by 2");
		}
		}
		
		
		

	}

}
