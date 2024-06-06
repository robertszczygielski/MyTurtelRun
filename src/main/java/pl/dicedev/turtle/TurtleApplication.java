package pl.dicedev.turtle;


import pl.dicedev.turtle.chain.TurtleChain;
import pl.dicedev.turtle.configuration.BoardFactory;
import pl.dicedev.turtle.dto.Board;
import pl.dicedev.turtle.dto.Card;
import pl.dicedev.turtle.dto.Player;
import pl.dicedev.turtle.enums.CardValue;
import pl.dicedev.turtle.enums.TurtleColor;
import pl.dicedev.turtle.service.TurtleMoveService;

//@SpringBootApplication
public class TurtleApplication {

    public static void main(String[] args) {
        Player playerOne = new Player("Harry Potter");
        Card cardOne = new Card(CardValue.PLUS_ONE, TurtleColor.RED);

        System.out.println(playerOne);

        Board board = BoardFactory.initBoard();

        TurtleMoveService moveService = new TurtleMoveService();

        board.getStones().forEach(System.out::println);
        System.out.println("--------------------------------");

        moveService.move(cardOne, board.getStones());

        board.getStones().forEach(System.out::println);
        System.out.println("--------------------------------");

        moveService.move(cardOne, board.getStones());

        board.getStones().forEach(System.out::println);
    }

//	public static void main(String[] args) {
//		SpringApplication.run(TurtleApplication.class, args);
//	}

}
