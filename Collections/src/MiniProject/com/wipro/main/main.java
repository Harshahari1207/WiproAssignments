package MiniProject.com.wipro.main;

import java.util.Scanner;

import MiniProject.com.wipro.bean.EmployeeBean;
import MiniProject.com.wipro.service.EmployeeService;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		EmployeeBean eb1=new EmployeeBean(1001,"Sunny",35000,"Project Engineer");
        EmployeeBean eb2=new EmployeeBean(1002,"Vikash",40000,"System Engineer");
        EmployeeBean eb3=new EmployeeBean(1003,"Shubham",45000,"Senior Engineer");
        EmployeeBean eb4=new EmployeeBean(1004,"Shashank",65000,"Associate Engineer");
        EmployeeBean eb5=new EmployeeBean(1005,"Vishal",25000,"Junior Engineer");
        
        EmployeeService es=new EmployeeService();
        
        System.out.println(es.insertEmployee(eb1));
        System.out.println(es.insertEmployee(eb2));
        System.out.println(es.insertEmployee(eb3));
        System.out.println(es.insertEmployeeByPosition(eb4, 1));
        System.out.println(es.insertEmployeeByPosition(eb5, 200));
        
        es.fetchAllEmployees();
        
        for(EmployeeBean emp:es.fetchAllEmployees()) {
            System.out.println(emp.toString());
        }
        
        System.out.println();
        
        es.deleteEmployeeByEmpID(1003);
        
        for(EmployeeBean emp:es.fetchAllEmployees()) {
            System.out.println(emp.toString());
        }
        
        System.out.println();
        
        es.updateEmployeeEmpID(1004);
        
        
        
        for(EmployeeBean emp:es.fetchAllEmployees()) {
            System.out.println(emp.toString());
        }
        
        es.findEmployeeByEmpID(1001);

	}

}
