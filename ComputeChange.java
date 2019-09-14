package ex2;

import java.util.Scanner;

public class ComputeChange {
	public static void main(String[] args) {
		// create a scanner 
		Scanner input = new Scanner(System.in) ;
		
		//Receive the amount
		System.out.print(
				"Enter an amout in double,for example 11.56: ");
		double amount = input.nextDouble();
		
		int remainingAmount = (int)(amount * 100);
		
		//Find the number of one dollars
		int numberOfDollars = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;
		
		//Find the number of quarters in the remaining amount
		int numberOfQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;
		
		//Find the number of dimes in the remaining amount
		int numberOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
		
		//Find the number of nickels in the remaining amount
		int numberOfNickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;
		
		//Find the number of pennies in the remaining amount
		int numberOfPennies = remainingAmount ;
		
		// Display results
		System.out.println("Ypur amount " + amount + " consists of");
		System.out.println(" " + numberOfDollars + " dollars");
		System.out.println(" " + numberOfQuarters + " quarters");
		System.out.println(" " + numberOfDimes + " dimes");
		System.out.println(" " + numberOfNickels + " nicleks");
	    System.out.println(" " + numberOfPennies + " pennies");
		
	}

}
