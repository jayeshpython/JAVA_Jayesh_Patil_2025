
import java.util.*;

class ArrayListToArray{
    public static void main(String[] args) {
        
        ArrayList<Integer> num = new ArrayList<>();

        //Add elements(Autoboxing from int to integer)um.add(3);
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        System.out.println("List: " + num);

        //Convert to Array
        Integer[] arr = new Integer[num.size()];
        arr = num.toArray(arr);

        //Process the array
        int sum = 0;

        for(int i: arr){
            sum += i;
        }

        System.out.println("Sum: " + sum);
    }
}