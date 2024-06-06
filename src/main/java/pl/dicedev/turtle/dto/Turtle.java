package pl.dicedev.turtle.dto;

import pl.dicedev.turtle.enums.TurtleColor;

import java.util.Objects;

public class Turtle {

    private TurtleColor color;

    public Turtle(TurtleColor color) {
        this.color = color;
    }

    public TurtleColor getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Turtle turtle = (Turtle) o;
        return color == turtle.color;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(color);
    }

    @Override
    public String toString() {
        return "MyTurtle color is " + color;
    }
}
