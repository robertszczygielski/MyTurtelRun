package pl.dicedev.turtle.dto;

import java.util.ArrayList;
import java.util.List;


public class CardDeck {

    private List<Card> cards = new ArrayList<>(52);

    public CardDeck() {
        // init cards
    }

    public List<Card> getCards() {
        return cards;
    }
}
