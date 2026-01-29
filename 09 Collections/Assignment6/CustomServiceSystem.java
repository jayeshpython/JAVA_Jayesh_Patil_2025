
/*

		*** Implement a custom survice system using a queue. ***
    
	Requirements:
	1. Create a Queue to manage customer request (names of customer)
	2. Perform the following operations using Queue methods: 
		- Add Customers: add 5 customers to the queue using offer(), and add()
		- Check which customer is currently in front of the queue [ peek()]
        - Remove customers : Serve the 1st two customers using poll() and remove().
        - Check queue status: Vrify the queue using size() & check the queue is empty using isEmpty()
        - Clear the queue: remove all remaining customers using clear() and isEmppty()
        Display appropriate message at each steps.		


*/

import java.util.*;

class CustomService {
    ArrayDeque<String> customer = new ArrayDeque<>();

    public CustomService() {
        customer.offer("Jayesh");
        customer.offer("Sanket");
        customer.offer("Rupesh");
        customer.add("Saksham");
        customer.add("Harsh");

        System.out.println("Initial customers added to queue");
    }

    public void addCustomer(String name) {
        customer.offer(name);
        System.out.println("Customer added successfully");
    }

    public void displayAllCustomers() {
        System.out.println("Customers in queue: " + customer);
    }

    public void findPeekCustomer() {
        System.out.println("Customer at front: " + customer.peek());
    }

    public void removeCustomers() {
        System.out.println("Serving customer using poll(): " + customer.poll());
        System.out.println("Serving customer using remove(): " + customer.remove());
    }

    public void queueStatus() {
        System.out.println("Queue size: " + customer.size());
        System.out.println("Is queue empty? " + customer.isEmpty());
    }

    public void clearQueue() {
        customer.clear();
        System.out.println("Queue cleared");
        System.out.println("Is queue empty after clear? " + customer.isEmpty());
    }
}

public class CustomServiceSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CustomService service = new CustomService();
        int choice;

        do {
            System.out.println("\n******** CUSTOMER SERVICE MENU ********");
            System.out.println("1. Add Customer");
            System.out.println("2. Display Customers");
            System.out.println("3. Peek Customer");
            System.out.println("4. Serve first two customers");
            System.out.println("5. Queue Status");
            System.out.println("6. Clear Queue");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1 -> {
                    System.out.print("Enter customer name: ");
                    String name = sc.nextLine();
                    service.addCustomer(name);
                }
                case 2 -> service.displayAllCustomers();
                case 3 -> service.findPeekCustomer();
                case 4 -> service.removeCustomers();
                case 5 -> service.queueStatus();
                case 6 -> service.clearQueue();
                case 7 -> System.out.println("Exiting system...");
                default -> System.out.println("Invalid choice");
            }

        } while(choice != 7);

        sc.close();
    }
}
