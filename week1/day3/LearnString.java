package week1.day3;

public class LearnString {

	public static void main(String[] args) {
			
		//Literal way
		String name="Testleaf";		
		//using object
		String value=new String("Testleaf");
				
		if(name==value) {//== refers to compare the memory of the location of the string s
			System.out.println("the values are same");
		}
		else {
			System.out.println("the values are not same");
		}

		if(name.equals(value)) {//compares the values of the strings
			System.out.println("the values are same");
		}else {
			System.out.println("the values are not same");
		}
		
		
		String str="Testleaf";
		if(name==str) {//== refers to compare the memory of the location of the string s
			System.out.println("the values are same");
		}
		else {
			System.out.println("the values are not same");
		}
		
		
		
		
		
		
	}

}
