package ex11;

import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a list to store cities
		ArrayList<String> cityList = new ArrayList<>();
		
		// Add some cities in the list
		cityList.add("London");
		// CityList now contains [London]
		cityList.add("Denver");
		// CityList now contains [London,Dever]
		cityList.add("Paris");
		// CityList now contains [London,Dever,Paris]
		cityList.add("Miami");
		// CityList now contains [London,Dever,Paris,Miami]
		cityList.add("Seoul");
		// CityList now contains [London,Dever,Paris,Miami,Seoul]
		cityList.add("Tokyo");
		// CityList now contains [London,Dever,Paris,Miami,Seoul,Tokyo]
		
		System.out.println("List size? " + cityList.size());
		System.out.println("Is Miami in the list? " + cityList.contains("Miami"));
		System.out.println("The location of the Denver in the list? " +
		     cityList.indexOf("Denver"));
		System.out.println("IS the list empty? " +
		     cityList.isEmpty());// Print false
		
		// Insert a new city at index 2
		cityList.add(2,"Xian");
		// CityList now contains [London,Dever,Paris,Miami,Seoul,Tokyo,Xian]
		
		// Remove a city at index 1
		cityList.remove(1);
		// CityList now contains [Dever,Paris,Miami,Seoul,Tokyo]
		
		// Display the contends in the list
		System.out.println(cityList.toString());
		
		// Display the contends in the list in reserve order
		for(int i = cityList.size() - 1;i >= 0;i--)
				System.out.println(cityList.get(i) + " ");
		System.out.println();
		
		// Create a list to store two circle
		ArrayList<Circle> list = new ArrayList<>();
		
		// Add two circles
		list.add(new Circle(2));
		list.add(new Circle(3));
		
		// Display the area of the first circle in the list
		System.out.println("The area of the circle? " +
	         list.get(0).grtArea());	

	}

}
