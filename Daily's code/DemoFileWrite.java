package com.io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class DemoFileWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileWriter fw; // used to write the data into a text file 
		BufferedReader br; // used to read data from the console 
		// inputStreamReader isr; // converts bytes to chars
		try {
			fw = new FileWriter("emp.txt",true); // create new text file, if not existing 
			// if existing overwrites
			// prompting data from console 
			// isr = new inputStreamReader(System.in);
			//above 2 lines can be replaced by the follwing 
			br = new BufferedReader(new InputStreamReader(System.in));
			// read the data from the console 
			System.out.println("Enter emp id");
			String emp_id = br.readLine();
			System.out.println("Enter Emp Name");
			String emp_name = br.readLine();
			System.out.println("Enter Name emp basic Salary ");
			String emp_bsal = br.readLine();
			
			//writing data into the text file 
			fw.write(emp_id);
			fw.write('#');
			fw.write(emp_name);
			fw.write('#');
			fw.write(emp_bsal);
			fw.write("\n");
			fw.close(); // important as data will not be updated 
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		

	}

}
