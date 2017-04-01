package anotation.injectingBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Alex on 29.03.2017.
 */
public class main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(TextEditorConfig.class);
        SpellChecker textEditor = context.getBean(SpellChecker.class);
        textEditor.checkSpelling();
    }

}
