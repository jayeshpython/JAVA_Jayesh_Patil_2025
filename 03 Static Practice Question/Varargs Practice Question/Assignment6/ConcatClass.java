
public class ConcatClass{

    static void concat(String... words){
        if(words.length == 0){
            System.out.println("No argument passed");
            return;
        }

        String value = words[0];
        for(int i = 1; i < words.length; i++){
            value += " " + words[i];
        }
        System.out.println(value);
    }

    public static void main(String[] args) {
        
        concat("Java", "is", "fun");
        concat("Jayesh", "Patil");
    }
}