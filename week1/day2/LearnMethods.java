package week1.day2;

public class LearnMethods {

	public void windowShopping() {
		int noOfpeople = 100; // local variable
		System.out.println("Scan through the pdts");
	}

	public int orderFood(String foodItem, int count) {
		// count = 5;
		System.out.println("Chit chatting");
		return count;
	}
	public boolean morefood(boolean yesOrNo) {
		return yesOrNo;// last stament
	}
	private int payBill(int hardcash) {
		System.out.println("Bill Amount " + hardcash);
		return hardcash;
	}

	public static void main(String[] args) {
		// to use class level methods -->create a reference for the class
		// Classname refVariable/object =new Classname();
		LearnMethods mall = new LearnMethods();
		// pascal case

		mall.windowShopping();
		// ctrl+2l
		boolean morefood = mall.morefood(true);
		mall.orderFood("Rotis", 10);
		int orderFood = mall.orderFood("FriedRice", 2);
		System.out.println(orderFood);
		int payBill = mall.payBill(orderFood * (500));
		System.out.println(payBill);

	}

}
