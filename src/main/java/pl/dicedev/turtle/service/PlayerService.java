package pl.dicedev.turtle.service;

import pl.dicedev.turtle.dto.Card;
import pl.dicedev.turtle.dto.Player;

public interface PlayerService {

    Player createPlayer(String name);
    Card drawCard(Player player);

}
