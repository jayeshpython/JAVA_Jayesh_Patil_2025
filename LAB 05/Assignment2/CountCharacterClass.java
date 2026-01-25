

/*
		*** Count Characters in an array ***
		
		- Write a method that excepts a character array and counts the frequency of each character.
		
		Method Details: 
			- Method Name: CountChars.
			- Method Description: Count occurences of each character in the array.
			
		Input: char[]arr
		Return type: Map<Character, Integer>
		Logic: Use a HashMap to store the characters as keys and their counts as values.
		
		- Additional challenges: 
					Extend this logic to handle case-insensitivity & remove special characters before counting 

*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class CharacterArray{
    private char[] arr;

    //Constructor
    public CharacterArray(char[] arr){
        this.arr = arr;
    }

    //method to count characters
    public Map<Character, Integer> countChars(){
        Map<Character, Integer> map = new HashMap<>();

        for(char ch: arr){

            //to ignore special characters
            if(!Character.isLetterOrDigit(ch)) continue;

            //to convert into lower case
            ch = Character.toLowerCase(ch);

            map.put(ch, map.getOrDefault(ch, 1) +1);
            /*
            if(map.containsKey(ch)){
                m.put(ch, m.get(ch) +1);
            }
            else{
                map.put(ch, 1);
            }
             */
        }
        return map;
    }
}

public class CountCharacterClass{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        char[] ch = s.toCharArray();
        CharacterArray arr = new CharacterArray(ch);

        Map<Character, Integer> map = arr.countChars();
        System.err.println("\nCharacters frequency: ");
        System.out.println(map);
    }
}


