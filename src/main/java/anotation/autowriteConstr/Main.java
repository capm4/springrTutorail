package anotation.autowriteConstr;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("app-context-auto-conts.xml");
        anotation.autowriteConstr.TextEditor te = (anotation.autowriteConstr.TextEditor) context.getBean("textEditor");
        te.spellCheck();
    }
}
