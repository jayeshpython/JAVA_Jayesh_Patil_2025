
import java.util.*;

class Employee{
    private int id;
    private String name;

    //Constructor
    public Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    //getter() 
    public int getID(){ return id;}

    public String getName(){ return name;}

    public String toString(){
        return "Employee name: " + name + " | ID: " + id;
    }
}

class EmployeeManagement{
    private ArrayList<Employee> employees = new ArrayList<>();

    public void addEmployees(int id, String name){
        Employee e = new Employee(id, name);
        employees.add(e);
        System.out.println("Employee added successfully");
    }

    public void displayEmployees(){
    System.out.println("Employees in company:");
    for(Employee e : employees){
        System.out.println("ID: " + e.getID() + ", Name: " + e.getName());
    }
}


    public Employee retriveEmployee(int id){
        for(Employee e : employees){
            if(e.getID() == id){
                return e;
            }
        }
        return null;
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        EmployeeManagement employee = new EmployeeManagement();
        
        int choice;
        do { 
            System.out.println("\n*********** Employee Menu **********");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All");
            System.out.println("3. Search by ID");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1 ->{
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter id: ");
                    int id = sc.nextInt();
                    employee.addEmployees(id, name);
                } 
                case 2 -> employee.displayEmployees();

                case 3 -> {
                    System.out.print("Enter employee id to retrive: ");
                    int searchId = sc.nextInt();
                    sc.nextLine();
                    Employee emp = employee.retriveEmployee(searchId);

                    if(emp != null){
                        System.out.println("Employee name: " + emp.getName());
                        System.out.println("Employee id: " + emp.getID());
                    }else{
                        System.out.println("Employee not found.");
                    }
                }

                case 4 -> System.out.println("Exiting....");
                default -> System.out.println("Invalid choice.");
            }
        } while (choice != 4);
        sc.close();
    }
}
