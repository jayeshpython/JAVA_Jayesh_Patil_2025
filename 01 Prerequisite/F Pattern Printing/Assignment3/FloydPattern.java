
public class FloydPattern{
    public static void main(String[] args){

        for(int i = 1, j = 1; i <= 5; i++){
            for(int k = 1; k <= i; k++,j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}