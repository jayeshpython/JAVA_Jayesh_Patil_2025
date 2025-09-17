

class Car {
    String brand;

    Car(String brand) {
        this.brand = brand;
    }

    class Engine {
        int horsePower;

        Engine(int hp) {
            horsePower = hp;
        }
    }

    void showDetails(Engine engine) {
        System.out.println("Car Brand: " + brand + ", Engine HP: " + engine.horsePower);
    }
}

public class CarDemo {
    public static void main(String[] args) {
       
        Car c1 = new Car("Tata");
        Car c2 = new Car("BMW");

        Car.Engine e1 = c1.new Engine(90);
        Car.Engine e2 = c2.new Engine(200);

        c1.showDetails(e1);
        c2.showDetails(e2);
    }
}
