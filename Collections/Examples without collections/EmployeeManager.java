
/*
Program: Employee manager using array
Concept: simulate CRUD operations without collection framework 
*/

import java.util.Scanner;

class Employee{
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary){
        this.id = id;
        this.name =name;
        this.salary = salary;
    }

    void display(){
        System.out.println(id +" " + name + " " + salary);
    }
}

public class EmployeeManager{

    static Employee[] employees = new Employee[10];
    static int count =0;

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int ch;

        do{
            System.out.println("---------Employee Menu-------");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All");
            System.out.println("3. Search by ID");
            System.out.println("4. Delete by ID");
            System.out.println("5. Exit");
            System.out.println("Enter choice: ");
            ch = sc.nextInt();

            switch(ch){
                case 1 -> addEmployee(sc);
                case 2 -> displayAll();
                case 3 -> searchEmployee(sc);
                case 4 -> deleteEmployee(sc);
                case 5 -> System.out.println("Exiting....");
                default -> System.out.println("Invalid choice.");
            }
        } while (true);
        
    }

    static void addEmployee(Scanner sc){

        if(count >= employees.length){
            System.out.println("Array full! cannot add more employees.");
            return;
        }

        System.out.println("Enter id: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter salary: ");
        double salary = sc.nextDouble();

        employees[count++] = new Employee(id, name, salary);
        System.out.println("Employees added successfully");
    }

    static void displayAll(){
        System.out.println("\n------ Employee List -------");
        for(int i = 0; i <count; i++){
            employees[i].display();
        }
    }

    static void searchEmployee(Scanner sc){


        System.out.println("Enter id to search: ");
        int id = sc.nextInt();

        for(int i =0 ; i< count; i++){
            if(employees[i].id == id){
                System.out.println("Record found: ");
                employees[i].display();
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    static void deleteEmployee(Scanner sc){

        System.out.println("Enter id to delete: ");
        int id = sc.nextInt();

        for(int i = 0; i < count; i++){
            if(employees[i].id == id){

                for(int j = 1; j < count; j++){
                    employees[j] = employees[j+1];
                }
                employees[--count] = null;
                System.out.println("Employee deleted");
                return;
            }
        }
        System.out.println("Employee not found.");
    }

}