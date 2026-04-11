package com.demo.stat;

public class DemoFundsCollected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FundsCollected obj1 = new FundsCollected("Dnyanesh", 10000);
		FundsCollected obj2 = new FundsCollected("Ganesh", 1000);
		FundsCollected obj3 = new FundsCollected("Piyush", 2000);
		System.out.println("Total funds collected "+FundsCollected.getTotFunds());
		

	}

}

class FundsCollected{
	String donor_name;
	int donor_amt;
	static int tot_funds_coll = 0;
	
	static int getTotFunds() {
		return tot_funds_coll;
	}

	// constructor 
	public FundsCollected(String donor_name, int donor_amt) {
		super();
		this.donor_name = donor_name;
		this.donor_amt = donor_amt;
		this.tot_funds_coll += donor_amt;
	}
	
	
}