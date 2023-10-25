package Programs.Strings;

import java.util.Arrays;

//How do you check if two strings are anagrams of each other?
public class twoStringsAreAnagrams {
    public static void main(String args[]) {

        int flag =0;
        String s1 = "car";
        String s2 = "rac";

        if (s1.length() == s2.length()){
            char[] c1 = s1.toCharArray();
            char[] c2 = s2.toCharArray();

            Arrays.sort(c1);
            Arrays.sort(c2);

            for(int i=0;i<s1.length();i++){
                flag = 0;
                if(c1[i] != c2[i]){
                    flag =1;
                    break;
                }
            }
            if(flag == 0){
                System.out.println("Given strings are anagram...");
            }
            else {
                System.out.println("Given strings are NOT anagrams ...");
            }
        }
    }
}
