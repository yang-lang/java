package ex7_2;

import java.util.Scanner;

public class SortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a string of characters: ");
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		sort(s);
		

	}
	
	public static String sort(String s) {
		char[] str = new char[100];
		str = s.toCharArray(); // change string to char array
		int i,j,k;
		for(i = 0;i < str.length;i++) {
			for(j = 0;j < str.length - i - 1;j++) {
				if(s.charAt(j) > s.charAt(j+1)) {
					char temp= str[j];
					str[j] = str[j + 1];
					str[j + 1] = temp;
				}
			}
		}
		System.out.print("After sort: ");
		for(k = 0;k < str.length;k++) {
			System.out.print(str[k]);
		}
		s = String.valueOf(str);
		return s;
	}
}
