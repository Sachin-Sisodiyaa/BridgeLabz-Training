package javaDSAPractice.com.linkedlist.doublylinkedlist.undoredofunctionality;

class TextEditorDLL {

    private TextNode head, tail, current;
    private int size = 0;
    private final int MAX = 10;

    // Add new text state
    void addState(String text) {

        TextNode node = new TextNode(text);

        // Remove redo history
        if (current != null && current.next != null) {
            current.next.prev = null;
            current.next = null;
            tail = current;
        }

        if (head == null) {
            head = tail = current = node;
            size = 1;
            return;
        }

        tail.next = node;
        node.prev = tail;
        tail = node;
        current = node;
        size++;

        // Limit history size
        if (size > MAX) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    // Undo operation
    void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        } else {
            System.out.println("Nothing to undo");
        }
    }

    // Redo operation
    void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        } else {
            System.out.println("Nothing to redo");
        }
    }

    // Display current text
    void display() {
        if (current != null)
            System.out.println("Current Text: " + current.content);
        else
            System.out.println("Editor is empty");
    }
}
