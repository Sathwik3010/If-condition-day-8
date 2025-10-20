package com.codegnan.controlStatements;

import java.util.Scanner;

public class EmpSal_Bonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the experience of Employee");
		int experience = sc.nextInt();
		System.out.println("Enter the performace score of Employee");
		int performace = sc.nextInt();
		
		double baseSalary = 0;
		
		if(experience < 2) {
			baseSalary = 30000;
		} else {
			if(experience >= 2 && experience<=5) {
				baseSalary = 50000;
			} else {
				if(experience >5) {
					baseSalary = 70000;
				} else {
					System.out.println("Invalid experience input");
				}
			}
		}
		
		double bonus = 0;
		if(performace >=8) {
			bonus = baseSalary*0.10;
		}
		
		double totalSalary = baseSalary + bonus;
		 System.out.println("\n========= SALARY DETAILS =========");
	        System.out.println("Experience (years): " + experience);
	        System.out.println("Base Salary: ₹" + baseSalary);
	        System.out.println("Bonus: ₹" + bonus);
	        System.out.println("Total Salary: ₹" + totalSalary);
		sc.close();
	}

}
