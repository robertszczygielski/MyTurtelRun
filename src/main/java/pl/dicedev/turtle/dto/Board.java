package pl.dicedev.turtle.dto;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private List<Stone> stones = new ArrayList<>(10);

    public Board() {
        for (int i = 0; i < 10; i++) {
            stones.add(new Stone());
        }
    }

    public List<Stone> getStones() {
        return stones;
    }
}
