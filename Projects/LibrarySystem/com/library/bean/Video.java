
package com.library.bean;

public class Video extends MediaItem{
    private String director;
    private String genre;
    private int yearReleased;

    public Video(int id, String title, int numCopies, int runtime, String director, String genre, int yearReleased){
        super(id, title, numCopies, runtime);
        this.director = director;
        this.genre = genre;
        this.yearReleased = yearReleased;
    }

    @Override
    public void print(){
        System.out.println("[Video]" + toString() + " | Director: " + director + " | Genre: " + genre + " | Year Released: " + yearReleased);
    }
}