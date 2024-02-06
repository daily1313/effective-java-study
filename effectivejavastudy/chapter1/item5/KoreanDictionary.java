package effectivejavastudy.chapter1.item5;

public class KoreanDictionary implements Dictionary {

    private static final String REGEX = "^[ㄱ-ㅎ가-힣]*$";

    @Override
    public boolean isValidWord(final String word) {
        return word.matches(REGEX);
    }
}
