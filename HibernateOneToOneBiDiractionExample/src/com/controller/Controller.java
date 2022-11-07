package com.controller;

import java.util.Scanner;

import comUtil.OperationService;
import comUtil.OperationServiceImpl;

public class Controller {
	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	
OperationService op =new OperationServiceImpl();

System.out.println("============Application Started====================");
while(true) {
	
	System.out.println("1.addPersonWithAdharCard");
	System.out.println("2.getAllPersonwithAdharData");
	System.out.println("3.addSinglePersonwithAdharData");
	System.out.println("4.UpdatePerson");
	System.out.println("5.updateAdharwithPersonid");
	System.out.println("6.addAdharwithPersonid");
	System.out.println("7.getAllAdharDatawithPersonData");
	System.out.println("8.getSingleAdharDatawithPerson");
	System.out.println("9.updatePersonUsingAdharData");
	System.out.println("10.updateAdharData");
	
	
	int ch=sc.nextInt();
	
	switch(ch) {
	case 1:
		op.addPersonWithAdharCard();
		break;
		
	case 2:
		op.getAllPersonwithAdharData();
		break;
		
	case 3:
		op.addSinglePersonwithAdharData();
		break;
		
	case 4:
		op.UpdatePerson();
		break;
		
	case 5:
		op.updateAdharwithPersonid();
		break;
		
	case 6:
		op.addAdharwithPersonid();
		break;
		
	case 7:
		op.getAllAdharDatawithPersonData();
		break;
		
	case 8:
		op.getSingleAdharDatawithPerson();
		break;
		
	case 9:
		op.getAllPersonwithAdharData();
		break;
		
	case 10:
		op.updateAdharData();
		break;
	}
}

}
}
