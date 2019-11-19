package ex11_3;

import java.util.Scanner;

public class BestPackageDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of the objects: ");
		int num = input.nextInt();
		System.out.print("Enter the weight of the objects: ");
		int[] weight = new int[num];
		for(int i = 0;i < num;i++) {
			weight[i] = input.nextInt();
		}
		
		BestPackage a = new BestPackage(weight);
		weight = a.sort(weight);
		a.packageObject(weight);
		
		

	}

}
