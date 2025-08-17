
import java.util.Scanner;

class Movie{
    String title;
    String actor;
    float rating;

    void acceptDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter movie title: ");
        title = sc.nextLine();
        System.out.println("Enter actor name: ");
        actor = sc.nextLine();
        System.out.println("Enter rating: ");
        rating = sc.nextFloat();
    }
    void displayDetails(){
        System.out.println("Title: " + title);
        System.out.println("Actor: " + actor);
        System.out.println("Rating: " + rating);
    }
}

public class MovieRating{
    public static void main(String[] args) {
        
        Movie[] m = new Movie[5];

        for(int i = 0; i < m.length; i++){
            m[i] = new Movie();
            m[i].acceptDetails();
        }

        System.out.println("Displaying with rating above 4: ");
        for(int i = 0; i < m.length; i++){
            if(m[i].rating > 4){
                m[i].displayDetails();
            }
        }
    }
}