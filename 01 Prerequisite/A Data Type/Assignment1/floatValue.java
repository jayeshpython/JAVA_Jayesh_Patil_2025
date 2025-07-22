
public class floatValue{
    public static void main(String[] args) {
        float number = 3.14f;

        int a = (int)number;
        float b = number - a;

        System.out.println("Number: " + number);
        System.out.println("Integer part: " + a);
        System.out.println("Float part: " + b);
    }
}