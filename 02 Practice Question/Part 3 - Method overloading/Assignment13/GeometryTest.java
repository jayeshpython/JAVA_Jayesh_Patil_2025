

import java.util.Scanner;

class Geometry{
    
    void area(int side){
        System.out.println("Area of square: " + side*side);
    }

    void area(int l, int b){
        System.out.println("Area of rectangle: " + l*b);
    }

    void area(double r){
        System.out.println("Area of circle: " + 2*3.14*r);
    }
}

public class GeometryTest{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Geometry g = new Geometry();

        System.out.println("Enter side: ");
        int side = sc.nextInt();
        g.area(side);
        System.out.println();

        System.out.println("Enter length: ");
        int l = sc.nextInt();
        System.out.println("Enter breadth: ");
        int b = sc.nextInt();
        g.area(l, b);
        System.out.println();

        System.out.println("Enter radius: ");
        double r = sc.nextDouble();
        g.area(r);

    }
}