public class TicketDriver {
    public static void main(String[] args) {
        Ticket t1=new Ticket("Shreya", "Goa");
        Ticket t2=new Ticket("Sam", "Shirdi Water Park","Business");
        Ticket t3=new Ticket("Shreya", "Goa","FirstClass",1999.0);

        t1.displayTicket();
        t2.displayTicket();
        t3.displayTicket();

    }
}
