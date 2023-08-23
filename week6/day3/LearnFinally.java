package week6.day3;

import java.io.IOException;

public class LearnFinally {

	public static void main(String[] args) throws IOException {
		
	final int a=10;//constant /fixed
	int b=0;	
	try {
		System.out.println(a/b);
	}
	finally {
		System.out.println("Close the db connection");
		Runtime.getRuntime().exec("taskkill /f /im chromedriver.exe");
	}
	
	System.out.println("End of program");
}
}
