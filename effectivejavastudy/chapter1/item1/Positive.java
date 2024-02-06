package effectivejavastudy.chapter1.item1;

public class Positive implements Number {

    private int value;

    public Positive(final int value) {
        validate(value);
        this.value = value;
    }

    private static void validate(final int value) {
        if(value <= 0) {
            throw new IllegalArgumentException();
        }
    }

    public static Number from(final int value) {
        return new Positive(value);
    }
}
