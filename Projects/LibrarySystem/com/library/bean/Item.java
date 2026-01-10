
package com.library.bean;

public abstract class Item {
    private int id;
    private String title;
    private int numCopies;

    public Item(int id, String title, int numCopies) {
        this.id = id;
        this.title = title;
        this.numCopies = numCopies;
    }

    // Getters and setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public int getNumCopies() { return numCopies; }
    public void setNumCopies(int numCopies) { this.numCopies = numCopies; }

    public void checkIn() {
        numCopies++;
        System.out.println(title + " checked in successfully. Total copies: " + numCopies);
    }

    public void checkOut() {
        if (numCopies > 0) {
            numCopies--;
            System.out.println(title + " checked out successfully. Remaining copies: " + numCopies);
        } else {
            System.out.println(title + " is not available");
        }
    }

    public void addItem(int num) {
        numCopies += num;
        System.out.println(num + " new copies added of " + title + ". Total: " + numCopies);
    }

    // equals() - compare based on ID
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true; // same reference

        if (obj == null || getClass() != obj.getClass())
            return false; // different type

        Item item = (Item) obj;
        return id == item.id; // same id means same item
        //uses getClass() method strict only object of same constructor type gets compare, would be alternative for
    }

    // toString() - object string representation
    @Override
    public String toString() {
        return "ID: " + id + " | Title: " + title + " | Copies: " + numCopies;
    }

    // Abstract method
    public abstract void print();
}
