package anotation.autowriteSetter;


import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {

    @Autowired
    private SpellChecker spellChecker;
    public TextEditor(SpellChecker spellChecker) {
        System.out.println("Inside TextEditor constructor." );
    }


    public SpellChecker getSpellChecker( ) {
        return spellChecker;
    }
    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
