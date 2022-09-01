package Date_Time_API;

import java.time.LocalTime;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime time = LocalTime.now();
		System.out.println("Time : " + time);
		System.out.println("Time after 25 minutes: " +time.plusMinutes(25));

	}

}
