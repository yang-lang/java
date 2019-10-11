package ex7_2;

import java.util.Scanner;

public class PrintNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter 10 numbers: ");
		int[] a = new int[10];
		int[] b = new int[10];
		int i,j,k = 1;
		Scanner input = new Scanner(System.in);
		for(i = 0;i < 10;i++) {
			a[i] = input.nextInt();
		}
		b[0] = a[0];
		for(i = 1;i < 10;i++) {
			for(j = 0;j < 10;j++) {
				if(a[i] == b[j]) break;
			}
			if(j == 10) b[k++] = a[i];
		}
		System.out.println("The number of distinct numbers is " + k );
		System.out.print("The distinct numbers are: ");
		for(j = 0;j < k;j++) {
			System.out.print(b[j] + " ");
		}
	}

}
