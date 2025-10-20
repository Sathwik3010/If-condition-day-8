package com.codegnan.controlStatements;

import java.util.Scanner;

public class ParkingFee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the vehicle Type(Car, Bike, Truck)");
		String vehicle = sc.next();
		   System.out.print("Enter the time of arrival (24-hour format): ");
	        int arrivalTime = sc.nextInt();

	        System.out.print("Enter the time of departure (24-hour format): ");
	        int departureTime = sc.nextInt();
		double ratePerHour=0;
		
		if(vehicle.equalsIgnoreCase("Car")) {
			ratePerHour=50;
		} else {
			if(vehicle.equalsIgnoreCase("Bike")) {
				ratePerHour=30;
			} else {
				if(vehicle.equalsIgnoreCase("Truck")) {
					ratePerHour=100;
				} else {
		            System.out.println("Invalid vehicle type!");
				}
			}
		}
		
		int hours;
		if(departureTime>=arrivalTime) {
			hours= departureTime - arrivalTime;
		} else {
            hours = (24 - arrivalTime) + departureTime; // e.g., 22 → 2 AM = 4 hours
		}
		
        double totalFee = hours * ratePerHour;

		if(hours > 5) {
			totalFee *= 0.80;
		}
		
		if((arrivalTime >= 18) || (departureTime <= 8) || (arrivalTime > departureTime)) {
            totalFee *= 1.5; // 50% surcharge
		}
		
		 System.out.println("\n========== PARKING SUMMARY ==========");
	        System.out.println("Vehicle Type: " + vehicle);
	        System.out.println("Hours Parked: " + hours);
	        System.out.println("Total Parking Fee: ₹" + totalFee);
	        System.out.println("=====================================");

		sc.close();
	}

}
