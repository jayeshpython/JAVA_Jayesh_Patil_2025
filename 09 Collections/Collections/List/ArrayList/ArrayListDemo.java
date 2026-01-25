
import java.util.*;

class ArrayListDemo{
    public static void main(String[] args) {
        
        //Create object or empty list of strings
        ArrayList<String> list = new ArrayList<>();

        System.out.println("Initial Size: " + list.size());

        //Add elements
        list.add("C");
        list.add("I");
        list.add("P");
        list.add("H");
        list.add("E");
        list.add("R");

        //Insert at index 2
        list.add(2,"C2");

        System.out.println("After additon: " + list);
        System.out.println("Size after addition: " + list.size());

        //Remove elements
        //Remove by value
        list.remove("C2");

        //Remove by index
        list.remove(5);

        System.out.println("After deletion: " + list);
        System.out.println("Size after deletion: " + list.size());

    }
}

