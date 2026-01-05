package javaDSAPractice.com.linkedlist.circularlinkedlist.taskscheduler;

class TaskNode {
    int taskId;
    String taskName, dueDate;
    int priority;

    TaskNode next;

    TaskNode(int id, String name, int p, String d) {
        taskId = id;
        taskName = name;
        priority = p;
        dueDate = d;
    }
}
