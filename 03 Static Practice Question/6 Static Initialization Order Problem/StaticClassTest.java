

class StaticClass{
    static int a = 10;

    static{
        System.out.println("Static1 block: " + a);
        a = 20;
    }
    static{
        System.out.println("Static2 block: " + a);
    }
    public static void printStatic(){
        System.out.println("Static method value: " + a);
    }
}

public class StaticClassTest{
    public static void main(String[] args) {
        StaticClass.printStatic();
    }
}