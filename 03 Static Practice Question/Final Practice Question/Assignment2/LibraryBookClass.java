

class LibraryBook{
    final int Book_ID;
    String title;

    LibraryBook(int id,String title){
        Book_ID = id;
        this.title = title;
    }

    void showDetails(){
        System.out.println("Book id: " + Book_ID);
        System.out.println("Title: " + title);
    }
}

public class LibraryBookClass{
    public static void main(String[] args) {
        
        LibraryBook l1 = new LibraryBook(101, "The Guide");
        LibraryBook l2 = new LibraryBook(111, "The Tourist of the London");

        l1.showDetails();
        System.out.println();
        l2.showDetails();
    }
}

