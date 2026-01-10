
package com.library.service;
import com.library.bean.Book;
import com.library.bean.Member;
import java.util.ArrayList;
import java.util.List;

public class TransactionService implements Transaction {
    private ArrayList<Book> booksList;
    private ArrayList<Member> memebersList;
    private int numOfMemebers;

    public TransactionService() {
        booksList = new ArrayList<>();
        memebersList = new ArrayList<>();
    }

    //Adding new books to library
    public void addNewBook(Book b){
        booksList.add(b);
        System.out.println("New book added successfully : " + b.getTitle());
    }

    public void addNewMembers(Member m){
        memebersList.add(m);
        System.out.println("Nem member added successfully : " + m.getMemberName());
    }

    //Search book
    public Book searchBook(int bookId){

        for(Book b : booksList){
            if(b.getBookId() == bookId){
                System.out.println("Book found: " + b);
                return b;
            }
        }
        System.out.println("Book not present in library");
        return null;
    }

    //Search book by name
    public Book searchBookByName(String bookName){

        for(Book b : booksList){
            if(b.getTitle().equals(bookName)){
                System.out.println("Book found: " + b);
                return b;
            }
        }
        System.out.println("Book not present in library");
        return null;
    }

    //Displaying all books in library
    public void displayAllBooks(){
        System.out.println("******* Books In Library ********");
        for(Book b : booksList){
            System.out.println(b.toString());
        }
    }

    //Displaying all members
    public void displayAllMembers(){
        System.out.println("******* Library Members *******");
        for(Member m : memebersList){
            System.out.println(m.toString());
        }
    }

    //To issues books
    public void issueBooks(int bookId, Member m){
        Book b = searchBook(bookId);

            if(b!=null && b.getNumCopies()==0)
            {
                b.setAvailabilityStatus(false);
                System.out.println("Book is not available...");
                return;
            }

            if(b!=null)
            {
                m.addBorrowedBooks(b.getTitle());
                b.setNumCopies(b.getNumCopies()-1);
                System.out.println("Book issued successfully");
                return;
            }
            else System.out.println("Book not available");
    }

    //To checkout books
    public void checkOut(String title, Member m){

        List<String> borrowedBooks = m.getBorrowedBooks();

        for(String bName :borrowedBooks){
            if(bName.equals(title)){
                borrowedBooks.remove(bName);
                Book b = searchBookByName(bName);
                b.setNumCopies(b.getNumCopies() +1);
                System.out.println("Book removed successfully");
                return;
            }
        }
        System.out.println("Book was never borrowed by " + m.getMemberName());
    }

    public Member searchMember(int memberId){
        for(Member m : memebersList){
            if(m.getMemberId() == memberId){
                System.out.println("Member found: " + m);
                return m;
            }
        }
        System.out.println("Member not found");
        return null;
    }

}

 