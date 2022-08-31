/*
 *  Create a class called Person with a member variable name. Save it in a file called Person.java

Create a class called Employee that will inherit the Person class.The other data members of the Employee class are annual salary (double), the year the employee started to work, and the national insurance number which is a String.Save this in a file called Employee.java

Your class should have the necessary constructors and getter/setter methods.

Write another class called TestEmployee, containing a main method to fully test your class definition.
 */

package inheritance.Assignment2;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp = new Employee("Harsha", 650000, 2022, "123644850");
		System.out.println("Employee Details:");
		System.out.println("Name: " +emp.getName());
		System.out.println("Year of Starting: " +emp.getYearOfStart());
		System.out.println("Annual Salary: "+emp.getAnnualSalary());
		System.out.println("Insuransce Number: " +emp.getNationalInsuranceNo());

	}

}
