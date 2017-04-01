package eventHandling.listening;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Alex on 29.03.2017.
 */
public class main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("app-event-listing.xml");
        context.start();

        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage();

        context.stop();
    }
}
