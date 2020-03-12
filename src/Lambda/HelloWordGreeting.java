package Lambda;

/*
 @author Myvin Barboza
 12/03/20 7:58 AM 
 */public class HelloWordGreeting implements Greeting {
    @Override
    public void perform() {
        System.out.println("hello World");
    }
}