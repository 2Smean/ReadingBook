package Chap2_GenerateObjectAndDestory.item5.usecase3;

import org.jboss.weld.exceptions.UnsupportedOperationException;

import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;

public class SpellChecker {
    private final Lexicon dictionary;

    private SpellChecker(Lexicon dictionary) {
        this.dictionary = Objects.requireNonNull(dictionary);
    }
    //Supplier 사용 예시
    private SpellChecker(Supplier<Lexicon> dictionary) {
        this.dictionary = Objects.requireNonNull(dictionary.get());
    }

    public boolean isValid(String word) {
        throw new UnsupportedOperationException();
    }

    public List<String> suggestions(String typo) {
        throw new UnsupportedOperationException();
    }

    public static void main(String[] args) {
        Lexicon lexicon = new KoreaDicationary();
        SpellChecker spellChecker = new SpellChecker(lexicon);
        SpellChecker spellChecker1 = new SpellChecker( () -> lexicon); //Supplier 사용 예시
        spellChecker.isValid("true");
    }
}
interface Lexicon {}

class KoreaDicationary implements Lexicon { }

class Testdicationary implements Lexicon { } // test도 가능해진다
