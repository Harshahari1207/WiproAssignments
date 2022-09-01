package Function_Interface;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee1{
	private int id;
	private String name;
	private double salary;
	
	
	public Employee1(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	
	
}

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee1> list = new ArrayList<>();
		list.add(new Employee1(101, "Hari", 6000));
		list.add(new Employee1(103, "Sunil", 500000));
		list.add(new Employee1(104, "Anil",  25000));
		list.add(new Employee1(106, "Amar", 45000));
		list.add(new Employee1(107, "Harsha", 5000));
		
		Predicate<Double> p = i -> i < 10000;
		ArrayList<String> res = new ArrayList<>();
		list.forEach(
				i ->{
					if(p.test(i.getSalary()))res.add(i.getName());
				});
		System.out.print(res);

	}

}
