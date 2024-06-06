package pl.dicedev.turtle.service;

import pl.dicedev.turtle.chain.TurtleChain;
import pl.dicedev.turtle.dto.Card;
import pl.dicedev.turtle.dto.Stone;
import pl.dicedev.turtle.dto.Turtle;

import java.util.List;

public class TurtleMoveService {

    private TurtleChain turtleChain;

    public TurtleMoveService() {
        this.turtleChain = new TurtleChain();
    }

    public void move(Card card, List<Stone> stoneList) {
        int indexOfTurtle = 0;
        Turtle turtle = null;
        for (int i = 0; i < stoneList.size(); i++) {
            Stone stone = stoneList.get(i);
            if (stone == null) continue;
            if (stone.getTurtle1() != null && card.getTurtleColor().equals(stone.getTurtle1().getColor())) {
                indexOfTurtle = i;
                turtle = stone.getTurtle1();
                stone.setTurtle1(null);
                break;
            }
            if (stone.getTurtle2() != null && card.getTurtleColor().equals(stone.getTurtle2().getColor())) {
                indexOfTurtle = i;
                turtle = stone.getTurtle2();
                stone.setTurtle2(null);
                break;
            }
            if (stone.getTurtle3() != null && card.getTurtleColor().equals(stone.getTurtle3().getColor())) {
                indexOfTurtle = i;
                turtle = stone.getTurtle3();
                stone.setTurtle3(null);
                break;
            }
            if (stone.getTurtle4() != null && card.getTurtleColor().equals(stone.getTurtle4().getColor())) {
                indexOfTurtle = i;
                turtle = stone.getTurtle4();
                stone.setTurtle4(null);
                break;
            }
            if (stone.getTurtle5() != null && card.getTurtleColor().equals(stone.getTurtle5().getColor())) {
                indexOfTurtle = i;
                turtle = stone.getTurtle5();
                stone.setTurtle5(null);
                break;
            }
            turtleChain.moveTurtle(stone);
        }
        Stone nextStone = stoneList.get(indexOfTurtle + card.getCardValue().getValue());

        nextStone.setTurtle1(turtle);

    }

}
