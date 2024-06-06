package pl.dicedev.turtle.enums;

public enum CardValue {

    PLUS_ONE(1),
    PLUS_TWO(2),
    MINUS_ONE(-1),
    ONE_LAST(1),
    TWO_LAST(2);

    private final int value;

    CardValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
