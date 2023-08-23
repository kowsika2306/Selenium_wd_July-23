package week6.day3;

public class LearnThrows {

	
	static void add(int a, int b) throws InterruptedException {
		//int c=a+b;
		
		if(a<b) {
			System.out.println(a+b);
		}
		else {
			//customized exception 
			//explicitly throwing exception
			throw new ArithmeticException("Invalid inputs");
		}
		System.out.println("End of the Program");
	}
		
	public static void main(String[] args) throws InterruptedException {
	
          try {
			add(5,2);
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
	}

}
