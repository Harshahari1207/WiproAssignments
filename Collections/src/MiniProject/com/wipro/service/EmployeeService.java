package MiniProject.com.wipro.service;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import MiniProject.com.wipro.bean.*;

public class EmployeeService {
	
	Scanner sc = new Scanner(System.in);
	private List<EmployeeBean> listEmp = new ArrayList<>();
	
	public boolean insertEmployee(EmployeeBean bean) {
		if(!listEmp.contains(bean)){
			listEmp.add(bean);
			return true;
		}
		return false;
	}
	
	public String insertEmployeeByPosition(EmployeeBean bean, int position) {
		if(position<0 || position>listEmp.size()) {
			listEmp.add(bean);
			 return "Inserted employee at end postion ";
		}
		listEmp.add(position, bean);
		return "Inserted employee at position : "+(position+1);
	}
	
     public List<EmployeeBean> fetchAllEmployees(){
        
        if(listEmp==null) {
            return null;
        }
        
        return listEmp;
        
      }
     
     public boolean deleteEmployeeByEmpID(int empID) {
    	 ListIterator<EmployeeBean> li = listEmp.listIterator();
    	 
    	 while(li.hasNext()) {
    		 if(li.next().getEmpId() == empID) {
    			 li.remove();
    			 return true;
    		 }
    	 }
    	 return false;
     }
     
     
     public boolean updateEmployeeEmpID(int empID) {
    	 ListIterator<EmployeeBean> li = listEmp.listIterator();
    	 
    	 while(li.hasNext()) {
    		 if(li.next().getEmpId() == empID) {
    			 System.out.println("Enter name : ");
    			 ((EmployeeBean) li).setName(sc.nextLine());
    			 System.out.println("Enter salary: ");
    			 ((EmployeeBean) li).setSalary(sc.nextFloat());
    			 System.out.println("Enter designation: ");
    			 ((EmployeeBean) li).setDesignation(sc.nextLine());
    			 
    			 return true;
    		 }
    	 }
    	 return false;
     }
     
     public EmployeeBean findEmployeeByEmpID(int empID) {
    	 ListIterator<EmployeeBean> li = listEmp.listIterator();
    	 
    	 while(li.hasNext()) {
    		 if(li.next().getEmpId() == empID) {
    			 System.out.println("Name: ");
    			 ((EmployeeBean) li).getName();
    			 System.out.println("Salary: ");
    			 ((EmployeeBean) li).getSalary();
    			 System.out.println("Designation: ");
    			 ((EmployeeBean) li).getDesignation();
    		 }
    	 }
    	 return null;
     }

}
