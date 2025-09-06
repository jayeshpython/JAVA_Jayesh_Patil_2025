
import java.util.Scanner;

class TicketBooking{
    String passengerName;
    int passengerAge;
    String ticketType;

    void acceptDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter passenger name: ");
        passengerName = sc.nextLine();
        System.out.println("Enter passenger age: ");
        passengerAge = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter ticket type: ");
        ticketType = sc.nextLine();
    }

    void calculatePriceBasedOnType(){

        double price = 0;

        if(ticketType.equals("Normal"))
            price = 500;
        else if(ticketType.equals("VIP"))
            price = 1500;
        else {
            System.out.println("Invalid ticket typet.");
            price = 500;
        }

        calculatePriceBasedOnAge(price);
    }

    void calculatePriceBasedOnAge(double price){

        double discount;

        if(passengerAge < 18){
            discount = price * 0.2;
            price -= discount;
        }
        if(passengerAge > 60){
            discount = price * 0.4;
            price -= discount;
        }
        
        displayDetails(price);
    }

    void displayDetails(double price){
        System.out.println("Passenger name: " + passengerName);
        System.out.println("Passenger age: " + passengerAge);
        System.out.println("Ticket type: " + ticketType);
        System.out.println("Ticket price: " + price);
    }
}

public class TicketBookingClass{
    public static void main(String[] args) {
        
        TicketBooking tb = new TicketBooking();
        tb.acceptDetails();
        tb.calculatePriceBasedOnType();
    }
}