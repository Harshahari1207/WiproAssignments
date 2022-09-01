package Date_Time_API;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate d = LocalDate.of(2022, Month.JULY, 11);
		Period ds = Period.between(d, LocalDate.now());
		int days = ds.getDays();
		int months = ds.getMonths();
		int years = ds.getYears();
		System.out.println("Experience: " +years+ " Years " +months+ " Months " +days+ " Days ");

	}

}
