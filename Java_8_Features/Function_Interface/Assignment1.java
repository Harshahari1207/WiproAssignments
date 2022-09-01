package Function_Interface;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.function.Function;



class Employee{
	private int id;
	private String name,location;
	private double salary;
	public Employee(int id, String name, String location, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.salary = salary;
	}
	
	String getLocation() {
		return location;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", location=" + location + ", salary=" + salary + "]";
	}
	
	
}

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee(101, "Hari", "Blr",40000));
		list.add(new Employee(103, "Sunil", "Patna",500000));
		list.add(new Employee(104, "Anil", "Delhi", 25000));
		list.add(new Employee(106, "Amar", "Pune", 45000));
		list.add(new Employee(107, "Harsha", "hyd", 60000));
		
		Function<ArrayList<Employee>, ArrayList<String>> func = ( all )-> {
			ArrayList<String> locations = new ArrayList<>();
			for(Employee e : all){
				locations.add(e.getLocation());
			}
			return locations;
		};
			System.out.println(func.apply(list));
		

	}

}
