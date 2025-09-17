

public class SumClass{

    static int findSum(int... num){
        int sum = 0;
        if(num.length == 0)
            return 0;
        else{
            for(int n: num){
                sum += n;
            }
            return sum;
        }
    }
    public static void main(String[] args) {
        
        System.out.println("Sum of 0 numbers: " + findSum());
        System.out.println("Sum of 3 numbers: " + findSum(10, 20, 30));
        System.out.println("Sum of 5 numbers: " + findSum(1,2,3,4,5));
    }
}