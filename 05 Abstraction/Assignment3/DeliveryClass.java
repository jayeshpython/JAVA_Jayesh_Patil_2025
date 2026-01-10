
import java.util.*;

interface Trackable{
    public void updateStatus(String status);
    public void generateReport();
}

abstract class Delivery{
    double distance;
    int weight;

    abstract void transport();
    abstract double calculateCost(double distance, int weight);

    public void bookDelivery(double distance, int weight){
        this.distance = distance;
        this.weight = weight;

        System.out.println("Delivery booked");
        transport();
        System.out.println("Total cost: " + calculateCost(distance, weight));
    }
}

class AirDelivery extends Delivery implements Trackable{

    void transport(){
        System.out.println("Transportation by air");
    }
    double calculateCost(double distance, int weight){
        return distance * weight * 1000;
    }

    public void updateStatus(String status){
        System.out.println("Air status: " + status);
    }
    public void generateReport(){
        System.out.println("Air delivery report is being generated");
    }
}

class LandDelivery extends Delivery implements Trackable{

    void transport(){
        System.out.println("Transportation by land");
    }
    double calculateCost(double distance, int weight){
        return distance * weight * 10;
    }

    public void updateStatus(String status){
        System.out.println("Land status: " + status);
    }

    public void generateReport(){
        System.out.println("Land delivery report is being generated");
    }
}

class SeaDelivery extends Delivery implements Trackable{

     void transport(){
        System.out.println("Transportation by sea");
    }
    double calculateCost(double distance, int weight){
        return distance * weight * 100;
    }

    public void updateStatus(String status){
        System.out.println("Sea status: " + status);
    }

    public void generateReport(){
        System.out.println("Sea delivery report is being generated");
    }
}

public class DeliveryClass{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Delivery d;
        Trackable t;

        while(true){
            System.out.println("Choose Delivery Mode: ");
            System.out.println("1. Air");
            System.out.println("2. Land");
            System.out.println("3. Sea");
            System.out.println("4. Exit");
            System.out.println("Enter choice: ");
            int ch = sc.nextInt();

            System.out.println("Enter distance: ");
            double distance = sc.nextDouble();
            System.out.println("Enter wieght: ");
            int weight = sc.nextInt();

            switch(ch){
                case 1:
                    d = new AirDelivery();
                    t = (AirDelivery)d;
                    break;

                case 2:
                    d = new LandDelivery();
                    t = (LandDelivery)d;
                    break;

                case 3:
                    d = new SeaDelivery();
                    t = (SeaDelivery)d;
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    return;

                default:
                    System.out.println("Invalid choice");
                    continue;
            }
            d.bookDelivery(distance, weight);
            System.out.println("Enter status: ");
            t.updateStatus(sc.next());
            t.generateReport();
        }

    }
}