package effectivejavastudy.chapter1.item5;

import java.util.Objects;

public class SpellChecker {

    private final Dictionary dictionary;

    public SpellChecker(final Dictionary dictionary) {
        this.dictionary = Objects.requireNonNull(dictionary);
    }

    public boolean isSpellingCorrect(final String word) {
        return dictionary.isValidWord(word);
    }
}
