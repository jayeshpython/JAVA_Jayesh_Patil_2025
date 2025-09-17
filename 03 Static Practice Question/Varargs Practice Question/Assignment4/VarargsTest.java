

public class VarargsTest{

    static void multiply(String msg, int... num){

        System.out.println(msg);
        if(num.length == 0){
            System.out.println("No message passed");
            return;
        }

        int mul = 1;
        for(int n: num){
            mul = mul *n;
        }
        System.out.println("Product of numbers: " + mul);
    }

    public static void main(String[] args) {
        
        multiply("Hello", 6);
        multiply("How are you", 5,6,2);
        multiply("Were was you", 10 , 20);
    }
}