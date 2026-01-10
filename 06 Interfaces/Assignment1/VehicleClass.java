
/*
    - Define an abstract class vehicle having fields 
			- string type
			- int MaxSpeed
		- abstract methods:
			- start()
			- stop()
		- concreate methods:
			- fuelEffficiency() (which returns different efficiency based on types)
	- Define an - interface Electric with method ChargeBattery()
				- interface FuelBased wiht method refuel()
    - Create a class ElectricCar which extends vehicle and implements Electric(implement the method logically like increasing 
        the battery level for charge Battery.)
    - Create a class GasolineCar that extends vehicle and implements FuelBAsed. Implement refuel() to add fuel to the car.
*/

interface Electric{
    public void chargeBattery();
}

interface FuelBased{
    public void refuel();
}

abstract class Vehicle{
    private String vehicleName;
    private String type;
    private int maxSpeed;

    public abstract void start();
    public abstract void stop();

    public Vehicle(String vehicleName, String type, int maxSpeed){
        this.vehicleName = vehicleName;
        this.type = type;
        this.maxSpeed = maxSpeed;
    }

    public int getFuelEfficiency(){
        if(type == "Electric")
            return 100;
        else if(type == "Gasoline")
            return 70;
        
        return 0;
    }

    public String getVehicleName(){
        return vehicleName;
    }
    public String getType(){
        return type;
    }
    public int getMaxSpeed(){
        return maxSpeed;
    }
}

class ElectricCar extends Vehicle implements Electric{
    private int batteryLevel;

    public ElectricCar(String vehicleName, String type, int maxSpeed, int batteryLevel){
        super(vehicleName, type, maxSpeed);
        this.batteryLevel = batteryLevel;
    }

    @Override
    public void start(){
        System.out.println(getVehicleName() + " of " + getType() + " started");
    }

    @Override
    public void stop(){
        System.out.println(getVehicleName() + " of " + getType() + " stopped");
    }

    public void chargeBattery(){
        if(batteryLevel < 100){
            batteryLevel = 100;
            System.out.println("Battery charged. Current battery level: " + batteryLevel);
        }
        else{
            System.out.println("Battery is already fully charged");
        }
    }
} 

class GasolineCar extends Vehicle implements FuelBased{
    private int fuel;

    public GasolineCar(String vehicleName, String type, int maxSpeed, int fuel){
        super(vehicleName, type, maxSpeed);
        this.fuel = fuel;
    }

    @Override
    public void start(){
        System.out.println(getVehicleName() + " of " + getType() + " started");
    }

    @Override
    public void stop(){
        System.out.println(getVehicleName() + " of " + getType() + " stopped");
    }

    public void refuel(){
        if(fuel < 100){
            fuel = 100;
            System.out.println("Fuel level: " + fuel);
        }
        else{
            System.out.println("Tank is alredy full");
        }
    }
}

public class VehicleClass{
    public static void main(String[] args) {
        
        Vehicle v;
        ElectricCar tesla = new ElectricCar("Tesla", "Electric", 240, 70);
        GasolineCar fortuner = new GasolineCar("Fortuner", "Diesel", 200, 90);

        tesla.start();
        tesla.chargeBattery();
        tesla.stop();
        System.out.println();
        fortuner.start();
        fortuner.refuel();
        fortuner.stop();
    }
}