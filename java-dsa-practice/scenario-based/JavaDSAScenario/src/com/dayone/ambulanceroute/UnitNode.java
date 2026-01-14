package com.dayone.ambulanceroute;

class UnitNode {
    String unitName;
    boolean available;
    UnitNode next;

    UnitNode(String unitName, boolean available) {
        this.unitName = unitName;
        this.available = available;
        this.next = this; // circular by default
    }
}
