package Programs.Strings;

//How can a given string be reversed using recursion?
public class reverseStringUsingRecursion {

    public static String reverse(String str){

        if(str.length() == 0 || str.length() <=1){
            return str;
        }

        return reverse(str.substring(1)) + str.charAt(0);
    }
    public static void main(String args[]){
        String str = "Haritha";
        System.out.println("Reverse string using recursion -- "+reverse(str));
    }
}
