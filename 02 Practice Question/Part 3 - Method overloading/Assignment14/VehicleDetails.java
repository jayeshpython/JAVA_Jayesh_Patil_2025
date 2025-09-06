

class Vehicle{

    void showDetails(String name){
        System.out.println("Vehicle name: " + name);
    }

    void showDetails(String name, int speed){
        System.out.println("Vehicle name: " + name);
        System.out.println("Speed: " + speed + " kmph");
    }

    void showDetails(String name, int speed, double price){
        System.out.println("Vehicle name: " + name);
        System.out.println("Speed: " + speed + " kmph");
        System.out.println("Price: " + price);
    }
}

public class VehicleDetails{
    public static void main(String[] args) {
        
        Vehicle v = new Vehicle();

        v.showDetails("Honda");
        System.out.println();
        v.showDetails("Bullet", 150);
        System.out.println();
        v.showDetails("KTM", 120, 150000);
    }
}