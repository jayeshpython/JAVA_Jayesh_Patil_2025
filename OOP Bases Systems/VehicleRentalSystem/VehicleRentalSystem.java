

//you have to design a vehicle rental system where different types of vehicle can be rented.
//Vehicle(Super class)
//fields: vehicleNumber, basePricePerDay
//Methods: getRent(int days), returns cost(default = basePrice perDay * days)
//getType() -> "Generic Vehicle", 

//Car(Subclass of vehicle)
//Fields - sittingCapacity
//Methods overrride getRent(int days) - rent increases by rupees 200 per day if sitting capacity gretter than 4
//Override getType() - "Car"

//Bike(Subclass of vehicle)
//Fiels - helmetIncluded(boolean)
//getRent(int days) - if helmet == true, rent adds rupees 50 per day 
//Override getType() - "Bike";

//LuxuryCar(Subclass of car)
//Fiels - driverIncluded 
//Override getRent(int days) -> normal car rent + 10000 flat fee if driver included
//Override getType() -> "Luxury Car"
//Use Coverient return type: A method getBuddyVehicle() in vehicle return vehicle, but in luxury car it can return luxury car

//Polymorphism requirement:
//Create an array vehicle[] fleet containing car, bike, luxuryCar.
//Iterate and calculate rent using polymorphism - fleet of i.getRent(days).


import java.util.Scanner;

//Superclass
class Vehicle{
    String vehicleNumber;
    double basePricePerDay;

    //Constructor
    Vehicle(String vehicleNumber, double basePricePerDay){
        this.vehicleNumber = vehicleNumber;
        this.basePricePerDay = basePricePerDay;
    }

    public double getRent(int days){
        return basePricePerDay * days;
    }

    public String getType(){
        return "Generic Vehicle";
    }

    public Vehicle getBuddyVehicle(){
        return new Vehicle("Abc123", 1000);
    }
}

//SubClass
class Car extends Vehicle{
    int sittingCapacity;

    //Constructor
    Car(String vehicleNumber, double basePricePerDay, int sittingCapacity){
        super(vehicleNumber, basePricePerDay);
        this.sittingCapacity = sittingCapacity;
    }

    @Override
    public double getRent(int days){
        double rent = super.getRent(days);
        if(sittingCapacity > 4){
            rent += 200 * days;
        }
        return rent;
    }

    @Override
    public String getType(){
        return "Car";
    }
}

//Subclass
class Bike extends Vehicle{
    boolean helmetIncluded;

    Bike(String vehicleNumber, double basePricePerDay, boolean helmetIncluded){
        super(vehicleNumber, basePricePerDay);
        this.helmetIncluded = helmetIncluded;
    }

    @Override
    public double getRent(int days){
        double rent = super.getRent(days);
        if(helmetIncluded){
             rent = rent + 50*days;
        }
        return rent;
    }

    @Override
    public String getType(){
        return "Bike";
    }
}

//Subclass
class LuxuryCar extends Car{
    boolean driverIncluded;

    LuxuryCar(String vehicleNumber, double basePricePerDay, int sittingCapacity, boolean driverIncluded){
        super(vehicleNumber, basePricePerDay, sittingCapacity);
        this.driverIncluded = driverIncluded;
    }
    
    @Override
    public double getRent(int days){
        double rent = super.getRent(days);
        if(driverIncluded){
            rent += 10000;
        }
        return rent;
    }
    
    @Override
    public String getType(){
        return "Luxury Car";
    }
}

public class VehicleRentalSystem{
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        System.out.println("**********Welcome Vehicle Rental System********");
        System.out.println("Enter number of vehicle you want to rent: ");
        int n = sc.nextInt();

        Vehicle[] fleet = new Vehicle[n];
        for(int i=0 ; i<n; i++){
            System.out.println("Select vehicle type: \n1. Car\n2. Bike\n3. Luxury Car");
            int choice = sc.nextInt();
            sc.nextLine();   

            System.out.println("Enter Vehicle Number: ");
            String number = sc.nextLine();
            System.out.println("Enter Base Price Per day: ");
            double price = sc.nextDouble();
            System.out.println("Enter Number of Day: ");
            int days = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Enter sitting capacity of car: ");
                    int seats = sc.nextInt();
                    fleet[i] = new Car(number, price, seats);
                    System.out.println("Rent for: " + days + "days Rs" + fleet[i].getRent(days));
                    break;

                case 2:
                    System.out.println("Helmet included ? (True or False): ");
                    boolean helmet = sc.nextBoolean();
                    fleet[i] = new Bike(number, price, helmet);
                    System.out.println("Rent for: " + days + "days Rs" + fleet[i].getRent(days));
                    break;

                case 3:
                    System.out.println("Enter sitting capacity of car: ");
                    int lseats = sc.nextInt();
                    System.out.println("Driver include ? (True or False): ");
                    boolean driver = sc.nextBoolean();
                    fleet[i] = new LuxuryCar(number, price, lseats, driver);
                    System.out.println("Rent for: " + days + "days Rs" + fleet[i].getRent(days));
                    break;

                default:
                    System.out.println("Invalid choice.");
                    i--;   //Retry this iteration
            }
        }
        System.out.println("\n==========Fleet Summary==========");
        for(Vehicle v: fleet){
            System.out.println(v.getType() + "( " + v.vehicleNumber + ") - Base Price: " + v.basePricePerDay );
        }
        sc.close();
    }
}


