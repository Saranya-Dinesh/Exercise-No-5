package org.kiot.student;
import java.util.Scanner;
public class StudentManagement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Student student = new Student();
		if(student.checkLoanEligibilty()) {
			System.out.println("You are eligible for Education loan");
		} else {
			System.out.println("You are not eligible for Education loan");
		}
	}
}
