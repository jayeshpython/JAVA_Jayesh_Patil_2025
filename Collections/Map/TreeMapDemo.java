
import java.util.*;

public class TreeMapDemo{
    public static void main(String[] args) {
        
        TreeMap<String, Integer> ranking = new TreeMap<>();
        ranking.put("C++", 1);
        ranking.put("Java", 2);
        ranking.put("Python", 3);

        System.out.println("Sorted Map: " + ranking);
        System.out.println("First Key: " + ranking.firstKey());
        System.out.println("Last Key: " + ranking.lastKey());
        System.out.println("Lower Key (Python): " + ranking.lowerKey("Python"));
        System.out.println("Higher Key (Python): " + ranking.higherKey("Python"));

        ranking.remove("C++");
        System.out.println("After Remove: " + ranking);
        ranking.replace("Java", 5);
        System.out.println("After Replace: " + ranking);
        
    }
}