package pl.dicedev.turtle.chain;

import pl.dicedev.turtle.dto.Stone;
import pl.dicedev.turtle.dto.Turtle;

class MoveTurtleFrom3To2Place implements Movable {

    private Movable next;

    public MoveTurtleFrom3To2Place(Movable next) {
        this.next = next;
    }

    @Override
    public void moveTurtle(Stone stone) {
        if (stone.getTurtle2() == null && stone.getTurtle3() != null) {
            Turtle tmp = stone.getTurtle3();
            stone.setTurtle3(null);
            stone.setTurtle2(tmp);
        }
        if (next != null) next.moveTurtle(stone);
    }

}
