package Util;

import java.util.Scanner;

import Service.OperationServiceImpl;
import Service.OpretionService;

public class Controller {
	public static void main(String[] args) {

		OpretionService op = new OperationServiceImpl();

		Scanner sc  =new Scanner(System.in);

		while(true) {
			System.out.println("A. Add Student With Multiple Subject.");
			System.out.println("B. Show All Student Data");
			System.out.println("C. Get Single Student Data");
			System.out.println("D. update Student");
			System.out.println("E.updatePerticularSubjectusingStudentId");
			System.out.println("F. deleteStudent");
			System.out.println("G.addMultipleSubjectToSingleStudent ");
			System.out.println("H.showAllSubjectWithStudentData ");
			System.out.println("I.getSingleSubjectWithStudentData");
			System.out.println("J.updateSubject ");
			String ch = sc.next();

			switch (ch) {
			case "A":
				op.addStudentWithMultipleSubject();
				break;
			case "B":
				op.showAllStudentDataWithMultipleSubject();
				break;
			case "C":
				op.getSingeStudentWithMultipleSubject();
				break;
			case "D":
				op.updateStudent();
				break;
				
			case "E":
				op.updatePerticularSubjectusingStudentId();
				break;
				
			case "F":
				op.deleteStudent();
				break;
				
			case "G":
				op.addMultipleSubjectToSingleStudent();
				break;
				
			case "H":
				op.showAllSubjectWithStudentData();
				break;
				
				
			case "I":
				op.getSingleSubjectWithStudentData();
				break;

			case "J":
				op.updateSubject();
				break;

			default:
				break;
			}
		}


	}

}


