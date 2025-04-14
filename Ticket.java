public class Ticket {
    String passengerName;
    String destination;
    String travelClass;
    double fare;

    // Basic ticket
    Ticket(String name, String destination) {
        this.passengerName = name;
        this.destination = destination;
        this.travelClass = "Economy";
        this.fare = 0;
    }

    // Ticket with class
    Ticket(String name, String destination, String travelClass) {
        this.passengerName = name;
        this.destination = destination;
        this.travelClass = travelClass;
        this.fare = 0;
    }

    // Full details
    Ticket(String name, String destination, String travelClass, double fare) {
        this.passengerName = name;
        this.destination = destination;
        this.travelClass = travelClass;
        this.fare = fare;
    }

    void displayTicket() {
        System.out.println("Passenger: " + passengerName);
        System.out.println("Destination: " + destination);
        System.out.println("Class: " + travelClass);
        System.out.println("Fare: " + fare);
        System.out.println("---------------------------------------------------------------");
    }
}
