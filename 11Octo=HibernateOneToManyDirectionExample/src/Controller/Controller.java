package Controller;

import java.util.Scanner;

import OperationService.OperationService;
import OperationService.OperationServiceImpl;

public class Controller {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		OperationService	op=new OperationServiceImpl();
		System.out.println("==================Application Started=============");
		while(true) {
			System.out.println("1.addUserDataWithMultipleProduct");
			System.out.println("2.showAllUserWithMultipleProductData");
			System.out.println("3.getSingleUserWithMultipleProductData");
			System.out.println("4.updateUser");
			System.out.println("5.updatePerticularProductDataUsingUserId");
			System.out.println("6.deletePerticularProductDataUsingUserId");
			System.out.println("7.deleteUser");
			System.out.println("8.addProductDataToExistingUser");
			
			int ch=sc.nextInt();
			
			switch(ch) {
			
			case 1:
				op.addUserDataWithMultipleProduct();
				break;
				
			case 2:
				op.showAllUserWithMultipleProductData();
				break;
				
			case 3:
				op.getSingleUserWithMultipleProductData();
				break;
				
			case 4:
				op.updateUser();
				break;
				
			case 5:
				op.updatePerticularProductDataUsingUserId();
				break;
				
			case 6:
				op.deletePerticularProductDataUsingUserId();
				break;
				
			case 7:
				op.deleteUser();
				break;
				
			case 8:
				op.addProductDataToExistingUser();
				break;
				
			}
		}
	}
	

}
