package week3.day1;

public class LearnConstructor {

	
	
	public LearnConstructor() {
		System.out.println("I m from default constructor");
	}
	//Constructor overloading
	public LearnConstructor(int x) {
		
		System.out.println("I m from parametrized constructor" +x);
	}
	

	public static void main(String[] args) {
		LearnConstructor obj=new LearnConstructor(10);
		LearnConstructor call=new LearnConstructor();
		
       
	}

}
//Constructor is of special method-->which carries as the ClassName
//it will not have normal method syntax-->it does not have return type