
import java.util.Scanner;

public class WordFrequency{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");
        String[] unique = new String[words.length];
        int[] count = new int[words.length];
        int uniqueCount = 0;

        for(String word: words){

            int index = findWord(unique, uniqueCount, word);

            if(index == -1){
                unique[uniqueCount] = word;
                count[uniqueCount] = 1;
                uniqueCount++;
            }
            else
                count[index]++;
        }
    }

    System.out.println("\nWord Frequency: ");
    for(int i = 0; i < uniqueCount; i++){
        System.out.println(unique[i] + " -> " count[i]);
    }
    sc.close();
}