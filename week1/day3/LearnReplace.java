package week1.day3;

public class LearnReplace {

	public static void main(String[] args) {
		
		String s="Rs,2000";
		String replace = s.replace("s", "1");
		System.out.println(replace);
		
		String replaceAll = s.replaceAll(",", "");
		System.out.println(replaceAll);
		
		/*
		 * String replaceAll2 = replaceAll.replaceAll("[^A-Za-z]","" );
		 * System.out.println(replaceAll2);
		 */

		String num= replaceAll.replaceAll("[A-Za-z]","" );
		System.out.println(num+200);//append the 200 to 2000
		//to convert  string into integer --.parsing
		int n=Integer.parseInt(num);
		System.out.println(n+200);
		
		
		//to reterive a part of string
		
		String substring = s.substring(5);
		System.out.println(substring);
		
		String substring2 = s.substring(2, 6);
		System.out.println(substring2);
		
		
		//to verify the part of the string presnt in the a string
		
		boolean contains = s.contains("RS");
		System.out.println(contains);
		
		
		String s1="Testleaf";
		String lowerCase = s1.toLowerCase();
		System.out.println(lowerCase);
		
		String upperCase = lowerCase.toUpperCase();
		System.out.println(upperCase);
	}

}
