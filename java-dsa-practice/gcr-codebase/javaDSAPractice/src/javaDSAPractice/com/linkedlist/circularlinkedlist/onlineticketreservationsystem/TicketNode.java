package javaDSAPractice.com.linkedlist.circularlinkedlist.onlineticketreservationsystem;

class TicketNode {
    int ticketId;
    String customerName;
    String movieName;
    String seatNumber;
    String bookingTime;

    TicketNode next;

    TicketNode(int id, String c, String m, String s, String t) {
        ticketId = id;
        customerName = c;
        movieName = m;
        seatNumber = s;
        bookingTime = t;
    }
}
