package Map.Assignment1;

import java.util.HashMap;

public class Assignment1 {

	public static void main(String[] args) {
		CountryMap countryMap = new CountryMap();
		
		countryMap.saveCountryCapitals("India", "Delhi");
		countryMap.saveCountryCapitals("Japan", "Tokyo");
		countryMap.saveCountryCapitals("USA", "Washington D.C");
		
		System.out.println(countryMap.getCapital("India"));
		System.out.println(countryMap.getCountry("Tokyo"));
		System.out.println(countryMap.toArrayList());
		
		
		
		HashMap<String, String> mapObj2 = countryMap.swapKyeValue();
		System.out.println(mapObj2);

	}

}
