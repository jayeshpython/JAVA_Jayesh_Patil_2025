

package com.employeeManagement.employee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
    
@RestController  
@RequestMapping("/Employee")

public class EmployeeController {

    private ArrayList<Employee> empList = new ArrayList<>();

    public EmployeeController(){
        empList.add(new Employee(11, "Jayesh", "Arts", 100000));
        empList.add(new Employee(21, "Sanket", "Computer", 80000));
        empList.add(new Employee(31, "Rupesh", "Civil", 9000));
    }

    @GetMapping("/allEmployee")
    public ArrayList<Employee> getAllEmployee(){
        return empList;
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        for (Employee e : empList) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }

    @PostMapping
    public String addEmployee(@RequestBody Employee emp) {
        empList.add(emp);
        return "Employee Added";
    }

    @PutMapping("/{id}")
    public String updateEmployee(@PathVariable int id, @RequestBody Employee emp) {
        for (Employee e : empList) {
            if (e.getId() == id) {
                e.setName(emp.getName());
                e.setDepartment(emp.getDepartment());
                e.setSalary(emp.getSalary());
                return "Employee Updated";
            }
        }
        return "Employee Not Found";
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable int id) {
        for (Employee e : empList) {
            if (e.getId() == id) {
                empList.remove(e);
                return "Employee Deleted";
            }
        }
        return "Employee Not Found";
    }

    @GetMapping("/department/{dept}")
    public List<Employee> getEmployeeByDepartment(@PathVariable String dept) {

        List<Employee> result = new ArrayList<>();

        for (Employee e : empList) {
            if (e.getDepartment().equalsIgnoreCase(dept)) {
                result.add(e);
            }
        }
        return result;
    }
}
