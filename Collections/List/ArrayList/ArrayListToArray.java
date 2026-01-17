
import java.util.*;

class ArrayListToArray{
    public static void main(String[] args) {
        
        ArrayList<Integer> num = new ArrayList<>();

        //Add elements(Autoboxing from int to Integer class)um.add(3);
        //In ArrayList every element acts as a object
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        //Here every element is object
        System.out.println("List: " + num);

        //Convert to Array
        Integer[] arr = new Integer[num.size()];
        arr = num.toArray(arr);
        /*ArrayList cannot store int
        It stores objects only
        So it uses Integer (wrapper class) instead of int

        Ith aapan ArrayList interger type cha banavla mhanun aapan tyla Integer[] array madhe store kartoy
         */

        //Process the array
        int sum = 0;

        for(int i: arr){
            sum += i;
        }

        System.out.println("Sum: " + sum);
    }
}