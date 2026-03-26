
/*Write a Java program that displays the number of characters, lines and words in a text?
 */

import java.util.*;
public class CharacterStringClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int characters = 0;
        int words = 0;
        int lines = 0;

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        for(int i = 0; i < text.length() ; i++){
            char ch = text.charAt(i);

            if(ch !=  ' ' || ch != '\n'){
                characters++;
            }
        }
        System.out.println("No of characters: " + characters);

        String[] word = text.trim().split(" ");
        System.out.println("No of words in text: " + word.length);

        String[] line = text.trim().split("\n");
        System.out.println("Number of lines in word: " + line.length);
    }
}
