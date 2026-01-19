/*
		*** Manage the Grocery store billing system using dequeue. ***
		
	1. Join the queue at either the front or the rear. 
	2. Be served from front of the queue
	3. Peek() at who is at next in the line front or rear.
	4. Leave the queue from either the front or the rear without being served.
	5. At the end of the day, the remaining customers in the queue in the order they are standing. 

*/

import java.util.*;

class Grocery{
    private ArrayDeque<String> customers = new ArrayDeque<>();

    public Grocery(){
        customers.offer("Parth Sharma");
        customers.offer("Sanjay Mewada");
        customers.offer("Sohail Khan");
        customers.offer("Aaditya Kumar");
    }

    void joinQueueAtFront(String name){
        customers.offerFirst(name);
        System.out.println("customer " + name + " added suceessfully at he first of the queue");
    }

    void joinQueueAtLast(String name){
        customers.offerLast(name);
        System.out.println("customer " + name + " added successfully at the end of queue");
    }

    public void serviceCustomer(){
        if(!customers.isEmpty()){
            System.out.println("Service: " + customers.poll());
            System.out.println("Remaining queue: " + customers);
        }
        else{
            System.out.println("No customer to be served. Queue is empty");
        }
    }

    public void peekAtFront(){
        if(!customers.isEmpty()){
            System.out.println("Customer at front: " + customers.peekFirst());
        }
        else{
            System.out.println("Queue is empty");
        }
    }

    public void peekAtLast(){
        if(!customers.isEmpty()){
            System.out.println("Customer at last: " + customers.peekLast());
        }
        else{
            System.out.println("Queue is empty");
        }
    }

    public void removeAtFirst(){
        if(!customers.isEmpty()){
            System.out.println("Removed customer: " + customers.pollFirst());
        }
        else{
            System.out.println("Queue is empty");
        }
    }

    public void removeAtLast(){
        if(!customers.isEmpty()){
            System.out.println("Removed customer: " + customers.pollLast());
        }
        else{
            System.out.println("Queue is empty");
        }
    }

    public void displayQueue(){
        if(!customers.isEmpty()){
            System.out.println("Customer queue: " + customers);
        }
        else {
            System.out.println("Queue is empty");
        }
    }
}

public class GroceryBillingSystem{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Grocery grocery = new Grocery();
        int ch;

        do { 
            System.out.println("\n****** Grocery Billing System ******");
            System.out.println("1. Add customer at front");
            System.out.println("2. Add customer at last");
            System.out.println("3. Serve customer");
            System.out.println("4. Peek at front");
            System.out.println("5. Peek at last");
            System.out.println("6. Remove customer from front");
            System.out.println("7. Remove customer from last");
            System.out.println("8. Display queue");
            System.out.println("9. Exit");

            System.out.print("\nEnter choice: ");
            ch = sc.nextInt();
            sc.nextLine();
            String name;

            switch(ch){
                case 1 ->{
                    System.out.print("Enter customer name: ");
                    name = sc.nextLine();
                    grocery.joinQueueAtFront(name);
                }
                case 2 ->{
                    System.out.print("Enter customer name: ");
                    name = sc.nextLine();
                    grocery.joinQueueAtLast(name);
                }
                case 3 -> grocery.serviceCustomer();
                case 4 -> grocery.peekAtFront();
                case 5 -> grocery.peekAtLast();
                case 6 -> grocery.removeAtFirst();
                case 7 -> grocery.removeAtLast();
                case 8 -> grocery.displayQueue();
        
                default -> System.out.println("Invalid choice");
            }
        } while (ch != 9);
        sc.close();
    }
}

