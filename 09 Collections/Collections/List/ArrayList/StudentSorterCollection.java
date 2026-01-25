
import java.util.*;

public class StudentSorterCollection{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //Using ArrayList for Dynamic Resizing
        List<String> names = new ArrayList<>();
       
        System.out.println("Enter student names(type 'exit' to finish) : ");

        while (true) { 
            System.out.print("Names: ");
            String name = sc.nextLine();

            if(name.equalsIgnoreCase("Exit")){
                break;
            }
            names.add(name);      //Automatically resize
        }

        //Built in sorting from collections
        Collections.sort(names, String.CASE_INSENSITIVE_ORDER);
        
        System.out.println("\nSorted list of students: ");
        for(String name: names){
            System.out.println(name);
        }
        sc.close();
    }
}