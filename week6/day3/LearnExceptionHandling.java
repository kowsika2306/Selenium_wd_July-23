package week6.day3;

public class LearnExceptionHandling {

	public static void main(String[] args) {

		int a = 10;
		int b =1;
		String s=null;
		try {
			System.out.println(a / b);
			System.out.println(s.length());
		} catch (ArithmeticException e) {
			System.out.println("check your inputs  " +e);
			
		}catch(Exception g) {
			System.out.println(g);
		}
		System.out.println("End of Program");

	}

}
