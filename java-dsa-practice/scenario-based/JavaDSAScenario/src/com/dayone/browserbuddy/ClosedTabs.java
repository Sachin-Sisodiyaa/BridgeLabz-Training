package com.dayone.browserbuddy;

import java.util.Stack;

class ClosedTabs {

    private Stack<String> closedTabs = new Stack<>();

    void closeTab(String url) {
        if (url != null) {
            closedTabs.push(url);
            System.out.println("Tab closed: " + url);
        }
    }

    String reopenTab() {
        if (closedTabs.isEmpty()) {
            System.out.println("No closed tabs to reopen.");
            return null;
        }
        String tab = closedTabs.pop();
        System.out.println("Reopened tab: " + tab);
        return tab;
    }
}
