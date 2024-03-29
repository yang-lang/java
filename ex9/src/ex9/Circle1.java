package ex9;

class Circle1 {

	double radius;
	
	/** The number of objects created */
	static int numberOfObjects = 0;
	
	/** Construct a  circle with radius 1 */
	Circle1(){
		radius = 1;
		numberOfObjects++;
	}
	
	/** Construct a circle with a specified radius */
	Circle1(double newRadius) {
		radius = newRadius;
		numberOfObjects++;
	}
	
	/** Return numberOfObjects */
	static int getNumberOfObjects(){
		return numberOfObjects;
	}
	
	/** Return the area of this circle*/
	double getArea() {
		return radius * radius * Math.PI;
	}

}
