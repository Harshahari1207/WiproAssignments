package set.Assignment2;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class Assignment_2 {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();
		//Collection<String> set = new TreeSet<>(Collection.reverseOrder());
		
		set.add("Nanna");
		set.add("Rajani");
		set.add("Amar");
		set.add("Sunil");
		set.add("Manju");
		set.add("Mouna");
		
		Iterator<String> it = set.iterator();
		String query = "Manju";
		boolean result = false;
		
		while(it.hasNext()) {
			if(it.next().equals(query))
				result = true;
			break;
		}
		
		if(result == true) System.out.println(query+ "exist");
		else System.out.println(query+ " doesn't exist");

	}

}
