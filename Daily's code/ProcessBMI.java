package com.bmiProcess;

import bmi.data.BmiDataCapture;

public class ProcessBMI {

	public ProcessBMI() {
		super();
		// TODO Auto-generated constructor stub
	}
	
// BMI calculation 
	public float getbmi(BmiDataCapture bi) {
		return(bi.weight/(bi.height*bi.height));
	}
	
// BMI category show 
	public void showBMI(BmiDataCapture bi) {
		float bmi = getbmi(bi);
		
		if (bmi < 18.5f) {
			System.out.println("Your BMI is " + bmi + " You are Underweight");
		} 
		else if (bmi < 23.0f) {
			System.out.println("Your BMI is " + bmi + " You are Normal");
		} 
		else if (bmi < 25.0f) {
			System.out.println("Your BMI is " + bmi + " You are Overweight");
		} 
		else if (bmi < 30.0f) {
			System.out.println("Your BMI is " + bmi + " You are Obese (Class 1)");
		} 
		else {
			System.out.println("Your BMI is " + bmi + " You are Obese (Class 2)");
		}
	}
}
