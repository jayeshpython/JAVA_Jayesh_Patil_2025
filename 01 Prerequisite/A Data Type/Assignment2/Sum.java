
public class Sum{
    public static void main(String[] args) {
        int num = 567;
        int sum = 0, a = 0;

        while(num != 0){
            a = num %10;
            num = num /10;
            sum += a;
        }
        System.out.println("Sum: " + sum);
    }
}