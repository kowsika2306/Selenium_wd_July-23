package week1.day2;

public class Restaurant {

	public void resName() {
		System.out.println("A2B");
	}
	
	public static void main(String[] args) {
		
		LearnMethods callMethods=new LearnMethods();		
		callMethods.orderFood("Dosa", 10);
		//callMethods.payBill(1000);
		
		Restaurant name=new Restaurant();
		name.resName();
		
	}

}
