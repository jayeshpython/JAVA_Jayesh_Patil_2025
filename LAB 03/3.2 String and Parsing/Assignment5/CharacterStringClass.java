
/*Write a Java program that displays the number of characters, lines and words in a text?
 */

import java.util.*;
public class CharacterStringClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int characters = 0;
        int words = 0;
        int lines = 0;

        System.out.println("Enter text :");
        String text = sc.nextLine();

        String[] word = text.trim().split(" ");
        System.out.println("No of words in text: " + word.length);
    }
}
