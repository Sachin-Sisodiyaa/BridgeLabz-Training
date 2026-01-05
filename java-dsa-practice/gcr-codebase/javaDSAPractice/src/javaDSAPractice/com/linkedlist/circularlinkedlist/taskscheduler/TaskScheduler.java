package javaDSAPractice.com.linkedlist.circularlinkedlist.taskscheduler;

class TaskScheduler {

    private TaskNode head = null;

    // Add task at end
    void addAtEnd(int id, String name, int p, String d) {
        TaskNode n = new TaskNode(id, name, p, d);

        if (head == null) {
            head = n;
            n.next = head;
            return;
        }

        TaskNode temp = head;
        while (temp.next != head)
            temp = temp.next;

        temp.next = n;
        n.next = head;
    }

    // Remove task by ID
    void removeById(int id) {
        if (head == null) {
            System.out.println("List empty");
            return;
        }

        TaskNode curr = head, prev = null;

        do {
            if (curr.taskId == id) {

                if (curr == head) {
                    TaskNode last = head;
                    while (last.next != head)
                        last = last.next;

                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = curr.next;
                }
                System.out.println("Task removed");
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);

        System.out.println("Task not found");
    }

    // View current task and move to next
    void viewAndMoveNext() {
        if (head == null) {
            System.out.println("No tasks");
            return;
        }

        System.out.println(head.taskId + " | " + head.taskName +
                           " | Priority " + head.priority +
                           " | Due " + head.dueDate);

        head = head.next;
    }

    // Display all tasks
    void displayAll() {
        if (head == null) {
            System.out.println("No tasks");
            return;
        }

        TaskNode temp = head;
        do {
            System.out.println(temp.taskId + " | " + temp.taskName +
                               " | Priority " + temp.priority +
                               " | Due " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    // Search by priority
    void searchByPriority(int p) {
        if (head == null) return;

        TaskNode temp = head;
        boolean found = false;

        do {
            if (temp.priority == p) {
                System.out.println(temp.taskId + " | " + temp.taskName +
                                   " | Due " + temp.dueDate);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found)
            System.out.println("No task with given priority");
    }
}
