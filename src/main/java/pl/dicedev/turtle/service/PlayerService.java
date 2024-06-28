package pl.dicedev.turtle.service;

import pl.dicedev.turtle.dto.Card;
import pl.dicedev.turtle.dto.Player;

import java.util.Scanner;

public interface PlayerService {

    Player createPlayer(String name);
    Card drawCard(Player player, Scanner scanner);

}
