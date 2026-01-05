package javaDSAPractice.com.linkedlist.circularlinkedlist.roundrobinschedulingalgorithm;

class RoundRobinScheduler {

    private ProcessNode head = null;

    // Add process at end
    void addProcess(int id, int bt, int p) {
        ProcessNode n = new ProcessNode(id, bt, p);

        if (head == null) {
            head = n;
            n.next = head;
            return;
        }

        ProcessNode temp = head;
        while (temp.next != head)
            temp = temp.next;

        temp.next = n;
        n.next = head;
    }

    // Display processes
    void display() {
        if (head == null) {
            System.out.println("No processes");
            return;
        }

        ProcessNode temp = head;
        do {
            System.out.println("PID " + temp.pid +
                    " | Remaining " + temp.remainingTime);
            temp = temp.next;
        } while (temp != head);
    }

    // Round Robin execution
    void execute(int quantum) {
        if (head == null) return;

        ProcessNode curr = head;
        int time = 0;
        int count = countProcesses();

        while (count > 0) {

            if (curr.remainingTime > 0) {

                int exec = Math.min(curr.remainingTime, quantum);
                curr.remainingTime -= exec;
                time += exec;

                updateWaitingTime(curr, exec);

                if (curr.remainingTime == 0) {
                    curr.turnaroundTime = time;
                    count--;
                }
            }
            curr = curr.next;
            display();
            System.out.println("----");
        }
        calculateAverages();
    }

    private void updateWaitingTime(ProcessNode running, int exec) {
        ProcessNode temp = head;
        do {
            if (temp != running && temp.remainingTime > 0)
                temp.waitingTime += exec;
            temp = temp.next;
        } while (temp != head);
    }

    private int countProcesses() {
        int c = 0;
        ProcessNode temp = head;
        do {
            c++;
            temp = temp.next;
        } while (temp != head);
        return c;
    }

    private void calculateAverages() {
        int totalWT = 0, totalTAT = 0, n = 0;

        ProcessNode temp = head;
        do {
            totalWT += temp.waitingTime;
            totalTAT += temp.turnaroundTime;
            n++;
            temp = temp.next;
        } while (temp != head);

        System.out.println("Average Waiting Time: " + (double) totalWT / n);
        System.out.println("Average Turnaround Time: " + (double) totalTAT / n);
    }
}
