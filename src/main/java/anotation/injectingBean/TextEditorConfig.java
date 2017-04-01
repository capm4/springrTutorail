package anotation.injectingBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Alex on 29.03.2017.
 */

@Configuration
public class TextEditorConfig {

    @Bean
    public TextEditor textEditor(){
        return new TextEditor(spellChecker());
    }

    @Bean SpellChecker spellChecker(){
        return new SpellChecker();
    }
}
