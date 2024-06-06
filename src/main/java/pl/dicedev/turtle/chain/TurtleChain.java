package pl.dicedev.turtle.chain;

import pl.dicedev.turtle.dto.Stone;

public class TurtleChain implements Movable {

    private Movable startChain;

    public TurtleChain() {
        Movable moveTurtleFrom5To4Place = new MoveTurtleFrom5To4Place(null);
        Movable moveTurtleFrom4To3Place = new MoveTurtleFrom4To3Place(moveTurtleFrom5To4Place);
        Movable moveTurtleFrom3To2Place = new MoveTurtleFrom3To2Place(moveTurtleFrom4To3Place);
        this.startChain = new MoveTurtleFrom2To1Place(moveTurtleFrom3To2Place);
    }

    @Override
    public void moveTurtle(Stone stone) {
        startChain.moveTurtle(stone);
    }
}
