package com.runtime;

public class DemoRTE {

	public static void main(String[] args) {
		
		// example for unchecked or runtime exception
		
		int len = args.length;	// get the length of the command line argument 
		try {
			
		int div = 10/len;	//
		System.out.println("division of no."+div);
		}
		
		catch(ArithmeticException ae) {
			System.out.println("Cannot divide a no by 0 ");
		}
		try {
		System.out.println("array values "+args[0]+" "+args[1]);
		System.out.println("all good");
		}
		
		catch(ArrayIndexOutOfBoundsException ai) {
			ai.printStackTrace();
		}
		
		try {
		A a = null;
		a.disp();	// invokes the method
		}
		catch (NullPointerException e) {
			System.out.println("mem allocation is necessary");
		}
		
		try {
		String s = "java";
		int b = Integer.parseInt(s);
		}
		
		catch (NumberFormatException nfe) {
			System.out.println("Cannot convert a string object containing chars into numbers ");
		}
		
		finally {
			System.out.println("End of the program");
		}
		
				
	}

}


// created A class but not creating its object 

class A{  
	void disp() {
		System.out.println("Welcome ");
	}
}