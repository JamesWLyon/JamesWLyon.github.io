import java.util.ArrayList;
import java.util.List;

// Class representing a player in the card game
public class Player {
    private String name;
    private List<Card> hand;

    // Constructor to initialize a player with a name and an empty hand
    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
    }

    // Method to add cards to the player's hand
    public void addToHand(List<Card> cards) {
        hand.addAll(cards);
    }

    // Getter method for the player's hand
    public List<Card> getHand() {
        return hand;
    }

    // Getter method for the player's name
    public String getName() {
        return name;
    }
}
