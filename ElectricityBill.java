package com.codegnan.controlStatements;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of units consumed: ");
		int units = sc.nextInt();
		System.out.print("Are you a senior citizen? (true/false): ");
        boolean isSenior = sc.nextBoolean();
        
		double bill = 0;
		
		if(units<=100) {
			bill = units*1.5;
		} else {
			if(units <= 200) {
				bill = (100 * 1.5) + ((units - 100) * 2.0);
			} else {
				if(units <= 300) {
					bill = (100 * 1.5) + (100 * 2.0) + ((units - 200) * 3.0);
				} else {
					if(units >300) {
						bill = (100 * 1.5) + (100 * 2.0) + (100 * 3.0) + ((units - 300) * 5.0);
					}
				}
			}
		}
		
		
//		if(bill > 1000) {
//			double surcharges = bill * 0.10;
//			bill += surcharges;
//		}
		
		if(bill>1000) {
			bill*=1.1;
		}
		
//		if (isSenior) {
//            double discount = bill * 0.05;
//            bill -= discount;
//        }
		if(isSenior==true) {
			bill*=0.95;
		}
		
		System.out.printf("Total Electricity Bill: ₹" + "%.2f",bill);
		
		sc.close();
	}

}
