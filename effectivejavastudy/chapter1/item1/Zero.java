package effectivejavastudy.chapter1.item1;

public class Zero implements Number {

    private int value;

    public Zero(final int value) {
        validate(value);
        this.value = value;
    }

    private static void validate(final int value) {
        if(value != 0) {
            throw new IllegalArgumentException();
        }
    }

    public static Number from(int value) {
        return new Zero(value);
    }
}
