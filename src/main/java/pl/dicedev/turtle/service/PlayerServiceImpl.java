package pl.dicedev.turtle.service;

import pl.dicedev.turtle.dto.Card;
import pl.dicedev.turtle.dto.Player;
import pl.dicedev.turtle.repository.Repository;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class PlayerServiceImpl implements PlayerService {

    private final Random random;
    private final Repository repository;

    public PlayerServiceImpl(Repository repository) {
        this.random = new Random();
        this.repository = repository;
    }

    @Override
    public Card drawCard(Player player, Scanner scanner) {
        List<Card> playerHand = player.getCards();
        System.out.println("================================================================");
        System.out.println();
        System.out.println("player name: " + player.getName());
        System.out.println("którą kartę wykładasz? (od 0-4)");
        System.out.println(player.getCards());
        int idx = scanner.nextInt();
        scanner.nextLine();

        Card card = playerHand.get(idx);
        playerHand.remove(card);
        System.out.println("wybrałeś: " + card);

        List<Card> cardsFromCSV = repository.readCards();
        idx = random.nextInt(cardsFromCSV.size());
        Card nextCard = cardsFromCSV.get(idx);
        playerHand.add(nextCard);
        System.out.println("Nowa karta to: " + nextCard);
        System.out.println("Cała nowa ręka gracza to :" + playerHand);

        return card;
    }

    @Override
    public Player createPlayer(String name) {
        Player player = new Player(name);

        List<Card> playerHand = player.getCards();
        List<Card> cardsFromCSV = repository.readCards();

        for (int i = 0; i < 5; i++) {
            int idx = random.nextInt(cardsFromCSV.size());
            Card card = cardsFromCSV.get(idx);
            playerHand.add(card);
        }

        return player;
    }
}
