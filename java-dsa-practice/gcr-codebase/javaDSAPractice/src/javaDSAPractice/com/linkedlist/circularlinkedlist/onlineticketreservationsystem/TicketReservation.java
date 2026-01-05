package javaDSAPractice.com.linkedlist.circularlinkedlist.onlineticketreservationsystem;

class TicketReservation {

    private TicketNode head = null;

    // Add ticket at end
    void addTicket(int id, String c, String m, String s, String t) {

        TicketNode n = new TicketNode(id, c, m, s, t);

        if (head == null) {
            head = n;
            n.next = head;
            return;
        }

        TicketNode temp = head;
        while (temp.next != head)
            temp = temp.next;

        temp.next = n;
        n.next = head;
    }

    // Remove ticket by ID
    void removeTicket(int id) {

        if (head == null) {
            System.out.println("No tickets booked");
            return;
        }

        TicketNode curr = head, prev = null;

        do {
            if (curr.ticketId == id) {

                if (curr == head) {
                    TicketNode last = head;
                    while (last.next != head)
                        last = last.next;

                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = curr.next;
                }
                System.out.println("Ticket cancelled");
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);

        System.out.println("Ticket not found");
    }

    // Display all tickets
    void displayTickets() {

        if (head == null) {
            System.out.println("No tickets");
            return;
        }

        TicketNode temp = head;
        do {
            System.out.println(temp.ticketId + " | " +
                               temp.customerName + " | " +
                               temp.movieName + " | Seat " +
                               temp.seatNumber + " | " +
                               temp.bookingTime);
            temp = temp.next;
        } while (temp != head);
    }

    // Search ticket
    void search(String key) {

        if (head == null) return;

        TicketNode temp = head;
        boolean found = false;

        do {
            if (temp.customerName.equalsIgnoreCase(key) ||
                temp.movieName.equalsIgnoreCase(key)) {

                System.out.println(temp.ticketId + " | " +
                                   temp.customerName + " | " +
                                   temp.movieName);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found)
            System.out.println("No matching ticket found");
    }

    // Count tickets
    void countTickets() {

        if (head == null) {
            System.out.println("Total Tickets: 0");
            return;
        }

        int count = 0;
        TicketNode temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);

        System.out.println("Total Tickets: " + count);
    }
}
