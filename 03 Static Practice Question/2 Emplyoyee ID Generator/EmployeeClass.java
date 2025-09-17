

class Employee{
    private int empId;
    private static int generateId = 101;
    private static int employeeCount = 0;

    public Employee(){
        this.empId = generateEmployeeId();
        employeeCount++;
    }

    public static int generateEmployeeId(){
        do { 
            generateId++;
        } while (generateId % 7 == 0);
        return generateId;
    }

    public void dispaly(){
        System.out.println("Booking id: " + empId);
    }

    public static void TotalEmployee(){
        System.out.println("Total Employee: " + employeeCount);
    }
}

public class EmployeeClass{
    public static void main(String[] args) {
        
        Employee[] e = new Employee[10];
        for (int i = 0; i < 10; i++){
            e[i] = new Employee();
            e[i].dispaly();
        }
            
        Employee.TotalEmployee();
    }
}
