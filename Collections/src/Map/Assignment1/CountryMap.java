package Map.Assignment1;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class CountryMap {
	private HashMap<String, String> mapObj;
	private HashMap<String, String> mapObj2;
	
	public CountryMap() {
		mapObj = new HashMap<String, String>();
	}
	
	public HashMap<String, String> saveCountryCapitals(String CountryName, String capital){
		mapObj.put(CountryName, capital);
		return mapObj;
	}
	
	public String getCapital(String CountryName) {
		return mapObj.get(CountryName);
	}
	
	public String getCountry(String capitalName) {
		Set<java.util.Map.Entry<String, String>> set = mapObj.entrySet();
		Iterator<java.util.Map.Entry<String, String>> itr = set.iterator();
		
		while (itr.hasNext()) {
			java.util.Map.Entry<String, String> e = itr.next();
			
			if (e.getValue().equals(capitalName))
				return e.getKey();
		}
		
		return "No capital found";
	}
	public HashMap<String, String> swapKyeValue() {
		
		
		Set<java.util.Map.Entry<String, String>> set = mapObj.entrySet();
		Iterator<java.util.Map.Entry<String, String>> itr = set.iterator();
		
		while (itr.hasNext()) {
			java.util.Map.Entry<String, String> e = itr.next();
			mapObj2.put(e.getValue(), e.getKey());
		}
		
		return mapObj2;
	}
	
	public ArrayList<String> toArrayList(){
		ArrayList<String> list = new ArrayList();
		
		Set<java.util.Map.Entry<String, String>> set = mapObj.entrySet();
		Iterator<java.util.Map.Entry<String, String>> itr = set.iterator();
		
		while(itr.hasNext()) {
			java.util.Map.Entry<String, String> e = itr.next();
			list.add(e.getKey());
		}
		return list;
	}
	public ArrayList<String> toArrayList2(){
		ArrayList<String> list = new ArrayList();
		
		Set<java.util.Map.Entry<String, String>> set = mapObj2.entrySet();
		Iterator<java.util.Map.Entry<String, String>> itr = set.iterator();
		
		while(itr.hasNext()) {
			java.util.Map.Entry<String, String> e = itr.next();
			list.add(e.getKey());
		}
		return list;
	}

}
