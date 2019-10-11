package ex7_2;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] arr = new double[10];
		System.out.print("Please enter 10 integers: ");
		Scanner input = new Scanner(System.in);
		int i,j;
		for(i = 0;i < 10;i++) {
			arr[i] = input.nextDouble();
		}
		for(i = 0;i < 9;i++) {
			for(j = 0;j < 10 - 1 - i;j++) {
				if(arr[j] > arr[j + 1]) {
					double temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for(i = 0;i < 10;i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
