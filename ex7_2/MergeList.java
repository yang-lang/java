package ex7_2;

import java.util.Scanner;

public class MergeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		// input list1
		System.out.print("Enter list1 size and contents: ");
		int size1 = input.nextInt();
		int[] list1 = new int[size1];
		int i,l;
		for(i = 0;i < size1;i++) { 
			list1[i] = input.nextInt();
		}
		// input list2
		System.out.print("Enter list2 size and contents: ");
		int size2 = input.nextInt();
		int[] list2 = new int[size2];
		for(i = 0;i < size2;i++) { 
			list2[i] = input.nextInt();
		}
		// print list1
		System.out.print("list1 is ");
		for(int j:list1) {
			System.out.print(j + " ");
		}
		System.out.print("\n");
		// print list2
		System.out.print("list2 is ");
		for(int k:list2) {
			System.out.print(k + " ");
		}
		System.out.print("\n");
		// print merged list
		System.out.print("The merged list is ");
		merge(list1,list2);

	}
	
	public static int[] merge(int[] list1,int[] list2) {
		int l1 = list1.length;
		int l2 = list2.length;
		int[] list3 = new int[l1 + l2];
		int i,j,k;
		i = j = k = 0;
		// list1,list2 are not empty 
		while((l1 != 0) && (l2 != 0)) {
			int ai = list1[i];
			int bj = list2[j];
			if(ai <= bj) {
				list3[k++] = ai;
				i++;
				l1--;
			}else {
				list3[k++] = bj;
				j++;
				l2--;
			}
		}
		// list1 is not empty
		if(l1 != 0) {
			for(int l = i;l < list1.length;l++) {
				list3[k++] = list1[l];
			}
		}else { // list2 is not empty
			for(int m = j;m < list2.length;m++) {
				list3[k++] = list2[m];
			}
		}
		for(int n:list3) {
			System.out.print(n + " ");
		}
		return list3;
		
	}

}
