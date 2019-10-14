package com.exercise05switch.app;

import java.util.Scanner;
public class SwitchStatement {

	public static void main(String[] args) {
		// Ask for an number and respond with the month
		
		// Variables declaration
		int opc = 0;
		
		// Object declaration
		Scanner scan = new Scanner(System.in);
		
		// Input
		System.out.println("Input a number of the month");
		opc = scan.nextInt();
		// When the number is under 0
		if(opc <= 0) {
			System.out.println("ERROR: That month doesn't exist");
		}
		
		// Process
		switch(opc) {
			case 1:
				System.out.print("January");
				break;
			case 2:
				System.out.print("Feburary");
				break;
			case 3:
				System.out.print("March");
				break;
			case 4:
				System.out.print("April");
				break;
			case 5:
				System.out.print("May");
				break;
			case 6:
				System.out.print("June");
				break;
			case 7:
				System.out.print("July");
				break;
			case 8:
				System.out.print("August");
				break;
			case 9:
				System.out.print("September");
				break;
			case 10:
				System.out.print("October");
				break;
			case 11:
				System.out.print("November");
				break;
			case 12:
				System.out.print("December");
				break;				
			default: 
				System.out.println("ERROR: Invalid number");
		}
		
		scan.close();
	}

}
