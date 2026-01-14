package com.dayone.ambulanceroute;

public class AmbulanceRoute {

    private UnitNode head = null;

    // Add hospital unit
    void addUnit(String name, boolean available) {
        UnitNode newNode = new UnitNode(name, available);

        if (head == null) {
            head = newNode;
            return;
        }

        UnitNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
    }

    // Find nearest available unit
    void findAvailableUnit() {
        if (head == null) {
            System.out.println("No hospital units available.");
            return;
        }

        UnitNode temp = head;
        do {
            if (temp.available) {
                System.out.println("Redirecting patient to: " + temp.unitName);
                return;
            }
            temp = temp.next;
        } while (temp != head);

        System.out.println("No units currently available!");
    }

    // Remove unit under maintenance
    void removeUnit(String unitName) {
        if (head == null) {
            System.out.println("No units to remove.");
            return;
        }

        UnitNode curr = head;
        UnitNode prev = null;

        do {
            if (curr.unitName.equalsIgnoreCase(unitName)) {

                // Only one node
                if (curr == head && curr.next == head) {
                    head = null;
                    System.out.println("Unit removed: " + unitName);
                    return;
                }

                // Removing head
                if (curr == head) {
                    UnitNode last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = curr.next;
                }

                System.out.println("Unit removed: " + unitName);
                return;
            }

            prev = curr;
            curr = curr.next;

        } while (curr != head);

        System.out.println("Unit not found.");
    }

    // Display all units
    void showUnits() {
        if (head == null) {
            System.out.println("No hospital units present.");
            return;
        }

        UnitNode temp = head;
        do {
            System.out.println(temp.unitName + " | Available: " + temp.available);
            temp = temp.next;
        } while (temp != head);
    }
}

