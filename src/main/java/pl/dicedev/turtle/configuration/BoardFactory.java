package pl.dicedev.turtle.configuration;

import pl.dicedev.turtle.dto.Board;
import pl.dicedev.turtle.dto.Stone;
import pl.dicedev.turtle.dto.Turtle;
import pl.dicedev.turtle.enums.TurtleColor;

import java.util.List;

public class BoardFactory {

    public static Board initBoard() {
        Board board = new Board();

        Turtle turtle1 = new Turtle(TurtleColor.BLUE);
        Turtle turtle2 = new Turtle(TurtleColor.BLACK);
        Turtle turtle3 = new Turtle(TurtleColor.RED);
        Turtle turtle4 = new Turtle(TurtleColor.GREEN);
        Turtle turtle5 = new Turtle(TurtleColor.WHITE);

        List<Stone> stones = board.getStones();
        Stone stone = stones.get(0);

        stone.setTurtle1(turtle1);
        stone.setTurtle2(turtle2);
        stone.setTurtle3(turtle3);
        stone.setTurtle4(turtle4);
        stone.setTurtle5(turtle5);

        return board;
    }

}
