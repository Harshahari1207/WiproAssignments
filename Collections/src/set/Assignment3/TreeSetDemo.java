package set.Assignment3;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.Vector;

public class TreeSetDemo {
	
	

	public static void main(String[] args) {
		TreeSet<String> H1 = new TreeSet<>();
		
		boolean addEmployee(Employee emp) {
			return H1.add(emp);
		}
		
		Vector<Employee> list = new Vector<>();
		
		list.add(new Employee(25, "Amar", 50000));
		list.add(new Employee(26, "Sunil", 45000));
		list.add(new Employee(27, "Muni", 60000));
		list.add(new Employee(28, "Ayan", 70000));
		list.add(new Employee(29, "Vamshi", 80000));
		
		list.displayAllEmployees();

	}
	

}
