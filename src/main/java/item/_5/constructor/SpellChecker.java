package item._5.constructor;

public class SpellChecker {

    // dependency injection
    private final Lexicon dictionary;

    public SpellChecker(final Lexicon dictionary) {
        this.dictionary = dictionary;
    }

}
