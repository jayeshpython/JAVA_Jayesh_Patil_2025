
public class AverageClass{

    static float  average(int... num){
        if(num.length == 0){
            System.out.println("No arguments passed");
            return 0;
        }
        float avg =0;
        for(int n: num){
            avg += n;
        }
        return avg/num.length;
    }

    public static void main(String[] args) {
        
        System.out.println("Average of 0 numbers: " + average());
        System.out.println("Average og 4 numbers: " + average(2,3,4,5));
        System.out.println("Average of 5 numbers: " + average(10,12,15,20,25));
    }
}