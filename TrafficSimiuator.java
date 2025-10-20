package com.codegnan.controlStatements;

import java.util.Scanner;

public class TrafficSimiuator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter light state(Green, Yellow, Red)");
		String lightState = sc.next();
		System.out.println("Enter Hour(0-23)");
		int hour = sc.nextInt();
		boolean isDaytime = (hour >= 6 && hour <= 18);
		String action;
		if (lightState.equalsIgnoreCase("green")) {
			action = "Go";
		} else {
			if (lightState.equalsIgnoreCase("red")) {
				action = "Stop";
			} else {
				if (lightState.equalsIgnoreCase("yellow")) {
					if (isDaytime) {
						action = "slow";
					} else {
						action = "stop";
					}
				} else {
					action = "Invalid Light state";
				}
			}
		}
		System.out.println(action);
		sc.close();
	}

}
