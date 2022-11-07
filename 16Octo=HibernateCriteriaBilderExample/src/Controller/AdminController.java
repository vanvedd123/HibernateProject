package Controller;

import java.util.Scanner;

import Com.Service.OperationService;
import Com.Service.OperationServiceImpl;

public class AdminController {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		OperationService op=new OperationServiceImpl();
		System.out.println("**************Application Started**********************");
		boolean flag=true;
		while(flag) {
			System.out.println("1.add Product Data");
			System.out.println("2.show All Data");
			System.out.println("3.get Single Product");
			System.out.println("4.get Single Colum Data");	
			System.out.println("5.get multiple Colum Data");
			System.out.println("6. terminated the Application....");
			
			int ch=sc.nextInt();
			switch (ch) {
			case 1:
				op.addproductData();
				break;
				
			case 2:
				op.ShowAllData();
				break;
				
			case 3:
				op.getSingleProduct();
				
			case 4:
				op.getSingleColumData();
				break;
				
			case 5:
				op.getmultipleColumData();
				break;
				
			case 6:
				System.out.println("Application is Terminated.. ");
				flag=false;
				default:
					System.out.println(" you Enter wrong input..");
					break;
			}
		}
	}

}
