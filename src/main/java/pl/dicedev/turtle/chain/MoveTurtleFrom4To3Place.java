package pl.dicedev.turtle.chain;

import pl.dicedev.turtle.dto.Stone;
import pl.dicedev.turtle.dto.Turtle;

class MoveTurtleFrom4To3Place implements Movable {

    private Movable next;

    public MoveTurtleFrom4To3Place(Movable next) {
        this.next = next;
    }

    @Override
    public void moveTurtle(Stone stone) {
        if (stone.getTurtle3() == null && stone.getTurtle4() != null) {
            Turtle tmp = stone.getTurtle4();
            stone.setTurtle4(null);
            stone.setTurtle3(tmp);
        }
        if (next != null) next.moveTurtle(stone);
    }

}
