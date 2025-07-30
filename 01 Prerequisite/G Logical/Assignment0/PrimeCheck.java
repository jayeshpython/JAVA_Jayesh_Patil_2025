
public class PrimeCheck{
    public static void main(String[] args) {
        
        int n = 29;
        boolean isPream = true;

        for(int i = 2; i <= n/2; i++){
            if(n % i ==0){
                isPream = false;
                break;
            }
        }
        System.out.println(isPream ? "Prime" : "Not Prime");
    }
}