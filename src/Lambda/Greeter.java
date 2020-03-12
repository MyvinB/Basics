package Lambda;

/*
 @author Myvin Barboza
 12/03/20 7:51 AM
 Goal: To understand the use of lambda where in we want to pass in the behaviour and a class behaves different
 based on its implementation classic use of polymorphism used here but we are passing an entire object just to
 get only one functionality of the class so that's a drawback.

 */

public class Greeter {

    public void greet(Greeting greeting){
        greeting.perform();
    }

    public static void main(String[] args) {
        ///old way without using lambda
        Greeter greet=new Greeter();
        HelloWordGreeting helloWordGreeting=new HelloWordGreeting();
        greet.greet(helloWordGreeting);
        PandaGreeting pandaGreeting=new PandaGreeting();
        greet.greet(pandaGreeting);

        /*
        aBlockOfCode =public void perform() {
         System.out.println();
        }
        Common sense
        Things to remove from a method while converting it to lambda
        Doesn't make sense to assign public in lambda public is used only when it is a part of the class
        Doesn't require a name cause the name is already present to what the function is assigned to ie aBlockOfCode.
        Java Compiler now looks at the code and figures out what the return type is based on the expression it self
        ** only -> is added to make it a full fledged lambda expression
        aBlockOfCode=()->{
        System.out.println();
        }
        If your line of code is just one line
          aBlockOfCode=()->System.out.println();
         */
        //enjoy reduced line of code
         MyLambda greetingFunction =  ()-> System.out.println("Hello World");
            greetingFunction.foo();
            MyAdd adding= (int a,int b)-> a+b;
        System.out.println(adding.add(1,2));
        Greeting greetLambda=()-> System.out.println("Hello greeting");
        Greeting greetPandaLambda=()-> System.out.println("Panda greeting");
        greetLambda.perform();
        greetPandaLambda.perform();
     
               Greeting hello=()-> System.out.println("I love lambda");
        Greeting innerClassGreeting =new Greeting() {
            @Override
            public void perform() {
                System.out.println("Hello World");
            }
        };

        innerClassGreeting.perform();
        hello.perform();
     
        

    }
}
//Please have a functional interface for lambda expression that is only one method
interface MyLambda{
    void foo();
}

interface MyAdd{
    int add(int a,int b);
}
