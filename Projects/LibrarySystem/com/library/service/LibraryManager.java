
package com.library.service;

import com.library.bean.Item;

public class LibraryManager implements LibraryOperations {

    private Item[] libraryCollection;
    private int size;      // number of items currently in the library
    private int capacity;  // maximum capacity of the library

    // Constructor
    public LibraryManager(int capacity) {
        this.capacity = capacity;
        libraryCollection = new Item[capacity];
        size = 0;
    }

    @Override
    public void addNewItem(Item item) {
        if (size >= capacity) {  // fix
            System.out.println("Library is full! Cannot add more items");
            return;
        }
        libraryCollection[size++] = item;
        System.out.println("Item added successfully: " + item.getTitle());
    }

    @Override
    public void removeItem(int id) {
        boolean found = false;

        for (int i = 0; i < size; i++) {
            if (libraryCollection[i].getId() == id) {
                // shift all elements after i to left
                for (int j = i; j < size - 1; j++) {
                    libraryCollection[j] = libraryCollection[j + 1];
                }
            
                libraryCollection[size - 1] = null; // remove last duplicate element
                size--;
                found = true;
                System.out.println("Item removed successfully!");
                break;
            }
        }

        if (!found) {
            System.out.println("Item not found!");
        }
    }

    @Override
    public void displayAllItem() {
        if (size == 0) {
            System.out.println("No items in the library");
            return;
        }
        for (int i = 0; i < size; i++) {
            libraryCollection[i].print();
        }
    }

    @Override
    public Item searchItem(int id) {
        for (int i = 0; i < size; i++) {
            if (libraryCollection[i].getId() == id) {
                return libraryCollection[i];
            }
        }
        return null; // not found
    }
}
