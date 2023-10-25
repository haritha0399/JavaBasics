package Programs.Strings;

import java.sql.SQLOutput;
import java.util.*;

//How do you print duplicate characters from a string?
public class duplicateCharactersInString {
    public static void main(String args[]){
        String str = "apple";
        char c[] = str.toCharArray();
        HashMap<Character, Integer> hm = new HashMap<Character,Integer>();

        for(int i=0;i<str.length();i++){

            if(hm.containsKey(c[i])){
                hm.put(c[i],hm.get(c[i])+1);
            }
            else{
                hm.put(c[i],1);
            }
        }


        Set<Map.Entry<Character, Integer>> se = hm.entrySet();

        LinkedList li = new LinkedList();

        for (Map.Entry<Character, Integer> m:se) {
            if(m.getValue() > 1){
                System.out.println(m.getKey() + "-" +m.getValue());
                li.add(m.getKey());
            }
        }

        //to convert to string
        String s = "";
        Iterator itr = li.iterator();
        while(itr.hasNext()){
            s = s+itr.next();
        }
        System.out.println(s);
    }
}
