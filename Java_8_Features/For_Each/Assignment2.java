package For_Each;

import java.util.ArrayList;

class Employee{
	int empId;
	double Salary;
	String address, name;
	Employee(int empId, double salary, String address, String name) {
	
		this.empId = empId;
		this.Salary = salary;
		this.address = address;
		this.name = name;
	}
	
	
}

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee(1, 4000, "Blr", "Amar");
		Employee emp2 = new Employee(2, 6000, "Blr", "Somesh");
		Employee emp3 = new Employee(3, 8000, "Chennai", "Suresh");
		Employee emp4 = new Employee(4, 4000, "Blr", "Kamakshi");
		Employee emp5 = new Employee(5, 5000, "Hyd", "Kumari");
		
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		
		empList.forEach(emp -> System.out.println("ID: " +emp.empId+ " Name: " +emp.name+ " Salary: " +emp.Salary+ " Address: " +emp.address));
	}

}
