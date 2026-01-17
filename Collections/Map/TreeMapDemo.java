
import java.util.*;

public class TreeMapDemo{
    public static void main(String[] args) {
        
        TreeMap<String, Integer> ranking = new TreeMap<>();
        ranking.put("C++", 1);
        ranking.put("Java", 2);
        ranking.put("DSA", 3);
        ranking.put("Python", 5);

        System.out.println("Sorted Map: " + ranking);
        System.out.println("First Key: " + ranking.firstKey());
        System.out.println("Last Key: " + ranking.lastKey());
        System.out.println("Lower Key (Python): " + ranking.lowerKey("DSA"));
        System.out.println("Higher Key (Python): " + ranking.higherKey("DSA"));
        //The higherKey and lowerKey is according to alphabetical order
        //The output is based on alphabetical order

        ranking.remove("C++");
        System.out.println("After Remove: " + ranking);
        ranking.replace("Java", 5);
        System.out.println("After Replace: " + ranking);
        
    }
}