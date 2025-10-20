package com.codegnan.controlStatements;

import java.util.Scanner;

public class Quadriletaral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the side of a");
		int a = sc.nextInt();
		System.out.println("Enter the side of b");
		int b = sc.nextInt();
		System.out.println("Enter the side of c");
		int c = sc.nextInt();
		System.out.println("Enter the side of d");
		int d = sc.nextInt();

		if(a==b && b==c && c==d) {
			System.out.println("Square");
		} else {
			if(a==c && b==d) {
				System.out.println("Rectangel");
			} else {
				System.out.println("other");
			}
		}
		
		sc.close();
	}

}
