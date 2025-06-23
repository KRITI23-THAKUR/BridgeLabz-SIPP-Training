import java.util.*;

class MovieTicket {
 // Attributes

    private String movieName;
    private int seatNumber;
    private double price;

    public void bookTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public void displayTicket() {
        System.out.println("Ticket Details:");
        System.out.println("Movie: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: ₹" + price);
    }
}
 // Main method
public class MovieData {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter movie name: ");
        String movie = inp.nextLine();

        System.out.print("Enter seat number: ");
        int seat = inp.nextInt();

        System.out.print("Enter ticket price: ");
        double price = inp.nextDouble();

        MovieTicket ticket = new MovieTicket();
        ticket.bookTicket(movie, seat, price);
        ticket.displayTicket();

        inp.close();
    }
}
