
import java.util.Scanner;

class Calculator{

    int calculate(int value){
        return value * value;
    }

    double calculate(double num){
        return num * num * num;
    }

    float calculate(float x){
        return (float)Math.sqrt(x);
    }
}

public class CalculatorTest{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Calculator cal = new Calculator();

        System.out.println("Enter integer value: ");
        int n1 = sc.nextInt();
        System.out.println("Square " + n1 + " = " + cal.calculate(n1));

        System.out.println("Enter double value: ");
        double n2 = sc.nextDouble();
        System.out.println("Cube " + n2 + " = " + cal.calculate(n2));

        System.out.println("Enter float value: ");
        float n3 = sc.nextFloat();
        System.out.println("Square root " + n3 + " = " + cal.calculate(n3));
    }
}