package Chap2_GenerateObjectAndDestory.item5.usecase2;

import org.jboss.weld.exceptions.UnsupportedOperationException;

import java.util.List;

public class SpellChecker {
    private static final Lexicon dictionary = new KoreaDicationry();

    private SpellChecker() {

    }

    public static final SpellChecker INSTANCE = new SpellChecker();

    public boolean isValid(String word) {
        throw new UnsupportedOperationException();
    }

    public List<String> suggestions(String typo) {
        throw new UnsupportedOperationException();
    }

    public static void main(String[] args) {
        SpellChecker.INSTANCE.isValid("hello java");
    }
}
interface Lexicon {}

class KoreaDicationry implements Lexicon {

}
