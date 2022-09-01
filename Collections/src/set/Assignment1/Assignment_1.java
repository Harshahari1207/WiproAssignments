package set.Assignment1;
import java.util.Iterator;

import set.Assignment1.HashsetDemo;
public class Assignment_1 {

	public static void main(String[] args) {
		HashsetDemo countries = new HashsetDemo();
		countries.addCountry("India");
		countries.addCountry("NewZeland");
		countries.addCountry("Australia");
		countries.addCountry("West Indies");
		countries.addCountry("England");
		
		System.out.println("England: " +countries.getCountry("England"));
		System.out.println("Ukrain: " +countries.getCountry("Ukrain")+ "\n\nAllCountries: \n");
		countries.printAllCountries();
	}

	
	

	

	

}
