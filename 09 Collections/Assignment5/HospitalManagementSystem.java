
/* 
		*** Hospital Patient Management System ***
	1: Use an ArrayList to store the names of all registered patients in a hosspital.
    2: Use a linked list to manage the queue of patients waiting for consultation.

    Requirements: 
			
			- Register patients in the hospital and store them in the arrayList 
			- Patients arrive for consultation and are added to end of queue(LL)
			- Handle emergency cases by adding patients to the front of the queue.
			- Stimulate consultation by removing the 1st patient from the queue after their consultation.
			- Check if a particular is registered in the hospital.
			- After consultation check if any patient is still waiting in the queue
			- Display the current waiting queue and List of registered patiients.
			- Identify patients  who are registered but not have joined the queue.
*/

import java.util.*;

class HospitalManagement{

    private ArrayList<String> registeredPatients = new ArrayList<>();
    private LinkedList<String> consultationQueue = new LinkedList<>();

    public HospitalManagement() {
        registeredPatients.add("Saksham");
        registeredPatients.add("Sujata");
        registeredPatients.add("Samruddhi");
        registeredPatients.add("Prathamesh");
    }

    void registerPatient(String name) {
        registeredPatients.add(name);
        System.out.println("Patient registered successfully");
    }

    void addToConsultationQueue(String name) {
        consultationQueue.addLast( name);
    }

    void handleEmergency(String name) {
        consultationQueue.addFirst(name);
    }

    void completeConsultation() {
        if (!consultationQueue.isEmpty()) {
            String name = consultationQueue.removeFirst();
            System.out.println("Consultation done for: " + name);
        } else {
            System.out.println("No patients waiting");
        }
    }

    void checkRegistered(String name) {
        if (registeredPatients.contains(name))
            System.out.println(name + " is registered");
        else
            System.out.println(name + " is not registered");
    }

    void displayStatus() {
        System.out.println("\nRegistered Patients: " + registeredPatients);
        System.out.println("Consultation Queue: " + consultationQueue);
    }

    void registeredButNotInQueue(){

        System.out.println("\nRegistered but not in consultation queue:");
        boolean found = false;

        for (String p : registeredPatients){
            if (!consultationQueue.contains(p)){
                System.out.println(p);
                found = true;
            }
        }

        if (!found)
            System.out.println("All registered patients are in queue");
    }
}

public class HospitalManagementSystem{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HospitalManagement hospital = new HospitalManagement();
        int choice;

        do {
            System.out.println("\n*** Hospital Patient Management System ***");
            System.out.println("1. Register Patient");
            System.out.println("2. Add Patient to Consultation Queue");
            System.out.println("3. Handle Emergency");
            System.out.println("4. Complete Consultation");
            System.out.println("5. Check Registration");
            System.out.println("6. Display Status");
            System.out.println("7. Registered Patients Not in Queue");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter patient name: ");
                    hospital.registerPatient(sc.nextLine());
                }
                case 2 -> {
                    System.out.print("Enter patient name: ");
                    hospital.addToConsultationQueue(sc.nextLine());
                }
                case 3 -> {
                    System.out.print("Enter emergency patient name: ");
                    hospital.handleEmergency(sc.nextLine());
                }
                case 4 -> hospital.completeConsultation();

                case 5 -> {
                    System.out.print("Enter patient name: ");
                    hospital.checkRegistered(sc.nextLine());
                }
                case 6 -> hospital.displayStatus();

                case 7 -> hospital.registeredButNotInQueue();

                case 8 -> System.out.println("Exiting system...");

                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 8);
        sc.close();
    }
}
