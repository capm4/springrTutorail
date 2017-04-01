package xml.SpringTutorailSecond;

public class TextEditor {
    private SpellChecker spellChecker;

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void setSpellChecker(SpellChecker spellChecker) {
        System.out.println("Inside spelCheck constructor");
        this.spellChecker = spellChecker;
    }

    public void spellChecker(){
        spellChecker.checkSpelling();
    }


}
