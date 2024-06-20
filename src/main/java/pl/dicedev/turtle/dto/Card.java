package pl.dicedev.turtle.dto;

import pl.dicedev.turtle.enums.CardValue;
import pl.dicedev.turtle.enums.TurtleColor;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return cardValue == card.cardValue && turtleColor == card.turtleColor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardValue, turtleColor);
    }

    @Override
    public String toString() {
        return "\n Card{" +
                "cardValue=" + cardValue +
                ", turtleColor=" + turtleColor +
                '}';
    }
}
