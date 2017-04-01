package anotation.injectingBean;

/**
 * Created by Alex on 29.03.2017.
 */
public class TextEditor {
    SpellChecker spellChecker;

    public TextEditor(SpellChecker spellChecker){
        System.out.println("Inside TextEditor constructor." );
        this.spellChecker = spellChecker;
    }
    public void spellCheck(){
        spellChecker.checkSpelling();
    }
}
