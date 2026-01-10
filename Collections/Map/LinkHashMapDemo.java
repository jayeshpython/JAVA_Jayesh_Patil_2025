
import java.util.*;

class LinkHashMapDemo{
    public static void main(String[] args) {
        
        LinkedHashMap<Integer, String> courseOrder = new LinkedHashMap<>();
        courseOrder.put(1, "HTML");
        courseOrder.put(2, "CSS");
        courseOrder.put(3, "JavaScript");
        courseOrder.put(4, "React JS");

        System.out.println("Insertion Order: " + courseOrder);

        courseOrder.remove(2);
        System.out.println("After Remove: " + courseOrder);
        System.out.println("Keys: " + courseOrder.keySet());
        System.out.println("Values: " + courseOrder.values());
        System.out.println("Entries: " + courseOrder.entrySet());

    }
}