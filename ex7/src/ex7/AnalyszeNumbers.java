package ex7;

public class AnalyszeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter the number of items: ");
		int n = input.nextInt();
		double[] numbers = new double[n];
		double sum = 0;
		
		System.out.print("Enter the numbers: ");
		for(int i = 0;i < n;i++) {
			numbers[i] = input.nextDouble();
			sum += numbers[i];
		}
		
		
	double average = sum / n;
	
	int count = 0; // The number of element above average
	for(int i = 0;i < n;i++) {
		if(numbers[i] > average)
			count++;
	}
	System.out.println("Average is " + average);
	System.out.println("Number of element above the average is "
			+ count);

	}

}
