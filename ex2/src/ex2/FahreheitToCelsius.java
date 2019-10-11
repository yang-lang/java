package ex2;

import java.util.Scanner;

public class FahreheitToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a degree in Fahrenheit: ");
		double fahreheit = input.nextDouble();
		
		// Convert Fahreheit to Celsius
		double celsius = (5.0 / 9) * (fahreheit - 32);
		System.out.println("Fahreheit " + fahreheit + " is " + celsius + " in Celsius ");
	}

}
