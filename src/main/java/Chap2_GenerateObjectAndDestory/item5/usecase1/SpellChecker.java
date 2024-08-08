package Chap2_GenerateObjectAndDestory.item5.usecase1;

import org.jboss.weld.exceptions.UnsupportedOperationException;

import java.util.List;

public class SpellChecker {
    private static final Lexicon dictionary = new KoreaDicationry();

    private SpellChecker() {

    }

    public static boolean isValid(String word) {
        throw new UnsupportedOperationException();
    }

    public static List<String> suggestions(String typo) {
        throw new UnsupportedOperationException();
    }

    public static void main(String[] args) {
        SpellChecker.isValid("true");
    }
}
interface Lexicon {}

class KoreaDicationry implements Lexicon {

}
