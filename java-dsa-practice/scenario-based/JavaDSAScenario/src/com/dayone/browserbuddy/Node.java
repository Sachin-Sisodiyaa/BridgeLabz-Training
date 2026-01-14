package com.dayone.browserbuddy;

class Node {
    String url;
    Node prev, next;

    Node(String url) {
        this.url = url;
        this.prev = null;
        this.next = null;
    }
}
