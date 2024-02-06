package effectivejavastudy.chapter1.item4;

public class UtilityClass {

    private UtilityClass() {
        throw new AssertionError();
    }

    public static boolean isNumeric(final String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return str.chars().allMatch(Character::isDigit);
    }

    public static boolean isAlpha(final String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return str.chars().allMatch(Character::isLetter);
    }

    public static boolean isValidLength(final String str, final int min, final int max) {
        if (str == null) {
            return false;
        }
        return (str.length() >= min && str.length() <= max);
    }
}
