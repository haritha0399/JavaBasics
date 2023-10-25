package Programs.Strings;

import java.sql.SQLOutput;
import java.util.Arrays;

//How do you reverse a given string in place -- Two pointer approach
public class reverseAString {
    public static void main(String args[]){
        String str = "hello";
        char temp;
        char[] c = str.toCharArray();
        int len = str.length();
        for(int i=0, j=len-1;i<len && j>=0;i++,j--) {
            if (i == j) {
            } else if (i > j) {
                break;
            } else {
                temp = c[i];
                c[i] = c[j];
                c[j] = temp;
            }
        }
        System.out.println("Reversed inplace string -- >"+ Arrays.toString(c));
    }
}
