package Model;

import java.util.Scanner;

import com.ServiceImpl.OperationService;
import com.ServiceImpl.OperationServiceImpl;

public class Controller {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		OperationService op=new OperationServiceImpl();
	
		
		while(true) {
			System.out.println("1.insertStudentwithAddress");
			System.out.println("2.Show AllData");
			System.out.println("3.insertSingleStudentwithAddress");
			System.out.println("4.UpdateStudent");
			System.out.println("5.UpdateusingStudentwithAddress");
			System.out.println("6.deleteStudent");
			
			System.out.println("select choice the number:");
			
			int ch=sc.nextInt();
			switch(ch) {
			
			case 1:
				op.insertStudentWithAddress();
				break;
				
			case 2:
				op.ShowAllData();
				break;
				
			case 3:
				op.insertSingleStudentWithAddress();
				break;
				
			case 4:
				op.updateStudent();
				break;
				
			case 5:
				op.UpdateusingStudentWithAddress();
				break;
				
			case 6:
				op.DeleteStudent();
				break;
				
				
			}
		}
	}

}
