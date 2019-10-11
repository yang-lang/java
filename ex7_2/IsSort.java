package ex7_2;

import java.util.Scanner;

public class IsSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the size of he list: ");
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[] num = new int[size];
		int[] sorted = new int[size];
		System.out.print("Enter the contents of the list: ");
		int i,j,k;
		for(i = 0;i < size;i++) {
			num[i] = input.nextInt();
		}
		boolean result = isSorted(num);
		if(result) System.out.println("The list isalready sorted");
		else System.out.println("The list not sorted");
		
	}
	
	public static boolean isSorted(int[] list) {
		int i,j,k = 0;
		for(i = 0;i < list.length;i++) {
			for(j =0;j < list.length - i - 1;j++) {
				if(list[j] > list[j + 1]) break;
			}
			if(j == list.length - i - 1) k++;
		}
		if(k == list.length) return true;
		else return false;
		
	}

}
