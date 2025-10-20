package com.codegnan.controlStatements;

import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the height");
		double height = sc.nextDouble();
		System.out.println("Enter the weight");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		
		String category="";
		
		if(bmi< 18.5) {
			category="Underweight";
		} else {
			if(bmi>=18.5 && bmi<=24.9) {
				category="Normal";
			} else {
				if(bmi>=25.0 && bmi<=29.9) {
					category="Overweight";
				} else {
						category="Obese";
				}
			}
		}
		
		System.out.printf("BMI: %.2f%n",bmi);
		System.out.println("Category: "+category);
		sc.close();

	}

}
