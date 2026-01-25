
/*

	*** Find duplicate words in a string ***

   - Write a method that accepts a string and finds duplicate words along with their count.
   
   - Method Name: findDuplicates()
   - Input: String Sentence
   - Return Type: Map<String, Integer>
   - Logic: Split the string into words, count their occurences using a HashMap and return the result
*/

import java.util.*;

class DuplicateWords{
    
    public Map<String, Integer> findDuplicate(String sentence){

        Map<String, Integer> map = new HashMap<>();
        String[] words = sentence.split(" ");

        for(String s: words){

            map.put(s, map.getOrDefault(s, 0)+1);
        }
        return map;
    }
}

public class FindDuplicateWords{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();

        DuplicateWords words = new DuplicateWords();

        Map<String, Integer> map = new HashMap<>();
        map = words.findDuplicate(s);
        System.out.println("\nWords and thier occurence: ");
        System.out.println(map);
    }
}
