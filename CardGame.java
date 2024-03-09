import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CardGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of players
        System.out.print("Enter the number of players: ");
        int numPlayers = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Create a deck and shuffle it
        Deck deck = new Deck();
        deck.shuffle();

        // Create a list of players
        List<Player> players = new ArrayList<>();
        for (int i = 1; i <= numPlayers; i++) {
            // Prompt each player to enter their name
            System.out.print("Enter name for Player " + i + ": ");
            String playerName = scanner.nextLine();
            players.add(new Player(playerName));
        }

        // Deal 5 cards to each player
        for (Player player : players) {
            player.addToHand(deck.deal(5));
        }

        // Print each player's hand
        for (Player player : players) {
            System.out.println(player.getName() + "'s hand: " + player.getHand());
            System.out.println();
        }

        // Determine the winner and print the result
        Player winner = determineWinner(players);
        System.out.println("Winner: " + winner.getName());

        scanner.close();
    }

    // Method to determine the winner based on a simple hand value
    private static Player determineWinner(List<Player> players) {
        Player winner = players.get(0);

        // Iterate through each player and compare based on hand value
        for (Player player : players) {
            if (evaluateHand(player) > evaluateHand(winner)) {
                winner = player;
            }
        }

        return winner;
    }

    // Method to evaluate the total value of a player's hand based on card ranks
    private static int evaluateHand(Player player) {
        int totalValue = 0;
        for (Card card : player.getHand()) {
            totalValue += card.getRank().ordinal() + 1; // Add 1 because ordinal() starts from 0
        }
        return totalValue;
    }
}
