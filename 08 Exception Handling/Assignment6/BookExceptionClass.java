
/*

    - Create a java program to manage book borrowing in a Library. 
	- Create a custom exception class
	        BookNotAvailableExceeption:
					this exception should be thrown if the requested book is not available. 
	- The program should have a method 
			borrowBook(String bookName):	
            Accept the name of the book (the user wants to borrow )	checks if the book is available (from a predefined list o books)
	- Throws the BookNotAvailableException if the book not avaialable.
    - Use try catch to handle the exception in the main method.
	- Use throws in the borrowBook() method declaration to declare custom exception.
	- If no exception occured print " You have successfully borrowed "

*/

import java.util.*;

class Book{
    private List<String> bookCollections = new ArrayList<>();

    public Book(){
        bookCollections.add("The kit Runner");
        bookCollections.add("Musafir Cafe");
        bookCollections.add("Revolution 2020");
        bookCollections.add("The Silent Patient");
        bookCollections.add("The Monk Who Sold His Ferari");
    }

    public void borrowBook(String name) throws BookNotAvailableException{
        boolean isAvailable = bookCollections.contains(name);

        if(!isAvailable){
            throw new BookNotAvailableException("The " + name + " is not available");
        }
        else{
            System.out.println("The " + name + " is available");
        }
    }
}

public class BookExceptionClass{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Book book = new Book();

        try {
            System.out.print("Enter book name to borrow: ");
            String bookName = sc.nextLine();

            book.borrowBook(bookName);

        } catch (BookNotAvailableException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

