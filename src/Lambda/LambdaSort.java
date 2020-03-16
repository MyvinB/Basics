package Lambda;

import java.util.*;

/*
 @author Myvin Barboza
 14/03/20 9:40 AM 
 */
public class LambdaSort {
    public static void main(String[] args) {
        List<String> list= Arrays.asList(
                "abc","cde","efg","def","bcd"
        ) ;
        Collections.sort(list,(s1,s2)-> s1.compareTo(s2));
        System.out.println(list);

    }
}