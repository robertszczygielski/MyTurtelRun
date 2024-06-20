package pl.dicedev.turtle.dto;

import java.util.Objects;

public class Stone implements Comparable<Stone> {

    Turtle turtle1;
    Turtle turtle2;
    Turtle turtle3;
    Turtle turtle4;
    Turtle turtle5;

    public Turtle getTurtle1() {
        return turtle1;
    }

    public void setTurtle1(Turtle turtle1) {
        this.turtle1 = turtle1;
    }

    public Turtle getTurtle2() {
        return turtle2;
    }

    public void setTurtle2(Turtle turtle2) {
        this.turtle2 = turtle2;
    }

    public Turtle getTurtle3() {
        return turtle3;
    }

    public void setTurtle3(Turtle turtle3) {
        this.turtle3 = turtle3;
    }

    public Turtle getTurtle4() {
        return turtle4;
    }

    public void setTurtle4(Turtle turtle4) {
        this.turtle4 = turtle4;
    }

    public Turtle getTurtle5() {
        return turtle5;
    }

    public void setTurtle5(Turtle turtle5) {
        this.turtle5 = turtle5;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stone stone = (Stone) o;
        return Objects.equals(turtle1, stone.turtle1) && Objects.equals(turtle2, stone.turtle2) && Objects.equals(turtle3, stone.turtle3) && Objects.equals(turtle4, stone.turtle4) && Objects.equals(turtle5, stone.turtle5);
    }


    @Override
    public int hashCode() {
        return Objects.hash(turtle1, turtle2, turtle3, turtle4, turtle5);
    }

    @Override
    public String toString() {
        return "Stone{" +
                "turtle1=" + turtle1 +
                ", turtle2=" + turtle2 +
                ", turtle3=" + turtle3 +
                ", turtle4=" + turtle4 +
                ", turtle5=" + turtle5 +
                '}' + "\n";
    }

    @Override
    public int compareTo(Stone o) {
        return 0;
    }
}
