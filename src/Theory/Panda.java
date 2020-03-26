package Theory;

abstract class PandaAbstract extends Panda {
    //implementation of abstract and non abstract methods
    abstract String chicken();

    String TandooriChicken() {
        return null;
    }
}

interface PandaInterface{
    //By default all methods in the
    String hello();
    //all variable declared static final
    int soup = 0;
    //Since java 8 we have default methods allowed in interface
    default String pandaSleep(){
        System.out.println("Go to sleep Panda");
        return "Done";
    }
    static String eatPanda(){
        System.out.println();
        return "Done";
    }
}

class Panda{
public int chicken=0;
}
