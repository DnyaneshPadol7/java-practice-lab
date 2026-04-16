package com.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DemoFileRead {

	public static void main(String[] args) {
		
		// program to read the content of the text file 
		FileReader fr = null; // to point to the text file 
		BufferedReader br;
		String data = null;
		try {
			fr = new FileReader("D:\\sjdffkjsdfkhsdkfhghghjghjjhhjghg.txt\\");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   // if file not existing, exception generated
		br = new BufferedReader(fr);   // br is pointing to fr for efficient reading of data
		try {
			data = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // reading the first line of data
		// reading the content of the file until the end 
		while (data!= null) {
			System.out.println(data);
			try {
				data = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}

}
