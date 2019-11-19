import java.util.Scanner;

public class TestLocation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows anf columns in the array: ");
		int row = input.nextInt();
		int column = input.nextInt();
		System.out.println("Enter the array: ");
		double[][] a= new double[row][column];
		for(int i = 0;i < row;i++) {
			for(int j = 0;j < column;j++) {
				a[i][j] = input.nextDouble();
			}
		}
		Location location = new Location();
		location.row = locateLargest(a).row;
		location.column = locateLargest(a).column;
		location.maxValue = locateLargest(a).maxValue;
		System.out.println("The location of the largest element is " + location.maxValue +
				" at ("+ location.row+ "," + location.column + ")");
	}
		
		public static Location locateLargest(double[][] a) {
			Location location = new Location();
			location.maxValue = 0;
			for(int i = 0;i < a.length;i++) {
				for(int j = 0;j < a[i].length;j++) {
					if(a[i][j] > location.maxValue) {
						location.maxValue = a[i][j];
						location.row = i;
						location.column = j;
					}
				}
			}
			return location;
		}
		
	}
