

class LibraryBook{
    private String bookName;
    private String author;
    private int bookId = 501;
    private static int nextId = 501;
    private static int bookCount = 0;

    public LibraryBook(String bookName, String author){
        this.bookName = bookName;
        this.author = author;
        this.bookId = nextId++;
        bookCount++;
    }

    public void dispaly(){
        System.out.println("Book name: " + bookName);
        System.out.println("Author name: " + author);
        System.out.println("Book id: " + bookId);
    }

    public static void dispalyTotalBooks(){
        System.out.println("Total number of books: " + bookCount);
    }
}

public class LibraryBookClass{
    public static void main(String[] args) {
        
        LibraryBook lb1 = new LibraryBook("Alchemist","Paulo Coelho" );
        LibraryBook lb2 = new LibraryBook("Shrimant Yogi", "Shivaji Sawant");
        LibraryBook lb3 = new LibraryBook("Rooh", "Manav Kaul");

        lb1.dispaly();
        System.out.println();
        lb2.dispaly();
        System.out.println();
        lb3.dispaly();
        System.out.println();
        LibraryBook.dispalyTotalBooks();
    }
}