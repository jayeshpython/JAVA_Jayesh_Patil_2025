
import java.time.LocalDate;

class Employee{
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day){
        this.name = name;
        this.salary = salary;
        hireDay = LocalDate.of(year,month,day);
    }
    
    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public LocalDate getHireDay(){
        return hireDay;
    }

    public void raiseSalary(double byPercent){
        double raise = salary * byPercent/100;
        salary = salary + raise;
    }
}

class Manager extends Employee{
    private double bonus;

    public Manager(String name, double salary, int year, int month, int day){
        super(name, salary, year,month,day);
        bonus = 0;
    }

    public double getSalary(){
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public void setBonus(double b){
        bonus = b;
    }
}

class Programmer extends Employee{
    private int completedProject;

    public Programmer(String name, double salary, int year, int month, int day){
        super(name, salary, year, month, day);
        completedProject = 0;
    }

    public void addProject(){
        completedProject++;
    }

    public double getSalary(){
        return super.getSalary() + (completedProject *1000);
    }
}

class Secretary extends Employee{
    private int overTimeHours;

    public Secretary(String name, double salary, int year, int month, int day){
        super(name, salary, year, month, day);
        overTimeHours = 0;
    }

    public void addOverTime(int hours){
        overTimeHours +=  hours;
    }

    public double getSalary(){
        return super.getSalary() + (overTimeHours *500);
    }
}

class Executive extends Manager{
    private double stockOption;

    public Executive(String name, double salary, int year, int month, int day){
        super(name, salary, year, month, day);
        stockOption = 0;
    }

    public void setStockOption(double stock){
        stockOption = stock;
    }

    public double getSalary(){
        return super.getSalary() + stockOption;
    }
}

public class ManagerTest{
    public static void main(String[] args) {
        
        var boss = new Manager("Rajesh Shinde", 50000, 1987, 12, 15);
        boss.setBonus(5000);
        var ceo = new Executive("Meena Joshi", 80000, 1980, 5, 20);
        ceo.setBonus(10000);
        ceo.setStockOption(25000);

        var sec = new Secretary("Anita Patil", 40000, 1992, 8,2);
        sec.addOverTime(5);

        var dev = new Programmer("Suresh Raut", 50000, 1995, 1, 21);
        dev.addProject();
        dev.addProject();

        var staff = new Employee[4];
        staff[0] = boss;
        staff[1] = ceo;
        staff[2] = sec;
        staff[3] = dev;

        for(Employee e: staff){
            System.out.println("Name: " + e.getName() + " Salary: " + e.getSalary());

        }
    }
}



