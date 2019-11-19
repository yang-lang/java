package ex11;

public class TestCircleRectangle {
	public static void main(String[] args) {
		Circle circle = new Circle(1);
		System.out.println("A circle " + circle.toString());
		System.out.println("The color is "  + circle.getcolor());
		System.out.println("The radius is " + circle.getRadius());
		System.out.println("The area is " + circle.grtArea());
		System.out.println("The diameter is " +circle.getDiameter());
		
		Rectangle rectangle = new Rectangle(2,4);
		System.out.println("\nA retangle " + rectangle.toString());
		System.out.println("The area is " + rectangle.getArea());
		System.out.println("The perimeter is " + rectangle.getPerimeter());
		
		
	}

}
