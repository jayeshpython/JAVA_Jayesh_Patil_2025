

/*

     *** Get Values in Sorted order ***
    - Write a method that accepts a HashMap and returns the values of the map in sorted orderas a list.
	
	- Method Details: 
			Method name: get Values
			Method Defination: Retrives and sort the values of a map
			Input: Hashmap <K, V>(where K is the key & V is value)
			Return type: List<V>
			Logic: Extract the values from the HashMap, sort them in the ascnding order & return them as a list.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

class Map{
    private HashMap<Integer, String> map = new HashMap<>();

    //accept values
    public void acceptValues(int key, String value){
        map.put(key, value);
        System.out.println(value + " added successfully");
    }
    
    //sorted map
    public List<String> getValues(){
        List<String> result = new ArrayList<>();

        for(String s: map.values()){
            result.add(s);
        }

        Collections.sort(result);
        return result;
    }
}

public class SortedHashMap{
    public static void main(String[] args) {
        
        Map m = new Map();
        m.acceptValues(2, "Rohan");
        m.acceptValues(5, "Sanjay");
        m.acceptValues(1, "Ketan");
        m.acceptValues(4, "Durvesh");
        m.acceptValues(3, "Vijay");

        List<String> result = new ArrayList<>();
        result = m.getValues();
        System.out.println("\nSorted map by values: " + result);
    }
}
