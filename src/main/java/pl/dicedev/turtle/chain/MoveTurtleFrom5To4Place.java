package pl.dicedev.turtle.chain;

import pl.dicedev.turtle.dto.Stone;
import pl.dicedev.turtle.dto.Turtle;

class MoveTurtleFrom5To4Place implements Movable {

    private Movable next;

    public MoveTurtleFrom5To4Place(Movable next) {
        this.next = next;
    }

    @Override
    public void moveTurtle(Stone stone) {
        if (stone.getTurtle4() == null && stone.getTurtle5() != null) {
            Turtle tmp = stone.getTurtle5();
            stone.setTurtle5(null);
            stone.setTurtle4(tmp);
        }
        if (next != null) next.moveTurtle(stone);
    }

}
