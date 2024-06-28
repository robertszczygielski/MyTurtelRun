package pl.dicedev.turtle;


import pl.dicedev.turtle.configuration.BoardFactory;
import pl.dicedev.turtle.dto.Board;
import pl.dicedev.turtle.dto.Card;
import pl.dicedev.turtle.dto.Player;
import pl.dicedev.turtle.dto.Stone;
import pl.dicedev.turtle.repository.CardRepository;
import pl.dicedev.turtle.repository.Repository;
import pl.dicedev.turtle.service.PlayerService;
import pl.dicedev.turtle.service.PlayerServiceImpl;
import pl.dicedev.turtle.service.TurtleMoveService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//@SpringBootApplication
public class TurtleApplication {

    public static void main(String[] args) {
        Board board = BoardFactory.initBoard();
        Repository repository = new CardRepository();
        PlayerService playerService = new PlayerServiceImpl(repository);
        TurtleMoveService turtleMoveService = new TurtleMoveService();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj ilość graczy: ");
        int playerAmount = scanner.nextInt();
        scanner.nextLine();

        List<Player> playerList = new ArrayList<>();
        for (int i = 0; i < playerAmount; i++) {
            System.out.println("Podaj imię gracza " + i + ": ");
            String playerName = scanner.nextLine();
            Player player = playerService.createPlayer(playerName);
            playerList.add(player);
        }
        playerList.forEach(System.out::println);

        for (;;) {
            for (Player player : playerList) {
                System.out.println("kamienie przed: " + board.getStones());
                Card card = playerService.drawCard(player, scanner);
                turtleMoveService.move(card, board.getStones());
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>");
                System.out.println("Kamienie PO:");
                System.out.println(board.getStones());
            }
            List<Stone> stones = board.getStones();
            Stone stone = stones.get(9);
            System.out.println("Ostatni kamień: " + stone);

            if (stone.getTurtle1() != null) break;
        }

    }

//	public static void main(String[] args) {
//		SpringApplication.run(TurtleApplication.class, args);
//	}

}
