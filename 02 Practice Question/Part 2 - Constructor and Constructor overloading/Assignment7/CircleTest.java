
import java.util.Scanner;

class Circle{
    double radius;
    double area;
    double circumference;

    Circle(double  r){
        radius = r;
        area = 3.14 * radius * radius;
        circumference = 2 * 3.14 * radius;
    }

    void displayDetails(){
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }
}

public class CircleTest{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: ");
        double r = sc.nextDouble();

        Circle c = new Circle(r);
        c.displayDetails();
    }
}