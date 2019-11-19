package ex11_2;

import java.util.Scanner;

public class PerfectSquareDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an interger m: ");
		int m = input.nextInt();
		int[] factor = new int[100];
		
		PerfectSquare num = new PerfectSquare(m);
		factor = num.setFactor();
		int n = num.getJiShu(factor);
		
		System.out.println("The smallest number n for m*n to be a perfect square is " + 
				n);
		System.out.println("m * n is " + m*n);

	}

}
