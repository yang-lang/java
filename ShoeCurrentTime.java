package ex2;

public class ShoeCurrentTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Obtain the totalmillioseconds since midnight,jan 1,1970
		long totalMillioseconds = System.currentTimeMillis();
		
		// Obtain the total seconds since midnight,jan 1,1970
		long totalSeconds = totalMillioseconds / 1000;
		
		// Compute the current second in the minute in the hour
		long currentSecond = totalSeconds % 60;
		
		// Obtain the total minutes
		long totalMinutes = totalSeconds / 60;
		
		//Compute the current minutes  in the hour
		long currentMinute = totalMinutes % 60;
		
		// Obtain the total hours
		long totalHours = totalMinutes / 60;
		
		// Compute the current hour
		long currentHour = totalHours % 24;
		
		// Display results
		System.out.println("Current time is " + currentHour + ":"
		 + currentMinute + ":" + currentSecond + " GMT ");
		
		

	}

}
