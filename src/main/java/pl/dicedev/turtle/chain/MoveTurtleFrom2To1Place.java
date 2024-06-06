package pl.dicedev.turtle.chain;

import pl.dicedev.turtle.dto.Stone;
import pl.dicedev.turtle.dto.Turtle;

class MoveTurtleFrom2To1Place implements Movable {

    private Movable next;

    public MoveTurtleFrom2To1Place(Movable next) {
        this.next = next;
    }

    @Override
    public void moveTurtle(Stone stone) {
        if (stone.getTurtle1() == null && stone.getTurtle2() != null) {
            Turtle tmp = stone.getTurtle2();
            stone.setTurtle2(null);
            stone.setTurtle1(tmp);
        }
        if (next != null) next.moveTurtle(stone);
    }

}
