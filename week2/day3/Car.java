package week2.day3;

public class Car extends Vehicle{//Single inheritance

	public void noOfWheels() {
		System.out.println("4 Wheels");

	}
	
	public void applyBrake() {
		super.applyBrake();
		System.out.println("ABS BrakeSystem");
	}
	//Method Overriding -->Same Methodsignature between two classes with a is-a relationship
	
	//Same methodName, Same arguments in different class (works on inheritance)
}
