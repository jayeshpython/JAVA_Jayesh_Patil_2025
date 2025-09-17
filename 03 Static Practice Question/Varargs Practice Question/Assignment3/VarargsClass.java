

public class VarargsClass{

    static void printName(String... name){
        if(name.length == 0)
            System.out.println("No arguments passed");
        else{
            System.out.println("Names passed: ");
            for(String n: name){
                System.out.println(n + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        printName();
        printName("Jayesh", "Sanket");
        printName("Harsh", "Aaditya", "Arpit", "Aniket", "Patle");
    }
}