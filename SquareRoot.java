package com.codegnan.controlStatements;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		
		if(n>=0) {
			int sqrt = (int)Math.sqrt(n);
			
			if(sqrt*sqrt == n) {
				System.out.println("It is a Square number");
			} else {
				System.out.println("Not a perfect Square");
			}
		} else {
			System.out.println("Enter a positive integer");
		}
		sc.close();
	}

}
