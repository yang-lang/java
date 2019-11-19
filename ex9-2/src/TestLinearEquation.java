import java.util.Scanner;

public class TestLinearEquation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter x1,y1,x2,y2,x3,y3,x4,y4: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		double x4 = input.nextDouble();
		double y4 = input.nextDouble();
		
		double a1 = y2-y1;
		double b1 = x1-x2;
		double e1 = y1*(x1-x2) -x1*(y1-y2);
		
		double c1= y4-y3;
		double d1 = x3-x4;
		double f1 = y3*(x3-x4) -x3*(y3-y4);
		
		LinearEquation line = new LinearEquation(a1,b1,c1,d1,e1,f1);
		double x = line.getX();
		double y = line.getY();
		System.out.println("The X is " + x +" , and the Y is "+ y);
		
	}

}
