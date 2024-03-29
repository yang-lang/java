package ex9;

public abstract class TestPassObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a circle object with radius 1
		Circle2 myCircle = new Circle2();
		
		// Print area for radius 1,2,3,4 and 5
		int n = 5;
		PrintAreas(myCircle,n);
		
		// See myCircle.radius anf times
		System.out.println("\n" + "Radius is " + myCircle.getRadius());
		System.out.println("n is " + n);
	}
	
	public static void PrintAreas(Circle2 c,int times){ 
		System.out.println("Radius \t\tArea");
		while(times >= 1) {
			System.out.println(c.getRadius() + "\t\t" + c.getArea());
			c.setRadius(c.getRadius() + 1);
			times--;
		}
	}
}
