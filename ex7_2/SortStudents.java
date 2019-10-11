package ex7_2;

import java.util.Scanner;

public class SortStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Please input the number of students: ");
		int number = input.nextInt();
		
		String[] names = new String[number]; // name
		int[] scores = new int[number]; // grade
		int[] a = new int[number];
		int i,j,k;
		for(i = 0;i < number;i++) {
			a[i] = i;
			//input names
			names[i] = input.next();
			//input grades
			scores[i] = input.nextInt();
		}
		for(i = 0;i < number;i++) {
			for(j = 0;j < number - i - 1;j++) {
				if(scores[j] > scores[j + 1]) {
					int temp = scores[j];
					scores[j] = scores[j + 1];
					scores[j + 1] = temp;
					int temp_2 = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp_2;
				}
			}
		}
		System.out.print("The scores are : ");
		for(i = 0;i < number;i++) {
			System.out.print(names[a[i]] + " ");
		}

	}

}
