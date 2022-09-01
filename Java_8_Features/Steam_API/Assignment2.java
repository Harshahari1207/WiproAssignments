package Steam_API;

import java.util.ArrayList;
import java.util.stream.Collectors;

class Employee{
	private int empNo;
	private String name;
	private int age;
	private String location;
	Employee(int empNo, String name, int age, String location) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.age = age;
		this.location = location;
	}
	
	String getLocation() {
		return location;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", name=" + name + ", age=" + age + ", location=" + location + "]";
	}
	
	
	
}
public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee(101, "Hari", 30, "Blr"));
		list.add(new Employee(103, "Sunil", 30, "Patna"));
		list.add(new Employee(104, "Anil", 32, "Delhi"));
		list.add(new Employee(106, "Amar", 34, "Pune"));
		list.add(new Employee(107, "Harsha", 30, "hyd"));
		
		ArrayList res = (ArrayList) list.stream().filter(e -> e.getLocation().equalsIgnoreCase("Pune")).collect(Collectors.toList());
		res.forEach(emp -> System.out.println(emp));

	}

}
