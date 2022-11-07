package Com.Controller;

import java.util.Scanner;

import Com.OpretionService.OperationService;
import Com.OpretionService.OperationServiceImpl;

public class AdminController {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		OperationService op=new OperationServiceImpl();
		
		System.out.println("***********Application Started************************");
		boolean flag=true;
		while(flag) {
			
			System.out.println("1.addproductlist");
			System.out.println("2.productSearch");
			System.out.println("3.priceSurch");
			
			int ch=sc.nextInt();
			
			switch(ch) {
			case 1:
				op.addproductlist();
				break;
				
			case 2:
				op.productSearch();
				break;
				
			case 3:
				op.priceSurch();
				break;
			
	}

		}
	}
}
