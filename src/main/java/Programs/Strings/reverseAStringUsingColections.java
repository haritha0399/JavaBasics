package Programs.Strings;

import java.util.ArrayList;
import java.util.Collections;

public class reverseAStringUsingColections {

    public static void main(String args[]){
    String str = "hello";
    ArrayList<Character> al = new ArrayList<Character>();
    for(
    int i = 0;
    i<str.length();i++){
        al.add(str.charAt(i));
    }

        Collections.reverse(al);
        System.out.println("Reversed string : " +al);
}

}
