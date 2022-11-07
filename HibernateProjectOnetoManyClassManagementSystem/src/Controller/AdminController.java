package Controller;

import java.util.Scanner;

public class AdminController {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
	Service.OperationServiceImpl op=new Service.OperationServiceImpl();

	System.out.println("============Application Started=============================");
	boolean flag=true;
	while(flag) {
		
		System.out.println("1.addCoursewithMultipleFaculty");
		System.out.println("2.showAllCoursemultipleFaculty");
		System.out.println("3.getSingleCoursewithMultipleFaculty");
		System.out.println("4.addFacultyToperticularCourse");
		System.out.println("5.showAllFaculties");
		System.out.println("6.addBatchwithMultipleStudent");
		System.out.println("7.singleBatchwithMultipleStudent");
		System.out.println("8.ShowAllBatchwithMultipleStudent");
		System.out.println("9.addStudentToperticularBatch");
		System.out.println("10.showAllStudent");
		int ch=sc.nextInt();
		
		switch(ch) {
		case 1:
			op.addCoursewithMultipleFaculty();
			break;
			
		case 2:
			op.showAllCoursemultipleFaculty();
			break;
			
		case 3:
			op.getSingleCoursewithMultipleFaculty();
		case 4:
			op.addFacultyToperticularCourse();
			break;
			
		case 5:
			op.showAllFaculties();
			break;
			
		case 6:
			op.addBatchwithMultipleStudent();
			break;
			
		case 7:
			op.singleBatchwithMultipleStudent();
			break;
			
		case 8:
			op.ShowAllBatchwithMultipleStudent();
			break;
			
		
			
		case 9:
			op.addStudentToperticularBatch();
			break;
			
		case 10:
			op.showAllStudent();
			break;
			
		case 11:
			flag=false;
			default:
				System.out.println("Application Terminated......");
		}
	}

	}

}
