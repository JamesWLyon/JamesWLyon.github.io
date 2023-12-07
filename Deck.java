import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Class representing a deck of playing cards
public class Deck {
    private List<Card> cards;

    // Constructor to initialize the deck with 52 cards
    public Deck() {
        cards = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new Card(rank, suit));
            }
        }
    }

    // Method to shuffle the deck
    public void shuffle() {
        Collections.shuffle(cards);
    }

    // Method to deal a specified number of cards from the deck
    public List<Card> deal(int numCards) {
        List<Card> hand = new ArrayList<>();
        for (int i = 0; i < numCards; i++) {
            hand.add(cards.remove(0));
        }
        return hand;
    }
}
