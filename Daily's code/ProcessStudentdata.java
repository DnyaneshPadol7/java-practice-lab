package com.process;

import com.data.StudentDataCapture;

public class ProcessStudentdata {

	public ProcessStudentdata() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// functions
	// get the total marks
	public int getTotMks(StudentDataCapture sd) {
		return (sd.mks_csc + sd.mks_mm);
	}
}
