package bonus1;

import java.util.*;

public class Assignment3_2 
{
    
    public static void main(String[] args) throws Exception 
    {
        String[] faces = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] suits = {"Spades", "Clubs", "Hearts", "Diamonds"};
        ArrayList<Card> deckOfCards = new ArrayList<Card>();
        Deck deck;

        for(int i = 0; i < suits.length; i++)
        {
            for(int k = 0; k < faces.length; k++)
            {
                deckOfCards.add(new Card(suits[i], faces[k]));
            }
        }

        deck = new Deck(deckOfCards);
        deck.shuffleDeck();

        System.out.println("This program creates a deck of cards, shuffles them and displays each card in random order.\n");
        
        for(int i = 0; i < deck.deckSize(); i++)
        {
            System.out.println(deck.cardString(i));
        }

        System.out.println("\nGoodbye...");
        System.exit(0);

    }

}
