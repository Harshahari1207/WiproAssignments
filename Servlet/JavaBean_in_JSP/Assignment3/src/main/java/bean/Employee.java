package bean;
public class Employee {
	
	private String empName, desg;
	private int id;
	public Employee(String empName, String desg, int id) {
		super();
		this.empName = empName;
		this.desg = desg;
		this.id = id;
	}
	public Employee() {
		super();
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	

}
