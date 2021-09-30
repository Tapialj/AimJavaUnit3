import java.util.*;

public class Deck 
{
    
    private ArrayList<Card> deck;


    public Deck(ArrayList<Card> deck)
    {
        this.deck = deck;
    }

    public void shuffleDeck()
    {
        Collections.shuffle(this.deck);
    }

    public int deckSize()
    {
        return deck.size();
    }

    public String cardString(int i)
    {
        return deck.get(i).toString();
    }

    public ArrayList<Card> getDeck() 
    {
        return deck;
    }

    public void setDeck(ArrayList<Card> deck) 
    {
        this.deck = deck;
    }

    @Override
    public String toString() {
        return "Deck [deck=" + deck + "]";
    }

}
