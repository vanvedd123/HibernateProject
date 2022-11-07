package com.Controller;

import java.util.Scanner;

import com.ServiceImpl.ServiceImpl;

import Service.Service;

public class AdminController {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 Service s=new ServiceImpl();
		 System.out.println("******Application Started****************");
		 boolean flag=true;
		 while (true) {
			 
			 System.out.println("1.AddUserDetails");
			 System.out.println("2.Delete User");
			 System.out.println("3.getAlluser");
			 
			 int ch=sc.nextInt();
			 
			 switch(ch) {
			 case 1:
				 s.addUserDetails();
				 break;
				 
			 case 2:
				 s.DeleteUser();
				 break;
				 
			 case 3:
				 s.getAllUser();
				 break;
				 
			 case 4:
				 flag=false;
				 default:
					 break;
				 
				 }
			 
		 }
	}

}
