package ex2;

import java.util.Scanner;

public class DisplayTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in) ;
		// prompt the user for input
		System.out.print("Enter an integer for seconds: ");
		int seconds = input.nextInt();
		
		int minutes = seconds / 60; // Find minutes in seconds
		int remainSecond = seconds % 60; // Seconds remains
		System.out.println(seconds + " seconds is " + minutes + " minutes and " + remainSecond + " seconds");
		}
	}
