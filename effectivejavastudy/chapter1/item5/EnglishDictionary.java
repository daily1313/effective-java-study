package effectivejavastudy.chapter1.item5;

public class EnglishDictionary implements Dictionary {

    @Override
    public boolean isValidWord(final String word) {
        return word.chars().allMatch(Character::isAlphabetic);
    }
}
