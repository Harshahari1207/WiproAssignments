package Date_Time_API;

import java.time.LocalDate;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.now();
		if(date.isLeapYear())
			System.out.println("Current year is a leap year");
		else
			System.out.println("Current year is not a leap year");

	}

}
