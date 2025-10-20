package com.codegnan.controlStatements;

import java.util.Scanner;

public class BasicIfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int number = sc.nextInt();
		if(number>0) {
			System.out.println("The number "+ number+ " is +ve");
		} else {
			System.out.println("The number "+ number+ " is -ve");
		}
		System.out.println("The statement always execute");
		sc.close();
	}
}
