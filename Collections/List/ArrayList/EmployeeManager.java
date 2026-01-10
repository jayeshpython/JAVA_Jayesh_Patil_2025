
import java.util.*;

class Employee{
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    void display(){
        System.out.println("Id: " +id + ", Name:  " + name +", Salary: " + salary);
    }
}

public class EmployeeManager{

    static ArrayList<Employee> employees = new ArrayList<>();

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int choice;
        do { 
            System.out.println("*********** Employee Menu **********");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All");
            System.out.println("3. Search by ID");
            System.out.println("4. Delete by ID");
            System.out.println("5. Exit");
            System.out.println("Enter choice: ");
            choice = sc.nextInt();

            switch(choice){
                case 1 -> addEmployee(sc);
                case 2 -> displayAll();
                case 3 -> searchEmployee(sc);
                case 4 -> deleteEmployee(sc);
                case 5 -> System.out.println("Exiting....");
                default -> System.out.println("Invalid choice.");
            }
        } while (choice != 5);
        sc.close();
    }

        static void addEmployee(Scanner sc){
            
            System.out.println("Enter id: ");
            int id = sc.nextInt();
            System.out.println("Enter name: ");
            String name= sc.nextLine();
            System.out.println("Enter salary: ");
            double salary = sc.nextDouble();

            employees.add(new Employee(id, name, salary));
            System.out.println("Employee added successfully");
        }

        static void displayAll(){

            if(employees.isEmpty()){
                System.out.println("No employees to display");
                return;
            }
            System.out.println("\n******* Employee List ******");
            for(Employee e: employees){
                e.display();
            }
        }

        static void searchEmployee(Scanner sc){

            System.out.println("Enter id to search: ");
            int id = sc.nextInt();

            for(Employee e: employees){
                if(e.id == id){
                    System.out.println("Record found: ");
                    e.display();
                    return;
                }
            }
            System.out.println("Employee not found");
        }

        static void deleteEmployee(Scanner sc){

            System.out.println("Enter id to delete: ");
            int id = sc.nextInt();

            Iterator<Employee> itr = employees.iterator();

            while(itr.hasNext()){
                Employee e = itr.next();

                if(e.id == id){
                    itr.remove();
                    System.out.println("Employee deleted successfully");
                    return;
                }
            }
            System.out.println("Employee not found");
        }
    
}
