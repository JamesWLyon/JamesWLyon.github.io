// Class representing an individual playing card
public class Card {
    private Rank rank;
    private Suit suit;

    // Constructor to initialize a card with a rank and suit
    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    // Getter method for the rank of the card
    public Rank getRank() {
        return rank;
    }

    // Getter method for the suit of the card
    public Suit getSuit() {
        return suit;
    }

    // toString method to represent the card as a string
    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}
