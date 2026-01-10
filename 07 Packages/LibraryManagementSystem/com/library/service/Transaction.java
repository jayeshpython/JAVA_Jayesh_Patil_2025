
package com.library.service;
import com.library.bean.*;

public interface Transaction{
    void addNewBook(Book b);
    void addNewMembers(Member m);
    Book searchBook(int bookId);
    Book searchBookByName(String bookName);
    void displayAllBooks();
    void displayAllMembers();
    void issueBooks(int bookId, Member m);
    void checkOut(String title, Member m);
}