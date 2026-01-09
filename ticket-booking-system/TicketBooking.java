public class TicketBooking {

    public static void main(String[] args) {

        int totalSeats = 100;
        int requestedSeats = 4;

        if (requestedSeats > totalSeats) {
            System.out.println("Insufficient seats available");
        } else if (requestedSeats > 5) {
            System.out.println("Cannot book more than 5 tickets");
        } else {
            totalSeats -= requestedSeats;
            System.out.println("Booking confirmed. Remaining seats: " + totalSeats);
        }
    }
}
