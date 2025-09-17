

class Library {
    
    static class Book {
        String title;
        String author;

        Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        void display() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
        }
    }
}

public class LibraryDemo {
    public static void main(String[] args) {
       
        Library.Book b1 = new Library.Book("Third Volume 1", "abc");
        Library.Book b2 = new Library.Book("Wings of Fire", "A.P.J. Abdul Kalam");

       
        b1.display();
        b2.display();
    }
}
