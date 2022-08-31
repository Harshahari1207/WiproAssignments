package inheritance.Assignment2;

public class Employee extends Person{
	private double annualSalary;
	private int yearOfStart;
	private String nationalInsuranceNo;
	public Employee(String name, double annualSalary, int yearOfStart, String nationalInsuranceNo) {
		super(name);
		this.annualSalary = annualSalary;
		this.yearOfStart = yearOfStart;
		this.nationalInsuranceNo = nationalInsuranceNo;
	}
	public double getAnnualSalary() {
		return annualSalary;
	}
	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}
	public int getYearOfStart() {
		return yearOfStart;
	}
	public void setYearOfStart(int yearOfStart) {
		this.yearOfStart = yearOfStart;
	}
	public String getNationalInsuranceNo() {
		return nationalInsuranceNo;
	}
	public void setNationalInsuranceNo(String nationalInsuranceNo) {
		this.nationalInsuranceNo = nationalInsuranceNo;
	}

	
	

}
