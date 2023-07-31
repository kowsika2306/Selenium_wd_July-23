package week3.day1;

public class LearnThis {

	int x;
	int y;
	String name;
	
	public LearnThis() {
		System.out.println("I m from defConstructor");
	}
	
    public LearnThis(int empNum, String empName) {
		this();
		System.out.println(empNum +" "+empName);
	}
    
	
	public void empDetails(int x, String name) {
		//this keyword-->used to resolve the ambiquity of local variable and global varible
		//which shares the common name
		y=x;
		this.x=x;
		System.out.println(this.x +" "+ name);
	}
	
	public void emp() {
		this.empDetails(x, name);
		System.out.println("emp details");
	}
	
	
	
	
	public static void main(String[] args) {
	
		LearnThis emp=new LearnThis(34,"Vishal");
		emp.empDetails(45, "Revathy");
	System.out.println(emp.x);
	System.out.println(emp.name);
		
		
	}

}
