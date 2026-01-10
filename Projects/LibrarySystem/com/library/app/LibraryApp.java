package com.library.app;

import com.library.bean.*;
import com.library.service.LibraryManager;
import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LibraryManager manager = new LibraryManager(100);    // Max 100 items

        // Sample items
        Item b1 = new Book(101, "Java Programming", 3, "Pooja Kale");
        Item j1 = new JournalPaper(102, "AI Research", 2, "Dr. Patil", 2022);
        Item v1 = new Video(103, "Inception", 5, 148, "Christopher Nolan", "Sci-Fi", 2016);
        Item c1 = new CD(104, "Marathi Hits", 4, 60, "Ajay-Atul", "Music");

        // Adding sample items
        manager.addNewItem(b1);
        manager.addNewItem(j1);
        manager.addNewItem(v1);
        manager.addNewItem(c1);

        int choice;
        do {
            System.out.println("\n-------- Library Menu --------");
            System.out.println("1. Display items");
            System.out.println("2. Search item by ID");
            System.out.println("3. Add new item");
            System.out.println("4. Remove item by ID");
            System.out.println("5. Check out item");
            System.out.println("6. Check in item");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    manager.displayAllItem();
                    break;

                case 2:
                    System.out.print("Enter Item ID to search: ");
                    int searchId = sc.nextInt();
                    Item found = manager.searchItem(searchId);
                    if (found != null) found.print();
                    else System.out.println("Item not found!");
                    break;

                case 3:
                    System.out.println("Select item type: 1-Book, 2-Journal, 3-Video, 4-CD");
                    int type = sc.nextInt();
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter number of copies: ");
                    int copies = sc.nextInt();
                    sc.nextLine();

                    Item newItem = null;

                    switch (type) {
                        case 1:
                            System.out.print("Enter Author: ");
                            String author = sc.nextLine();
                            newItem = new Book(id, title, copies, author);
                            break;

                        case 2:
                            System.out.print("Enter Author: ");
                            String jAuthor = sc.nextLine();
                            System.out.print("Enter Year Published: ");
                            int year = sc.nextInt();
                            newItem = new JournalPaper(id, title, copies, jAuthor, year);
                            break;

                        case 3:
                            System.out.print("Enter Runtime (minutes): ");
                            int runtime = sc.nextInt();
                            sc.nextLine();
                            System.out.print("Enter Director: ");
                            String director = sc.nextLine();
                            System.out.print("Enter Genre: ");
                            String genre = sc.nextLine();
                            System.out.print("Enter Year Released: ");
                            int yrReleased = sc.nextInt();
                            newItem = new Video(id, title, copies, runtime, director, genre, yrReleased);
                            break;

                        case 4:
                            System.out.print("Enter Runtime (minutes): ");
                            int cdRuntime = sc.nextInt();
                            sc.nextLine();
                            System.out.print("Enter Artist: ");
                            String artist = sc.nextLine();
                            System.out.print("Enter Genre: ");
                            String cdGenre = sc.nextLine();
                            newItem = new CD(id, title, copies, cdRuntime, artist, cdGenre);
                            break;

                        default:
                            System.out.println("Invalid item type!");
                    }

                    if (newItem != null) manager.addNewItem(newItem);
                    break;

                case 4:
                    System.out.println("Enter Item ID to remove: ");
                    int removedId = sc.nextInt();
                    manager.removeItem(removedId);
                    break;

                case 5:
                    System.out.println("Enter Item Id to check out: ");
                    int checkoutId = sc.nextInt();
                    Item toCheckout = manager.searchItem(checkoutId);
                    if(toCheckout != null) toCheckout.checkOut();
                    else System.out.println("Item not found!");
                    break;

                case 6:
                    System.out.println("Enter Item ID to check in: ");
                    int checkInId = sc.nextInt();
                    Item toCheckin = manager.searchItem(checkInId);
                    if(toCheckin != null) toCheckin.checkIn();
                    else System.out.println("Itemnot found");
                    break;

                case 0:
                    System.out.println("Exiting.... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }while(choice != 0);
        sc.close();
    }
}
