package week1.day2;

public class LearnIfStatement {

	public static void main(String[] args) {
		//positive number 
		//num>0 -->positivr number
		//num!>0 -->negative  --> ! -not
		//!= -->not equal
		
		int num=-10;
		
		//if(condition){}
		
		
		if(num>0) {
			System.out.println("The Given number "+num +" is Positive");
		}else if(num<0){
			System.out.println("The Given number "+num +" is negative");
		}else {
			System.out.println("The given number  "+num +" is neutral" );
		}
		
		
		
		

	}

}
