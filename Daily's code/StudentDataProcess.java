package com.studProcess;

import com.studData.StudentDataCapture;

public class StudentDataProcess {

	public StudentDataProcess() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getTotalMark(StudentDataCapture s) {
		return (s.math + s.scie + s.chem); 
	}
	
	public float getPercentage(StudentDataCapture s) {
		float total = getTotalMark(s);
		return (total / 300)*100;
	}
	
	public String getGrade(StudentDataCapture s) {
		float per = getPercentage(s);
		
		if (per >=90 ) return "A+";
		else if(per >= 75) return "A";
		else if(per >= 60) return "A";
		else if(per >= 50) return "A";
		else if(per >= 40) return "A";
		else return "fail";
	}

}
