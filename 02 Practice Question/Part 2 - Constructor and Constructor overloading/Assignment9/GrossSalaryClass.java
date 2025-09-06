

class Employee{
    String empName;
    double basicSalary;
    double grossSalary;

    Employee(String empName, double basicSalary){
        this.empName = empName;
        this.basicSalary = basicSalary;
        grossSalary = basicSalary + (0.20 * basicSalary) + (0.10 * basicSalary);
    }

    void displayDetails(){
        System.out.println("Employee Name: " + empName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Bross Salary: " +grossSalary);
    }
}

public class GrossSalaryClass{
    public static void main(String[] args) {
        
        Employee emp = new Employee("Yashraj Gavda", 20000);
        emp.displayDetails();
    }
}