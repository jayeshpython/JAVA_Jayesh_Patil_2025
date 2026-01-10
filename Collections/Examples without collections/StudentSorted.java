
import java.util.Scanner;

public class StudentSorted{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of student: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] names = new String[n];
        System.out.println("Enter names: ");

        for(int i = 0; i < n; i++){
            System.out.println("Names: " + (i+1));
            names[i] = sc.nextLine();
        }

        //Sort using simple bubble sort
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-i-1; j++){

                if(names[j].compareToIgnoreCase(names[j+1]) > 0){
                    String temp = names[j];
                    names[j] = names[j+1];
                    names[j+1] = temp;
                }
            }
        }
        System.out.println("Sort list of students: ");
        for(String name: names){
            System.out.println(name);
        }
        sc.close();
    }
}