package ex3;

import java.util.Scanner;

public class ComputeAndInterpretBMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter weight in pounds
		System.out.print("Enter weight in pounds: ");
		double weight = input.nextDouble();
		
		// Prompt the user to Enter height in inches
		System.out.print("Enter height in inches: ");
		double height = input.nextDouble();
		
		final double KILOGRAMS_PER_POUND = 0.45359237;
		final double METERS_OER_INCH = 0.0254;
		
		// Compute BMI
		double weightIntKilograms = weight * KILOGRAMS_PER_POUND;
		double heightIntMeters = height * METERS_OER_INCH;
		double bmi = weightIntKilograms / (heightIntMeters * heightIntMeters);
		
		// Display result
		System.out.println("BMI is " + bmi);
		if(bmi < 18.5)
			System.out.println("Underweight");
		else if(bmi < 25)
			System.out.println("Normal");
		else if(bmi < 30)
			System.out.println("Overweight");
		else 
			System.out.println("Obese");
			
			
			
	}

}
