package com.codegnan.controlStatements;

import java.util.Scanner;

public class IncometaxCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your income");
		int income = sc.nextInt();
		
		int taxPercentage=0;
		
		if(income <= 10000) {
			taxPercentage = 0;
		} else {
			if(income>10000 && income < 50000) {
				taxPercentage = 10;
			} else {
				if(income>50000 && income <=100000) {
					taxPercentage = 20;
				} else {
					if(income > 100000) {
						taxPercentage = 30;
					}
				}
			}
		}
		
        System.out.println("Tax Percentage: " + taxPercentage + "%");
    	sc.close();
	}

}
