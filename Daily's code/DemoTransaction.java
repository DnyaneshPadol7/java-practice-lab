package com.trsn;

public class DemoTransaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InsufficeientBalanceException cust = new InsufficeientBalanceException();
		// cust.accountWithdraw(300,500);

	}

}


class InsufficeientBalanceException extends Exception{
	int balnce;
	int withdrawAmt;
	
	public InsufficeientBalanceException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InsufficeientBalanceException(int balnce, int withdrawAmt) {
		super();
		this.balnce = balnce;
		this.withdrawAmt = withdrawAmt;
	}
	
	
}


class Account {
	
	int balnce;
	int withdraw;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(int balnce, int withdraw) {
		super();
		this.balnce = balnce;
		this.withdraw = withdraw;
	}
	
	
	void accountWithdraw (int balnce,int withdraw) throws InsufficeientBalanceException{
	if (withdraw > balnce) {
		throw new InsufficeientBalanceException(balnce,withdraw);
	}
		
		else {
			System.out.println("Withdraw Successfully");
		}
	}
	
}

	
