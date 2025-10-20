package com.codegnan.controlStatements;

import java.util.Scanner;

public class OnlineShoppingCart {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the total shopping amount: ");
		double shoppingAmount = sc.nextDouble();

		System.out.println("Is it Festival Season? (true/false): ");
		boolean isFestival = sc.nextBoolean();

		System.out.println("Do you have Premium Membership? (true/false): ");
		boolean premiumMembership = sc.nextBoolean();

		double originalAmount = shoppingAmount;
		double discount = 0; // total discount to track

		// Base discount using if–else ladder
		if (shoppingAmount >= 10000) {
			discount = shoppingAmount * 0.20;
			shoppingAmount -= discount;
		} else if (shoppingAmount >= 5000) {
			discount = shoppingAmount * 0.10;
			shoppingAmount -= discount;
		} else {
			discount = 0;
			// no discount for less than 5000
		}

		// Festival season discount
		if (isFestival) {
			double festDiscount = shoppingAmount * 0.05;
			shoppingAmount -= festDiscount;
			discount += festDiscount;
		}

		// Premium membership flat discount
		if (premiumMembership) {
			shoppingAmount -= 200;
			discount += 200;
		}

		System.out.println("\n========== BILL SUMMARY ==========");
		System.out.println("Original Amount: ₹" + originalAmount);
		System.out.println("Total Discount Applied: ₹" + discount);
		System.out.println("Final Payable Amount: ₹" + shoppingAmount);
		System.out.println("==================================");

		sc.close();
	}
}
