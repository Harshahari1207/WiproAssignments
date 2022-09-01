package List.Assignment3;

import java.util.Iterator;
import java.util.Vector;

class Employee{
	private int id;
	private String name;
	private String address;
	private Double salary;
	
	
	public Employee(int id, String name, String address, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}
	
	public String toString() {
		return "Employee[id = " +id+ ", name = " +name+ ", address = " +address+ ", salary = " +salary+ "]";
	}
}

public class Assignment_3 {

	public static void main(String[] args) {
		Vector<Employee> list = new Vector<>();
		
		list.add(new Employee(24, "Nanna", "some address", 45000.5));
		list.add(new Employee(25, "Amar", "No address", 500000.25));
		list.add(new Employee(26, "Sunil", "new address", 450000.4));
		list.add(new Employee(27, "Rajani", "Address", 700000.8));
		list.add(new Employee(28, "Manju", "non address",800000.5));
		
		Iterator<Employee> it = list.iterator();
		while(it.hasNext())
			System.out.println(it.next());

	}

}
