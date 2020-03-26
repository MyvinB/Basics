package String;

/*
 @author Myvin Barboza
 24/03/20 7:19 AM 
 */public class SwapWithoutTemp {

     static String returnFirst(String x,String y){
         return x;
     }


     public static void main(String[] args) {
        String a="one";
        String b="two";
        a=returnFirst(b,b=a);
         System.out.println(a +" "+ b);
    }
}