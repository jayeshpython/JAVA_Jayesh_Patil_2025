
public class ContinueBreak{
    public static void main(String[] args) {
        int num = 1;

        while(num <= 50){
            if(num % 5 == 0){
                num++;
                continue;
            }
            else if(num >= 30)
                break;

            System.out.println("Number: " + num);
            num++;
        }
    }
}