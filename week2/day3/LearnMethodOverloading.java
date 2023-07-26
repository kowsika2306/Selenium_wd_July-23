package week2.day3;

public class LearnMethodOverloading {

	public void empDetails() {
		System.out.println("Complete details");
	}

	public String empDetails(String name) {
		System.out.println(name);
		return name;

	}

	public long empDetails(String name, long phno) {
		System.out.println(name + "" + phno);
		return phno;
	}

	public void empDetails(long phno, String name) {
		System.out.println(name + "" + phno);
	}

	// Method Overloading-->Same Class(Within)-->same methodName with different
	// arguments

	public static void main(String[] args) {
		LearnMethodOverloading overl = new LearnMethodOverloading();
		overl.empDetails();
		overl.empDetails(6735271090l, "Ajeesh");
		overl.empDetails("Dhivya", 9826289109l);
	}

	public static void main(int args) {

	}

}
