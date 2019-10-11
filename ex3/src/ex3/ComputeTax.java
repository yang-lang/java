package ex3;

import java.util.Scanner;

public class ComputeTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter filling statues
		System.out.print("(0-sing filer,1-married jointly or " +
		   "qualifying widow(er),2-married separately,3-head of " +
			"household) Enter the filing statues: ");
		
		int status = input.nextInt();
		
		// Prompt the use to enter taxable income
		System.out.print("Enter the taxable income: ");
		double income = input.nextDouble();
		
		// Compute tax
		double tax = 0;
		
		if(status == 0) { // Compute tax for single filers
			if(income <= 8350)
				tax = income * 0.10;
			else if(income <= 33950)
				tax = 8350 * 0.10 + (income - 8350) * 0.15;
			else if(income <= 82250)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
				 (income - 33950) * 0.25;
			else if(income <= 171500)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
				 (82250 - 33950) * 0.25 + (income - 82250) * 0.28; 
			else if(income <= 372950)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
				 (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
				 (income- 171550) * 0.33;
			else
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
				 (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
				 (372950- 171550) * 0.33 + (income- 372950) * 0.35;
		}
		else if(status == 1) { 
			if(income <= 16700)
				tax = income * 0.10;
			else if(income <= 67900)
				tax = 16700 * 0.10 + (income - 16700) * 0.15;
			else if(income <= 137050)
				tax = 16700 * 0.10 + (67900 - 16700) * 0.15 +
				 (income - 67900) * 0.25;
			else if(income <= 208850)
				tax = 16700 * 0.10 + (67900 - 16700) * 0.15 +
						 (137050 - 67900) * 0.25 +
				 (income- 137050) * 0.28;
			else if(income <= 372950)
				tax = 16700 * 0.10 + (67900 - 16700) * 0.15 +
					(137050 - 67900) * 0.25 + (208850 - 137051) * 0.28 +
					(income- 372950) * 0.33;
			else
				tax = 16700 * 0.10 + (67900 - 16700) * 0.15 +
				   (137050 - 67900) * 0.25 + (208850 - 137051) * 0.28 +
				    (372950- 171550) * 0.33 + (income - 372950) * 0.35;
		}else {
			System.out.println("Error:invaild status");
			System.exit(1);
		}
		
		// Display the result
		System.out.println("Tax is " + (int)(tax * 100) / 100.0);

	}

}
