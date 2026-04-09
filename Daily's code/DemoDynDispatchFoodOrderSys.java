package com.demo.dyn;

public class DemoDynDispatchFoodOrderSys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FoodOrder order;
		
		order = new Pizza();
		order.prepareFood();
		
		order = new Burger();
		order.prepareFood();

	}

}

abstract class FoodOrder{
	
	abstract void prepareFood();
}

class Burger extends FoodOrder {

	@Override
	void prepareFood() {
		// TODO Auto-generated method stub
		System.out.println("Preparing Burger...");
	}
	
}

class Pizza extends FoodOrder {

	@Override
	void prepareFood() {
		// TODO Auto-generated method stub
		System.out.println("Preparing Pizza...");
	}
	
	
}