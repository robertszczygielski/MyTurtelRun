package pl.dicedev.turtle.dto;

import pl.dicedev.turtle.enums.CardValue;
import pl.dicedev.turtle.enums.TurtleColor;

public class Card {

    private CardValue cardValue;
    private TurtleColor turtleColor;

    public Card(CardValue cardValue, TurtleColor turtleColor) {
        this.cardValue = cardValue;
        this.turtleColor = turtleColor;
    }

    public CardValue getCardValue() {
        return cardValue;
    }

    public TurtleColor getTurtleColor() {
        return turtleColor;
    }
}
