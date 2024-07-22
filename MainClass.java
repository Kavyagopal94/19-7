package com;

import java.util.Scanner;

public class MainClasss
{
	public static void main(String[] args) 
	{
		System.out.println("Start");
		
		Scanner ip=new Scanner(System.in);
		
		System.out.println("Enter user_id:");
		String uid=ip.next();
		System.out.println("Enter password:");
		String pswd=ip.next();
		
		if(uid.equals("abc@xyz") && pswd.equals("abc1234"))
		{
			System.out.println("Login Successfull..!!!");
		}
		else {
			try {
				throw new InvalidCredentials("Invalid User_Id or Password");
			}
			catch(InvalidCredentials i) {
				System.out.println(i);
			}
		}
	}

}
