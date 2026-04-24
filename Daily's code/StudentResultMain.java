package com.studMain;

import com.studData.StudentDataCapture;
import com.studProcess.StudentDataProcess;

public class StudentResultMain {

    public static void main(String[] args) {

        StudentDataCapture s = new StudentDataCapture("Piyush", 80, 70, 60);
        StudentDataProcess p = new StudentDataProcess();

        System.out.println("Name : " + s.name);
        System.out.println("Total Marks : " + p.getTotalMark(s));
        System.out.println("Percentage : " + p.getPercentage(s));
        System.out.println("Grade : " + p.getGrade(s));
    }
}