package Programs.Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//How do you check if a string contains only digits?
public class checkIfStringcontainsOnlyDigit {

    public static boolean isDigit(String s){
        String regex = "[0-9]+";
        Pattern p = Pattern.compile(regex);

       Matcher m = p.matcher(s);

       return m.matches();

    }
    public static void main(String args[]){
        String s = "1234";
        boolean res = isDigit(s);
        System.out.println(res);
    }
}
