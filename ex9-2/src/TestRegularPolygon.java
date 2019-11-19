
public class TestRegularPolygon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegularPolygon r1 = new RegularPolygon();
		double l1 = r1.getPerimeter();
		double s1 = r1.getArea();
		System.out.println("It's Perimeter is " + l1 + " , and it's area is " + s1);
		
		
		RegularPolygon r2 = new RegularPolygon(6,4);
		double l2 = r2.getPerimeter();
		double s2 = r2.getArea();
		System.out.println("It's Perimeter is " + l2 + " , and it's area is " + s2);
		
		
		RegularPolygon r3 = new RegularPolygon(10,4,5.6,7.8);
		double l3 = r3.getPerimeter();
		double s3 = r3.getArea();
		System.out.println("It's Perimeter is " + l3 + " , and it's area is " + s3);

	}

}
