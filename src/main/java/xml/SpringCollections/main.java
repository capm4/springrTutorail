package xml.SpringCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        JavaCollection javaCollection = (JavaCollection) context.getBean("javaCollection");
        javaCollection.getAddresList();
        javaCollection.getAddresSet();
        javaCollection.getAddresMap();
        javaCollection.getAddresProp();
    }


}
