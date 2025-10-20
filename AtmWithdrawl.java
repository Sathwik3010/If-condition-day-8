package com.codegnan.controlStatements;
import java.util.Scanner;
public class AtmWithdrawl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount you want to withDraw");
		double withDrawAmount = sc.nextDouble();
		
		double balance = 10000;
//		double remainingBalance =  balance-withDrawAmount;

		if(withDrawAmount<= balance) {
			balance-=withDrawAmount;
			System.out.println("Withdraw Successful . Remaining Balance is "+balance);
		} else{
			System.out.println("The amount is Insufficient ");
		}
		
		sc.close();
	}
}