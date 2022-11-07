package Controller;

import java.util.Scanner;


import com.Service.OperationService;
import com.Service.OperationServiceImpl;

public class AdminController {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
OperationService op=new OperationServiceImpl();

System.out.println("============Application Started=============================");
boolean flag=true;
while(flag) {
	
	System.out.println("1.addCourse");
	System.out.println("2.displayCourse");
	System.out.println("3.addFacalty");
	System.out.println("4.displayFacalty");
	System.out.println("5.AddBatch");
	System.out.println("6.DisplayBatch");
	System.out.println("7.AddStudent");
	System.out.println("8.DisplayStudent");
	int ch=sc.nextInt();
	
	switch(ch) {
	case 1:
		op.addCourse();
		break;
		
	case 2:
		op.displayCourse();
		break;
		
	case 3:
		op.addFacalty();
		
	case 4:
		op.displayFacalty();
		break;
		
	case 5:
		op.AddBatch();
		break;
		
	case 6:
		op.DisplayBatch();
		break;
		
	case 7:
		op.AddStudent();
		break;
		
	case 8:
		op.DisplayStudent();
		break;
		
	case 9:
		flag=false;
		default:
			System.out.println("Application Terminated......");
	}
}

}
}
