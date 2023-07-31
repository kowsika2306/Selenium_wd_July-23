package week3.day1;

public class LearnStatic {
	
	
	static {
		System.out.println("I m from sTATIC block");
	}
	{
		System.out.println("I m from non static block");
	}

	int n;
	int x=10;//instance variables
	static int a=15;
	final float b=5.0f;
	static final float pi=3.14f;//constant
	public static void calculation()
	{
		
		System.out.println(a);
		
		a=a+5;
	}
	
	public static void manipulation() {
		System.out.println("Maniupulating numbers" +a);
	}
	
	public void add() {
		System.out.println("addition fun");
		manipulation();
		//b=b+2.0f;
		
		
	}
		
	
	public static void main(String[] args) {
		int count;
		LearnStatic cal=new LearnStatic();
		
		cal.add();
		System.out.println(cal.x);
		System.out.println(a);
		manipulation();
		//hirerachy-->static ->constructor -->normal
		
		//static -->memory management -->one memory ref under class
		//variables, methods

	}

}
