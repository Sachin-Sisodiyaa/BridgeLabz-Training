package com.daytwo.texteditor;

import java.util.Stack;

public class TextEditor {

    private String content = "";
    private Stack<Action> undoStack = new Stack<>();
    private Stack<Action> redoStack = new Stack<>();

    // Insert text
    void insert(String text) {
        content += text;
        undoStack.push(new Action("insert", text));
        redoStack.clear();
    }

    // Delete last n characters
    void delete(int n) {
        if (n > content.length()) {
            n = content.length();
        }
        String deleted = content.substring(content.length() - n);
        content = content.substring(0, content.length() - n);

        undoStack.push(new Action("delete", deleted));
        redoStack.clear();
    }

    // Undo operation
    void undo() {
        if (undoStack.isEmpty()) {
            System.out.println("Nothing to undo");
            return;
        }

        Action action = undoStack.pop();

        if (action.type.equals("insert")) {
            content = content.substring(0, content.length() - action.text.length());
        } else if (action.type.equals("delete")) {
            content += action.text;
        }

        redoStack.push(action);
    }

    // Redo operation
    void redo() {
        if (redoStack.isEmpty()) {
            System.out.println("Nothing to redo");
            return;
        }

        Action action = redoStack.pop();

        if (action.type.equals("insert")) {
            content += action.text;
        } else if (action.type.equals("delete")) {
            content = content.substring(0, content.length() - action.text.length());
        }

        undoStack.push(action);
    }

    void showContent() {
        System.out.println("Current Text: " + content);
    }
}
