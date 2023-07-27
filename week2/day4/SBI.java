package week2.day4;

public class SBI implements LoanPolicy, CIBIL {
	// concrete class implementing the interface->keyword implements

	@Override
	public void rateOfInt() {
		System.out.println("ROI is 8%");

	}

	@Override
	public void kycDoc() {
		System.out.println("Income proof");

	}

	@Override
	public void cibilScore() {
		System.out.println("CleanScore");

	}

	@Override
	public void loanPolicy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float loanInterest(float r) {
		// TODO Auto-generated method stub
		return r;
	}

	// inheritance is possible between two similar classes and also interface

	// multiple inheritance is not possible at class level
	// can be acheived at interface level
}
