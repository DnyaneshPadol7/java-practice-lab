package com.demo.dyn;

public class DemoDynDispatchPayment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Payment pay;	// refers variable to Abstract class
		
		pay = new UPI();	
		pay.payAmount();
		System.out.println(pay.payAmount());
		
		
		
		pay = new CreditCard();
		pay.payAmount();
		System.out.println(pay.payAmount());
	}

}

abstract class Payment{
	abstract int payAmount(); // Abstract method created
}

class UPI extends Payment{

	@Override
	int payAmount() {
		// TODO Auto-generated method stub
		return 100;
	}
	
	
}

class CreditCard extends Payment{

	@Override
	int payAmount() {
		// TODO Auto-generated method stub
		return 300;
	}
	
}






