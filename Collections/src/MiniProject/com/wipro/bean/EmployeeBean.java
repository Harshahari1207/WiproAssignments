package MiniProject.com.wipro.bean;

public class EmployeeBean {
	
	private int empId;
	private String name;
	private float salary;
	private String designation;
	
	
	public EmployeeBean() {
		super();
	}
	public EmployeeBean(int empId, String name, float salary, String designation) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "EmployeeBean [empId=" + empId + ", name=" + name + ", salary=" + salary + ", designation=" + designation
				+ "]";
	}
	
	

}
