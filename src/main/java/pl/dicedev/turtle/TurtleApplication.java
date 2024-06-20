package pl.dicedev.turtle;


import pl.dicedev.turtle.configuration.BoardFactory;
import pl.dicedev.turtle.dto.Board;
import pl.dicedev.turtle.dto.Card;
import pl.dicedev.turtle.dto.Player;
import pl.dicedev.turtle.repository.CardRepository;
import pl.dicedev.turtle.repository.Repository;
import pl.dicedev.turtle.service.PlayerService;
import pl.dicedev.turtle.service.PlayerServiceImpl;
import pl.dicedev.turtle.service.TurtleMoveService;

//@SpringBootApplication
public class TurtleApplication {

    public static void main(String[] args) {
        Board board = BoardFactory.initBoard();
        Repository repository = new CardRepository();
        PlayerService playerService = new PlayerServiceImpl(repository);
        TurtleMoveService turtleMoveService = new TurtleMoveService();

        Player ala = playerService.createPlayer("ala");
        Player ola = playerService.createPlayer("ola");

        System.out.println(ala);
        System.out.println(ola);

        Card card = playerService.drawCard(ala);
        turtleMoveService.move(card, board.getStones());

        card = playerService.drawCard(ola);
        turtleMoveService.move(card, board.getStones());


    }

//	public static void main(String[] args) {
//		SpringApplication.run(TurtleApplication.class, args);
//	}

}
