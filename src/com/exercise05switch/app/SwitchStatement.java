package com.exercise05switch.app;

import java.util.Scanner;
public class SwitchStatement {

	public static void main(String[] args) {
		// Ask for an number and respond with the month
		// Constant declaration
		// Variables declaration
		int opc = 0;
		char answer = 'y';
		// Object construction
		Scanner scan = new Scanner(System.in);
		
		// Input
		do {
			opc = 0;
			// Input data validation
			while(opc <= 0) {
				System.out.println("Input a number of the month ");
				opc = scan.nextInt();
				// When the number is under 0
				if(opc <= 0) {
					System.out.println("ERROR: That month doesn't exist");
				}
			}	
			// Process
			switch(opc) {
			case 1:
				System.out.println("January");
				break;
			case 2:
				System.out.println("Feburary");
				break;
			case 3:
				System.out.println("March");
				break;
			case 4:
				System.out.println("April");
				break;
			case 5:
				System.out.println("May");
				break;
			case 6:
				System.out.println("June");
				break;
			case 7:
				System.out.println("July");
				break;
			case 8:
				System.out.println("August");
				break;
			case 9:
				System.out.println("September");
				break;
			case 10:
				System.out.println("October");
				break;
			case 11:
				System.out.println("November");
				break;
			case 12:
				System.out.println("December");
				break;				
			default: 
				System.out.println("ERROR: Invalid number");
				break;
			}
			System.out.println("Will you like to keep asking? (y/n) ");
			// capture the value in the position 0
			answer = scan.next().charAt(0);
			
		}while(answer == 'y');
		scan.close();
	}
}