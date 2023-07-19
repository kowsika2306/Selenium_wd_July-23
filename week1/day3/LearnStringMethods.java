package week1.day3;

public class LearnStringMethods {

	public static void main(String[] args) {
		
		String s="Testleaf";
		
		int length = s.length();//number of character in the string
		System.out.println(length);
		
		String str="testleaf";
		
		if(s.equals(str)) {
			System.out.println("the values are same");
		}else {
			System.out.println("the values are not same");
		}		
		
		if(s.equalsIgnoreCase(str)) {
			System.out.println("the vaues are same");
		}
		else {
			System.out.println("the values are not same");
		}
	}

}
