package week1.day3;

public class LearnSplit {

	public static void main(String[] args) {
		String s="Learning Java";
		
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));

		}
		//avaJ gninraeL		
		//gninraeL avaJ
		System.out.println();
		String[] split = s.split(" ");
		System.out.println(split.length);
		
		for(int i=0;i<split.length;i++) {
		System.out.println(split[i]);
		}
	}

}
