package pl.dicedev.turtle.repository;

import pl.dicedev.turtle.dto.Card;

import java.util.List;

public interface Repository {

    List<Card> readCards();

}
