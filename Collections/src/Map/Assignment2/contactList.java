package Map.Assignment2;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class contactList {
    static HashMap<String, Integer> contacts = new HashMap<>();
	
	public void addcontact(String name, Integer number) {
		contacts.put(name, number);
	}
	
	public void removeContact(String name) {
		contacts.remove(name);
	}

	@Override
	public String toString() {
		return "contactList [contacts=" + contacts + "]";
	}
	
	public int getContactNumber(String name) {
		return contacts.get(name);
	}
	
	public String getContactName(Integer number) {
		Set<java.util.Map.Entry<String, Integer>> set = contacts.entrySet();
		Iterator<java.util.Map.Entry<String, Integer>> itr = set.iterator();
		
		while (itr.hasNext()) {
			java.util.Map.Entry<String, Integer> e = itr.next();
			
			if (e.getValue().equals(number))
				return e.getKey();
		}
		
		return null;
	}
	
	public void listAllContacts() {
		Set<java.util.Map.Entry<String, Integer>> set = contacts.entrySet();
		Iterator<java.util.Map.Entry<String, Integer>> it = set.iterator();
		
		while(it.hasNext()) {
			java.util.Map.Entry<String, Integer> me = it.next();
			System.out.println(me);
		}
	}

}
