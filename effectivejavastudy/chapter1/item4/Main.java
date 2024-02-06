package effectivejavastudy.chapter1.item4;

public class Main {

    public static void main(String[] args) {
        String test1 = "1234";
        String test2 = "abcd";
        String test3 = "ab123";
        String test4 = "abcdefgh";

        System.out.println(UtilityClass.isNumeric(test1)); // true
        System.out.println(UtilityClass.isAlpha(test2)); // true
        System.out.println(UtilityClass.isNumeric(test3)); // false
        System.out.println(UtilityClass.isAlpha(test3)); // false
        System.out.println(UtilityClass.isValidLength(test4, 1, 5)); // false
    }
}
