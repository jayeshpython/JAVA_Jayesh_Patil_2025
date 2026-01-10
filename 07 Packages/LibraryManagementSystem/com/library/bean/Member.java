

package com.library.bean;

import java.util.ArrayList;
import java.util.List;

public class Member{
    private String memberName;
    private Membership membership;
    private int memberId;
    private List<String> borrowedBooks = new ArrayList<>();
    private int capacity = 5;
    private int size;     //Count of book borrowed

    public Member(String memberName, Membership membership, int memberId){
        this.memberName = memberName;
        this.membership = membership;
        this.memberId = memberId;
    }

    //Getters and Setters
    public String getMemberName(){ return memberName;}
    public void setMemberName(String memberName){
        this.memberName = memberName;
    }

    public int getMemberId(){ return memberId;}
    public void setMemberId(int memberId){
        this.memberId = memberId;
    }

    public Membership getMembership(){ return membership;}
    public void setMembership(Membership membership){
        this.membership = membership;
    }

    public List<String> getBorrowedBooks(){ return borrowedBooks;}
    
    @Override
    public String toString(){
        return "Member Name: " + memberName + " | ID: " + memberId + " | Membership: " + membership;
    }

    public void addBorrowedBooks(String title){
        if(size >= 5){
            System.out.println("Cannot issue more than 5 books");
            return;
        }else{
            borrowedBooks.add(title);
            size++;
        }
    }

    public void remove(String bName){
        borrowedBooks.remove(bName);
    }

} 