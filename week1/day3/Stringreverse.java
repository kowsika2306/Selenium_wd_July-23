package week1.day3;

public class Stringreverse {

	public static void main(String[] args) {

		String s = "Vidya";

		char charAt = s.charAt(3);
		System.out.println(charAt);
		// aydiV

		
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));

		}
		
		System.out.println();
		
		// to conver tthe string into characters
		//Vidya -->V,i,d,y,a
			
		char[] ch = s.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]);
		}
		
		System.out.println();
		for(int i=ch.length-1;i>=0;i--) {
			System.out.print(ch[i]); 
		}
		

	}

}
