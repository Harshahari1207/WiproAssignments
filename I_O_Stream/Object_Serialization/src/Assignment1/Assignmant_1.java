package Assignment1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import Assignment1.com.Employee;

public class Assignmant_1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		Scanner s = new Scanner(System.in);
		Employee emp = new Employee();
		System.out.print("Enter name: ");
		emp.setName(s.nextLine());
		System.out.print("Enter D.O.B: ");
		emp.setDob(s.nextLine());
		System.out.print("Enter Department: ");
		emp.setDepartment(s.nextLine());
		System.out.print("Enter Designation: ");
		emp.setDesignation(s.nextLine());
		System.out.print("Ener Salary: ");
		emp.setSalary(s.nextDouble());
		s.nextLine();
		
		FileOutputStream fos = new FileOutputStream("OutObject.txt");
		ObjectOutputStream oos =new ObjectOutputStream(fos);
		oos.writeObject(emp);
		
		
		FileInputStream fis = new FileInputStream("OutObject.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee emp2 = (Employee) ois.readObject();
		
		
		System.out.println("Name: " +emp2.getName());
		System.out.println("D.O.B: " +emp2.getDob());
		System.out.println("Department: " + emp2.getDepartment());
		System.out.println("Designation: " +emp2.getDesignation());
		System.out.println("Salary: " +emp2.getSalary());
		
		fos.close();
		oos.close();
		fis.close();
		ois.close();
		s.close();
		

	}

}
