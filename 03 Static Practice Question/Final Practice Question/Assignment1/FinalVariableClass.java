

class FinalVariable{
    final double p1 = 3.14159;
    double radius;

    FinalVariable(double radius){
        this.radius = radius;
    }

    void calculateArea(){
        double area = p1 * radius * radius;
        System.out.println("Area: " + area);
    }
}

public class FinalVariableClass{
    public static void main(String[] args) {
        
        FinalVariable f = new FinalVariable(5);
        f.calculateArea();
    }
}
