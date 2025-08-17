
import java.util.Scanner;

class Rectangle{
    int length;
    int breadth;
    int area;
    int perimeter;

    void acceptDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = sc.nextInt();
        System.out.print("Enter breadth: ");
        breadth = sc.nextInt();
    }

    void calculateArea(){    
        area =  length * breadth;
    }
    void calculatPerimeter(){
        perimeter =  2*(length + breadth);
    }

    void displayAreaPerimeter(){
        System.out.println("Area of rectangle: " + area);
        System.out.println("Perimeter of rectangle: " + perimeter);
    }

    Rectangle compareArea(Rectangle a1, Rectangle a2){

        if(this.area > a1.area && this.area > a2.area)
            return this;

        if(this.area < a1.area && a1.area > a2.area)
            return a1;
        return a2;
    }
}

public class LargestArea{
    public static void main(String[] args) {
        
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        Rectangle r3 = new Rectangle();

        System.out.println("Enter details for Rectangle 1:");
        r1.acceptDetails();
        r1.calculateArea();
        r1.calculatPerimeter();

        System.out.println("\nEnter details for Rectangle 2:");
        r2.acceptDetails();
        r2.calculateArea();
        r2.calculatPerimeter();

        System.out.println("\nEnter details for Rectangle 3:");
        r3.acceptDetails();
        r3.calculateArea();
        r3.calculatPerimeter();

        System.out.println();
        System.out.println("\nRectangle 1 details:");
        r1.displayAreaPerimeter();
        System.out.println();
        System.out.println("\nRectangle 2 details:");
        r2.displayAreaPerimeter();
        System.out.println();
        System.out.println("\nRectangle 3 details:");
        r3.displayAreaPerimeter();

        System.out.println();
        System.out.println("Displaying rectangle with highest area: ");
        Rectangle r4 = r1.compareArea(r2, r3);
        r4.displayAreaPerimeter();
    }
}