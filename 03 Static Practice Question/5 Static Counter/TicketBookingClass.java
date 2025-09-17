

class TicketBooking{
    private static int bookingCounter = 1000;
    private int bookingId;

    public TicketBooking(){
        bookingId = generateBookingId();
    }

    private static int generateBookingId(){
        do { 
            bookingCounter++;
        } while (bookingCounter % 5 == 0);
        return bookingCounter;
    }

    public int getBookingId(){
        return bookingId;
    }
}

public class TicketBookingClass{
    public static void main(String[] args) {
        
        System.out.println("Booking ID generated: ");
        for (int i = 0; i < 10; i++){
            TicketBooking booking = new TicketBooking();
            System.out.println(booking.getBookingId());
        }
    }
}