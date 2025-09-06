

class Book{
    String bookName;
    String author;
    double price;

    Book(){
        bookName = "October Junction";
        author = "Divya Prakash Dube";
        price = 250;
    }

    Book(String bookName, String author, double price) {
        this.bookName = bookName;
        this.author = author;
        this.price = price;
    }
    
    Book(String bookName, String author){
        this.bookName = bookName;
        this.author = author;
        price = 300;
    }
    
    void displayDetails(){
        System.out.println("Book Name: " + bookName);
        System.out.println("Author Name: " + author);
        System.out.println("Book Price: " + price);
    }
}

public class BookTest{
    public static void main(String[] args) {
        
        Book b1 = new Book();
        Book b2 = new Book("Alchemist", "Paulo Coelho", 350);
        Book b3 = new Book("Mrutyunjay", "Shivaji Sawant");

        b1.displayDetails();
        System.out.println();
        b2.displayDetails();
        System.out.println();
        b3.displayDetails();
    }
}