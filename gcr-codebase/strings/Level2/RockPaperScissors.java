/*Rock-Paper-Scissors is a game played between a minimum of two players. Each player can choose either rock, paper, or scissors. Here the game is played between a user and a computer. Based on the rules, either a player or a computer will win. Show the stats of player and computer win in a tabular format across multiple games. Also, show the winning percentage between the player and the computer.
Hint => 
The rule is: rock-scissors: rock will win (rock crushes scissors); rock-paper: paper wins (paper covers rock); scissors-paper: scissors win (scissors cuts paper)
Create a Method to find the Computer Choice using the Math.random
Create a Method to find the winner between the user and the computer
Create a Method to find the average and percentage of wins for the user and the computer and return a String 2D array
Create a Method to display the results of every game and also display the average and percentage wins 
In the main take user input for the number of games and call methods to display results
*/



import java.util.Scanner;

public class RockPaperScissors {

    // Method to get computer choice using Math.random()
    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3);

        if (choice == 0)
            return "Rock";
        else if (choice == 1)
            return "Paper";
        else
            return "Scissors";
    }

    // Method to find winner
    public static String findWinner(String user, String computer) {

        if (user.equals(computer))
            return "Draw";

        if ((user.equals("Rock") && computer.equals("Scissors")) ||
            (user.equals("Paper") && computer.equals("Rock")) ||
            (user.equals("Scissors") && computer.equals("Paper"))) {
            return "User";
        } else {
            return "Computer";
        }
    }

    // Method to calculate average and percentage
    public static String[][] calculateStats(int userWins, int compWins, int totalGames) {

        String[][] stats = new String[2][3];

        double userPercent = ((double) userWins / totalGames) * 100;
        double compPercent = ((double) compWins / totalGames) * 100;

        userPercent = Math.round(userPercent * 100.0) / 100.0;
        compPercent = Math.round(compPercent * 100.0) / 100.0;

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = userPercent + "%";

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(compWins);
        stats[1][2] = compPercent + "%";

        return stats;
    }

    // Method to display results
    public static void displayResults(String[][] games, String[][] stats) {

        System.out.println("\nGame\tUser Choice\tComputer Choice\tWinner");
        System.out.println("-----------------------------------------------------");

        for (int i = 0; i < games.length; i++) {
            System.out.println((i + 1) + "\t" +
                    games[i][0] + "\t\t" +
                    games[i][1] + "\t\t" +
                    games[i][2]);
        }

        System.out.println("\n---------------- Statistics ----------------");
        System.out.println("Player\tWins\tWinning %");
        System.out.println("-------------------------------------------");

        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" +
                    stats[i][1] + "\t" +
                    stats[i][2]);
        }
    }

    // Main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int gamesCount = sc.nextInt();
        sc.nextLine(); 

        String[][] games = new String[gamesCount][3];

        int userWins = 0;
        int compWins = 0;

        for (int i = 0; i < gamesCount; i++) {

            System.out.print("\nGame " + (i + 1) + " - Enter choice (Rock/Paper/Scissors): ");
            String userChoice = sc.nextLine();

            // Capitalize first letter for consistency
            userChoice = userChoice.substring(0, 1).toUpperCase() + userChoice.substring(1).toLowerCase();

            String computerChoice = getComputerChoice();
            String winner = findWinner(userChoice, computerChoice);

            if (winner.equals("User"))
                userWins++;
            else if (winner.equals("Computer"))
                compWins++;

            games[i][0] = userChoice;
            games[i][1] = computerChoice;
            games[i][2] = winner;
        }

        String[][] stats = calculateStats(userWins, compWins, gamesCount);
        displayResults(games, stats);

        sc.close();
    }
}


