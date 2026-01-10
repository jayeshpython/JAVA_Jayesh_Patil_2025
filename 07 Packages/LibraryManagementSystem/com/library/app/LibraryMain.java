
package com.library.app;
import com.library.bean.Book;
import com.library.bean.Member;
import com.library.bean.Membership;
import com.library.service.TransactionService;
import java.util.*;

public class LibraryMain{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        TransactionService tranc = new TransactionService();

        //Simple Books
        Book b1 = new Book("October Junction", 101 ,"Divy Prakash Dubey", 3);
        Book b2 = new Book("Revolution 2020", 202, "Chetan Bhagat", 2);
        Book b3 = new Book("Srimant Yogi", 303, "Ranjit Desai", 5);
        Book b4 = new Book("Ikigai", 404, "Francesc Miralles", 1);
        Book b5 = new Book("Gunaho Ka Devta", 505, "Dharamvir Bharati", 2);

        System.out.println();

        Member m1 = new Member("Jayesh Patil", Membership.Student, 111);
        Member m2 = new Member("Nikhil Patil", Membership.Regular, 222);
        Member m3 = new Member("Parth Sharma", Membership.Premium, 333);
        Member m4 = new Member("Samruddhi Charhate", Membership.Student, 444);

        tranc.addNewBook(b1);
        tranc.addNewBook(b2);
        tranc.addNewBook(b3);
        tranc.addNewBook(b4);
        tranc.addNewBook(b5);

        tranc.addNewMembers(m1);
        tranc.addNewMembers(m2);
        tranc.addNewMembers(m3);
        tranc.addNewMembers(m4);

        int ch;
        do { 
            System.out.println("\n******* Library Management System ********");
            System.out.println("1. Display all books");
            System.out.println("2. Display all members");
            System.out.println("3. Add new book");
            System.out.println("4. Search book");
            System.out.println("5. To issue book from library");
            System.out.println("6. To check out");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            ch = sc.nextInt();

            System.out.println();

            switch(ch){
                case 1:
                    tranc.displayAllBooks();
                    break;


                case 2:
                    tranc.displayAllMembers();
                    break;

                case 3:
                    System.out.print("Enter book name: ");
                    sc.nextLine();
                    String bName = sc.nextLine();
                    System.out.print("Enter author name: ");
                    String bAuthor = sc.nextLine();
                    System.out.print("Enter book id: ");
                    int bId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter number copies: ");
                    int bCopies = sc.nextInt();
                    sc.nextLine();

                    Book newBook = new Book(bName, bId ,bAuthor, bCopies);
                    tranc.addNewBook(newBook);
                    break;

                case 4:
                    System.out.print("Enter book id to search: ");
                    int bSearchId = sc.nextInt();
                    sc.nextLine();
                    Book found = tranc.searchBook(bSearchId);
                    if (found != null) System.out.println("Book found");
                    else System.out.println("Book not found!");
                    break;

                case 5:
                    System.out.print("Enter member id to search: ");
                    int mIssueBook = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter book id to issue: ");
                    int bIssueBook = sc.nextInt();
                    sc.nextLine();

                    Book toCheckIn = tranc.searchBook(bIssueBook);
                    Member toCheckIdM = tranc.searchMember(mIssueBook);
                    if(toCheckIn != null) {
                        tranc.issueBooks(bIssueBook, toCheckIdM);
                    }
                    else{
                        System.out.println("Book not found");
                    }
                    break;

                case 6:
                    System.out.print("Enter member id: ");
                    int mCheckOut = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter book id to check out: ");
                    int bCheckOut = sc.nextInt();
                    System.out.print("Enter book title to check out: ");
                    String checkOutBook = sc.next();

                    Book toCheckOutB = tranc.searchBook(bCheckOut);
                    Member toCheckOutM = tranc.searchMember(mCheckOut);

                    if(toCheckOutB != null) {
                        tranc.checkOut(checkOutBook, toCheckOutM);
                    }
                    else{
                        System.out.println("Book not found");
                    }
                    break;

                case 7:
                    System.out.println("Exiting.... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");

            }

        } while (ch!=7);
    }
}