package eventHandling.listening;

/**
 * Created by Alex on 29.03.2017.
 */
public class HelloWorld {
    String message;

    public void setMessage(String message){
        this.message = message;
    }

    public void getMessage(){
        System.out.println("Your Message " + message);
    }
}
