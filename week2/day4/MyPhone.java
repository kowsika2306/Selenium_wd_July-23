package week2.day4;

public class MyPhone extends AndroidTV implements Android{

	public static void main(String[] args) {
		
		MyPhone a=new MyPhone();
		a.watchVideo();
		a.openApp();
	}

	@Override
	public void watchVideo() {
	System.out.println("Watch video from mobile");
		
	}

	
	

	
}
