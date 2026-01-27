package com.collections.scenario.votingsystem;

import java.util.*;

public class VotingSystem {

    // Stores total votes per candidate
    private HashMap<String, Integer> voteCount = new HashMap<>();

    // Maintains order of votes cast
    private LinkedHashMap<Integer, String> voteOrder = new LinkedHashMap<>();

    private int voteNumber = 1;

    // Cast a vote
    public void castVote(String candidate) {

        // Update vote count
        voteCount.put(candidate, voteCount.getOrDefault(candidate, 0) + 1);

        // Store vote order
        voteOrder.put(voteNumber++, candidate);
    }

    // Display votes in order they were cast
    public void displayVoteOrder() {
        System.out.println("\nVoting Order:");
        for (Map.Entry<Integer, String> entry : voteOrder.entrySet()) {
            System.out.println("Vote " + entry.getKey() + " → " + entry.getValue());
        }
    }

    // Display final results sorted by votes
    public void displaySortedResults() {
        System.out.println("\nElection Results (Sorted by Votes):");

        TreeMap<Integer, List<String>> sortedResults = new TreeMap<>(Collections.reverseOrder());

        for (Map.Entry<String, Integer> entry : voteCount.entrySet()) {
            sortedResults
                .computeIfAbsent(entry.getValue(), k -> new ArrayList<>())
                .add(entry.getKey());
        }

        for (Map.Entry<Integer, List<String>> entry : sortedResults.entrySet()) {
            for (String candidate : entry.getValue()) {
                System.out.println(candidate + " → " + entry.getKey() + " votes");
            }
        }
    }
}
