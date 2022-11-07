package com.ServiceImpl;

import java.util.Scanner;

import com.model.User;

import Service.Service;

public class ServiceImpl implements Service {
	public static final int max_user = 2;
	Scanner sc = new Scanner(System.in);
	User[] userarray = new User[max_user];

	@Override
	public void addUserDetails() {
		System.out.println("How many add user:");

		for (int i = 0; i < userarray.length; i++) {
			User u = new User();
			System.out.println("Enter user id");
			u.setId(sc.nextInt());

			System.out.println("Enter User Name");
			u.setName(sc.next());

			System.out.println("Enter User Address");
			u.setAddress(sc.next());

			System.out.println("Enter user mobileNo");
			u.setMobileNo(sc.nextLong());

			userarray[i] = u;
		}

	}

	@Override
	public void DeleteUser() {
		System.out.println("Enter user id");
		int dluser=sc.nextInt();
	int	index=0;
		for (User user : userarray) {
			if(user.getId()==dluser) {
				System.out.println("we need to dlt user");
				break;
			
		}
			index++;
	
			
		}
		userarray[index]=null;

	}

	@Override
	public void getAllUser() {
		System.out.println("Enter Show All user");
		for (User user : userarray) {

			if(user!=null) {
				System.out
				.println(user.getId() + " " + user.getName() + " " + user.getAddress() + " " + user.getMobileNo());
		

			}

		}
	}

}
