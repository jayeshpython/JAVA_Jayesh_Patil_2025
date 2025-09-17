

class Company{
    String companyName;

    Company(String companyName){
        this.companyName = companyName;
    }

    class Employee{
        String empName;
        double salary;

        Employee(String empName, double salary){
            this.empName = empName;
            this.salary = salary;
        }

        void display(){
            System.out.println("Company name: " + companyName);
            System.out.println("Employee name: " + empName);
            System.out.println("Salary: " + salary);
        }
    }
}

public class CompanyTest{
    public static void main(String[] args) {
        
        Company c1 = new Company("Tesla");
        Company c2 = new Company("Google");

        Company.Employee e1 = c1.new Employee("Patle", 5000000);
        Company.Employee e2 = c2.new Employee("Harsh", 1000000);

        e1.display();
        System.out.println();
        e2.display();
    }
}
