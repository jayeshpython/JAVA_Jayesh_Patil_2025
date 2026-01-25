
package com.employee.service;
import com.employee.bean.Employee;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService{
    
    Scanner sc = new Scanner(System.in);

    @Override
    public void getEmployeeDetails(Employee emp){
        
        System.out.println("Enter ID: ");
        emp.setId(sc.nextInt());
        System.out.println("Enter Name: ");
        emp.setName(sc.next());
        System.out.println("Enter Salary: ");
        emp.setSalary(sc.nextDouble());
        System.out.println("Enter Designation: ");
        emp.setDesignation(sc.next());
    }

    @Override
    public String findInsuranceScheme(Employee emp){
        double salary = emp.getSalary();
        String designation = emp.getDesignation();

        if(salary > 50000 && designation.equalsIgnoreCase("Manager")){
            emp.setInsuranceScheme("Premium");
        }
        else if(salary > 20000){
            emp.setInsuranceScheme("Gold");
        }
        else{
            emp.setInsuranceScheme("No scheme");
        }
        return emp.getInsuranceScheme();
    }

    @Override
    public void displayEmployeeDetails(Employee emp){

        System.out.println("Employee Details");
        System.out.println("ID: " + emp.getId());
        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: " + emp.getSalary());
        System.out.println("Designation: " + emp.getDesignation());
        System.out.println("Insurance Scheme: " + emp.getInsuranceScheme());
    }
}
