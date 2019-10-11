package ex7_2;

import java.util.Scanner;

public class PartitationList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter list size: ");
		int size = input.nextInt();
		int[] list = new int[size];
		int i;
		System.out.print("Enter list content: ");
		for(i = 0;i < size;i++) {
			list[i] = input.nextInt();
		}
		partitation(list);

	}
	
	public static int partitation(int[] list) {
		int i,j;
		int pivot = list[0];
		i = 1;
		j = list.length - 1;
		while(i < j) {
			while((i < j) && (list[j] > pivot)) {
				j--;
			}
			while((i < j) && (list[i] < pivot)) {
				i++;
			}
			if((i < j) && (list[j] == list[i])) {
				i++;
			}else {
				int temp = list[i];
				list[i] = list[j];
				list[j] = temp;
			}
		}
		int temp2 = list[i];
		list[i] = list[0];
		list[0] = temp2;
		
		System.out.print("After the partation,the list is ");
		for(int k = 0;k < list.length;k++) {
			System.out.print(list[k] + " ");
		}
		return pivot;
		
				
			
		
		
		
	}

}
