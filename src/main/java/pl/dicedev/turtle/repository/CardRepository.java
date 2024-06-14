package pl.dicedev.turtle.repository;

import pl.dicedev.turtle.dto.Card;

import java.util.List;

public class CardRepository implements Repository {

    private final Repository repository;

    public CardRepository() {
        this.repository = new CSVRepository();
    }

    @Override
    public List<Card> readCards() {
        return repository.readCards();
    }
}
