package ex9;

public class Circle2 {
		private double radius;
		
		/** The number of objects created */
		private static int numberOfObjects = 0;
		
		/** Construct a  circle with radius 1 */
		public Circle2(){
			radius = 1;
			numberOfObjects++;
		}
		
		/** Construct a circle with a specified radius */
		public Circle2(double newRadius) {
			radius = newRadius;
			numberOfObjects++;
		}
		
		/**Return Radius */
		public double getRadius() {
			return radius;
		}
		
		/**Set a new  Radius */
		public void setRadius(double newRadius) {
			radius = (newRadius >= 0) ? newRadius :0;
		}
		
		/** Return numberOfObjects */
		public static int getNumberOfObjects(){
			return numberOfObjects;
		}
		
		
		/** Return the area of this circle*/
		public double getArea() {
			return radius * radius * Math.PI;
		}

	}


