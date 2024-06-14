package pl.dicedev.turtle.repository;

import pl.dicedev.turtle.dto.Card;

import java.util.List;

public class MongoDBRepository implements Repository {
    @Override
    public List<Card> readCards() {
        return List.of();
    }
}
