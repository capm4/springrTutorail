package xml.SpringAutowriting;

public class TextEditor {
    private SpellChecker spellChecker;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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
