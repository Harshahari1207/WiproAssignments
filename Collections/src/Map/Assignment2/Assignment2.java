package Map.Assignment2;

public class Assignment2 {

	public static void main(String[] args) {
		
		
		contactList cl = new contactList();
		
		cl.addcontact("Amar", 734886753);
		cl.addcontact("Hari", 824734);
		cl.addcontact("Ambulance", 108);
		
		
		System.out.println(cl.getContactNumber("Amar"));
		System.out.println(cl.getContactName(824734));
		
		System.out.println();
		
		cl.listAllContacts();

	}

}
