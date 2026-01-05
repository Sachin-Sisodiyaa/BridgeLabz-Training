package javaDSAPractice.com.linkedlist.circularlinkedlist.roundrobinschedulingalgorithm;

class ProcessNode {
    int pid;
    int burstTime;
    int remainingTime;
    int priority;

    int waitingTime = 0;
    int turnaroundTime = 0;

    ProcessNode next;

    ProcessNode(int id, int bt, int p) {
        pid = id;
        burstTime = bt;
        remainingTime = bt;
        priority = p;
    }
}
