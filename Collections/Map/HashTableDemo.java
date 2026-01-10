
import java.util.*;

public class HashTableDemo{
    public static void main(String[] args) {
        
        Hashtable<Integer, String> table = new Hashtable<>();
        table.put(1, "OS");
        table.put(2, "CNS");
        table.put(3, "DBMS");

        System.out.println("Hash Table: " + table);
        System.out.println("Get 2: " + table.get(2));
        System.out.println("Contains Key 3: " + table.containsKey(3));
        System.out.println("Contains value DBMS ? : " + table.containsValue("DBMS"));

        table.remove(1);
        System.out.println("After Remove: " + table);
        System.out.println("Keys: " + table.keySet());
        System.out.println("Entries: " + table.entrySet());

    }
}