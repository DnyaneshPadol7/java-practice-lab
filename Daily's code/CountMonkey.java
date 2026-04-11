package com.demo.stat;

public class CountMonkey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CountNoOfMonkeys obj1 = new CountNoOfMonkeys();
		CountNoOfMonkeys obj2 = new CountNoOfMonkeys();
		CountNoOfMonkeys obj3 = new CountNoOfMonkeys();
		
		// getting the ocunt of monkeys
		System.out.println("total no of monkeys are "+CountNoOfMonkeys.getCount());


	}
	
}

class CountNoOfMonkeys{
	 static int count = 0;
	public CountNoOfMonkeys() {
		super();
		// TODO Auto-generated constructor stub
		count +=1;
	}

	static int getCount() {
		return count;
	}
}