

class Laptop{
    String companyName;
    String model;
    double price;

    Laptop(String companyName){
        this.companyName = companyName;
        model = "G15";
        price = 80000;
    }

    Laptop(String companyName, String model){
        this.companyName = companyName;
        this.model = model;
        price = 70000;
    }

    Laptop(String companyName, String model, double price){
        this.companyName = companyName;
        this.model = model;
        this.price = price;
    }

    void displayDetails(){
        System.out.println("Company Name: " + companyName);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}

public class LaptopTest{
    public static void main(String[] args) {
        
        Laptop l1 = new Laptop("Dell");
        Laptop l2 = new Laptop("HP", "Victus");
        Laptop l3 = new Laptop("Mac", "M1", 150000);

        l1.displayDetails();
        System.out.println();
        l2.displayDetails();
        System.out.println();
        l3.displayDetails();
    }
}