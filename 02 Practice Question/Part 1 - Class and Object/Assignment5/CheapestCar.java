
    
import java.util.Scanner;

class Car{
    String model;
    float mileage;
    double price;

    void acceptDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter model: ");
        model = sc.nextLine();
        System.out.println("Enter mileage: ");
        mileage = sc.nextFloat();
        System.out.println("Enter price: ");
        price = sc.nextDouble();
    }

    void displayDetails(){
        System.out.println("Model: " + model);
        System.out.println("Mileage: " + mileage);
        System.out.println("Price: " + price);
    }

    void cheapestCarMileage(Car[] car, int n){

        double p = car[0].price;
        int index = -1;

        for(int i = 0; i < n; i++){
            if(car[i].mileage > 20 && car[i].price < p){
                p = car[i].price;
                index = i;
            }
        }
        car[index].displayDetails();
    }
}

public class CheapestCar{
    public static void main(String[] args) {
        
        Car[] car = new Car[4];

        for(int i = 0; i < car.length; i++){
            car[i] = new Car();
            car[i].acceptDetails();
        }

        System.out.println("Displaying all cars details: ");
        for(int i = 0; i < car.length; i++){
            car[i].displayDetails();
        }

        car[0].cheapestCarMileage(car, car.length);
    }
}
