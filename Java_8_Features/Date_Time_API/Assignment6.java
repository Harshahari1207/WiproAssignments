package Date_Time_API;

import java.time.LocalTime;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime t = LocalTime.now();
		System.out.println("Time: " +t);
		System.out.println("Time before 5 hours 30 minute: " +t.minusMinutes(30).minusHours(5));

	}

}
