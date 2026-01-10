
package com.library.bean;

public class JournalPaper extends WrittenItem{

    private int yearPublished;

    public JournalPaper(int id, String title, int numCopies, String author, int yearPublished){
        super(id, title, numCopies, title);
        this.yearPublished = yearPublished;
    }

    public int getYearPublished() { return yearPublished; }
    public void setYearPublished(int yearPublished){
        this.yearPublished = yearPublished;
    }

    @Override
    public void print(){
        System.out.println("[Journal Paper]" + toString() + " | Year: " + yearPublished);
    }
}