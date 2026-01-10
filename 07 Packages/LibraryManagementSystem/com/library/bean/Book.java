
/*
*** Library Management System ***
		
Packages : 
    - Library.book
	- Library.members
	- Library.transaction
	
-> In the book package create a class Book with following details: 
		- Title, 
		- Author 
		- availabilityStatus.

-> In the members package create a class Member with following details: 
		- name
		- membership
		- record of borrowed books
		
-> In the transactions package design class Transaction to handle book lending and returns. 

-> In the Library.main package create Library class to : 
		- Register book in library.
		- Register members
		- Allow members to borrow or return book updating availability status of books and the members borrowed Book Lists

*/

package com.library.bean;

public class Book{
    private String title;
	private int bookId;
    private String author;
    private int numCopies;
    private boolean availabilityStatus;

	//Constructor
    public Book(String title, int bookId,String author, int numCopies ){
        this.title = title;
		this.bookId = bookId;
        this.author = author;
		this.numCopies = numCopies;
        availabilityStatus = true;
    }

	//Getters and setters
	public String getTitle() { return title; }
	public void setTitle(String title){
		this.title = title;
	}

	public int getBookId() {return bookId;}
	public void setBookId(int bookId){
		this.bookId = bookId;
	}

	public String getAuthor() { return author;}
	public void setAuthor(String author){
		this.author = author;
	}

	public int getNumCopies(){ return numCopies;}
	public void setNumCopies(int numCopies){
		this.numCopies = numCopies;
	}

	public boolean  getAvailabilityStatus() { return availabilityStatus;}
	public void setAvailabilityStatus(boolean availabilityStatus){
		this.availabilityStatus = availabilityStatus;
	}

	@Override
	public String toString(){
		return "Title: " + title + " | ID: " + bookId+ " | Author: " + author + " | Copies: " + numCopies + " | Availability Status: " + availabilityStatus;
	}

}

