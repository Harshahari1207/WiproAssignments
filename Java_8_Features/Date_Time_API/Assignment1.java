package Date_Time_API;

import java.time.LocalDate;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate d = LocalDate.now();
		System.out.println("Todays date: " +d);
		System.out.println("Date after 10 days: " +d.plusDays(10));

	}

}
