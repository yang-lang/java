package ex7_2;

import java.util.Scanner;

public class CaluTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[10];
		System.out.print("Enter the integers between 1 and 100: ");
		Scanner input = new Scanner(System.in);
		int i,j,m,k,l;
		l = k = 0;
		while(( m = input.nextInt()) != 0) {
			array[l++] = m;
		}
		
		for(i = 0;i < l;i++) {
			k = array[i];
			int iCount = 1;
			if(array[i] <= 100) {
			   for(j = i + 1;j < l;j++) {
				  if(array[i] == array[j]) {
					 iCount++;
					 array[j] = 101;
				  }
			    }
			    System.out.println( k + " occors " + iCount + " times");
			}
			    //System.out.println( k + " occurs " + iCount + " times");
		}

	}

}
