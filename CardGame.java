import java.util.ArrayList;
import java.util.List;

public class CardGame {
    public static void main(String[] args) {
        // Create a deck and shuffle it
        Deck deck = new Deck();
        deck.shuffle();

        // Create a list of players
        List<Player> players = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            players.add(new Player("Player " + i));
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
