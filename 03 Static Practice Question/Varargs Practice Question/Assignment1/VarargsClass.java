

public class VarargsClass{

    static void display(int... num){
        if(num.length == 0)
            System.out.println("No argument passed");
        else{
            System.out.println("Numbers: ");
            for(int n: num){
                System.out.println(n + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        display(10);
        display(1,2,3,45,5);
        display();
    }

}