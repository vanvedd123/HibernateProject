package Com.Controller;

import java.util.Scanner;


import OperationService.OprationService;
import OprationServiceImpl.OprationServiceImpl;

public class Countroller {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);

		OprationService op = new OprationServiceImpl();
		while (true) {
			System.out.println("1.insetStudentwithAddress");
			System.out.println("2.showAllData");
			System.out.println("3.insertSinglestudentwithAddress");
			System.out.println("4.Update Student");
			System.out.println("5.UpdateStudentUsingAddress");
			System.out.println("6.DeleteStudent");
		
			int ch=sc.nextInt();
			
			switch(ch) {
			
			case 1:
				op.insertStudentWithAddress();
				break;
				
			case 2:
				op.showallData();
				break;
				
			case 3:
				op.insertSingleStudentWithAddress();
				break;
				
			case 4:
				op.UpdateStudent();
				break;
				
			case 5:
				op.updateAddressUsingStudent();
				break;
				
			case 6:
				op.deleteStudent();
				break;
				
			
			
			}
		}

	}

}
