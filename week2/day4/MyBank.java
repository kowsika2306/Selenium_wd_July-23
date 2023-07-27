package week2.day4;

public class MyBank {

	public static void main(String[] args) {

		//Cannot Create object for Interface
		//RBI trans=new RBI();
		
		ICICI ic=new ICICI();		
		ic.kycDoc();
		ic.rateOfInt();
		ic.premiumCustomer();
		
		
		
		RBI sb=new SBI();
		sb.kycDoc();
		sb.rateOfInt();
		
		
		CIBIL s=new SBI();
		s.cibilScore();
	
		
		
		
		
	}

}
