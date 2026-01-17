
/*

   - You are designing a system to manage a Library. The Library has following   requirements: 
   
   1) Store a list of books available in the library. Retrive/Keep track of borrowed books.
   
   2) Allow a searching book by its title write a program to manage the system.

*/
import java.util.*;

class LibrarySystem{
    private HashSet<String> availableBooks = new HashSet<>();
    private HashSet<String> borrowedBooks = new HashSet<>();

    LibrarySystem(){
        availableBooks.add("The Kite Runner");
        availableBooks.add("Masala Chai");
        availableBooks.add("The Arranged Murder");
        availableBooks.add("A Thousand Splendid Suns");
    }

    public void addBooks(String bookName){
        availableBooks.add(bookName);
    }

    public void borrowBook(String bookName){
        if(searchBook(bookName)){
            availableBooks.remove(bookName);
            borrowedBooks.add(bookName);
            System.out.println("Book borrowed successfully");
            return;
        }
    }

    public boolean searchBook(String bookName){
        for(String book: availableBooks){
            if(book.equals(bookName)){
                System.out.println("The book is available");
                return true;
            }
        }
       
        System.out.println("Book is not available");
        return false;       
    }

    public void displayBooks(){
        System.out.println();
        System.out.println("Books in library");
        for(String book: availableBooks){
            System.out.println(book);
        }
    }
}

public class LibraryManagement{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        LibrarySystem ls = new LibrarySystem();
        int ch;
        String bookName;

        do {
            System.out.println(); 
            System.out.println("****** Library Management System *******");
            System.out.println("1. Add Books");
            System.out.println("2. Search Book");
            System.out.println("3. Borrow Book");
            System.out.println("4. Display Books");
            System.out.println("5. Exiting...");

            System.out.print("Enter choice: ");
            ch = sc.nextInt();
            sc.nextLine();

            switch(ch){
                case 1:
                    System.out.print("Enter book name to add: ");
                    bookName = sc.nextLine();
                    ls.addBooks(bookName);
                    break;

                case 2:
                    System.out.print("Enter book to search: ");
                    bookName = sc.nextLine();
                    ls.searchBook(bookName);
                    break;

                case 3:
                    System.out.print("Enter book name to borrow: ");
                    bookName = sc.nextLine();
                    ls.borrowBook(bookName);
                    break;

                case 4:
                    ls.displayBooks();
                    break;

                default:
                    System.out.println("Invalid choice");

            }
        } while (ch != 5);
    }
}

