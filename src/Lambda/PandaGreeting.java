package Lambda;

/*
 @author Myvin Barboza
 12/03/20 8:01 AM 
 */
public class PandaGreeting implements Greeting {

    @Override
    public void perform() {
        System.out.println("Panda is too lazy you say hello");
    }
}