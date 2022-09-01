package set.Assignment1;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetDemo {
	
	HashSet<String> H1 = new HashSet<>();
	
	boolean addCountry(String countryName){
		return H1.add(countryName);
	}
	
	void printAllCountries() {
		Iterator<String> it = H1.iterator();
		while(it.hasNext()) {
		System.out.println(it.next());
		}
	}
	
	public String getCountry(String countryName) {
		Iterator<String> it = H1.iterator();
		
		while(it.hasNext()) {
			if(it.next().equals(countryName))
				return countryName;
		}
		return "country not Found";
	}

}
