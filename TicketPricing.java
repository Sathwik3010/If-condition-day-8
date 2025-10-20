package com.codegnan.controlStatements;

import java.util.Scanner;

public class TicketPricing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the PassangerType(Child, Adult, SeniorCitizen)");
		String passangerType = sc.nextLine();
		System.out.println("Enter the bookingTime(early, normal, last-minuet)");
		String bookingType = sc.nextLine();
		sc.nextLine();
		System.out.println("Enter the MemberShip(true, false)");
		boolean isMember = sc.nextBoolean();
		double basePrice=5000;

		if(passangerType.equalsIgnoreCase("Child")) {
			basePrice*=0.5;
		} else {
			if(passangerType.equalsIgnoreCase("SeniorCitizen")) {
				basePrice*=0.8;
			} else {
				if(passangerType.equalsIgnoreCase("Adult")) {
				} else {
					System.out.println("Invalid passangerType");
				}
			}
		}
		
		if(bookingType.equalsIgnoreCase("early")) {
			basePrice*=0.90;
		} else {
			if(bookingType.equalsIgnoreCase("normal")) {
			} else {
				if(bookingType.equalsIgnoreCase("last-minuets")) {
					basePrice*=1.2;
				} else {
					System.out.println("Invalid Booking Type");
				}
			}
		}
		
		if(isMember==true) {
			basePrice*=0.95;
		}
		
		System.out.println("Final Ticket Price: " + basePrice);
		sc.close();
	}

}
