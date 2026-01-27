package com.collections.scenario.votingsystem;

public class VotingSystemMain {

    public static void main(String[] args) {

        VotingSystem system = new VotingSystem();

        system.castVote("Alice");
        system.castVote("Bob");
        system.castVote("Alice");
        system.castVote("Charlie");
        system.castVote("Bob");
        system.castVote("Alice");

        system.displayVoteOrder();
        system.displaySortedResults();
    }
}
