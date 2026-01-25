
package com.employee.pl;
import com.employee.bean.Employee;
import com.employee.service.EmployeeService;
import com.employee.service.EmployeeServiceImpl;

public class MainApp {
    public static void main(String[] args) {
        
        Employee emp = new Employee();
        EmployeeService service = new EmployeeServiceImpl();
        service.getEmployeeDetails();
        service.findInsuranceScheme();
        service.displayEmployeeDetails();
    }
}
