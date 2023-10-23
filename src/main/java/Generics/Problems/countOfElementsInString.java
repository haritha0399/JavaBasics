package Generics.Problems;

import java.util.*;

public class countOfElementsInString {

    public static void main(String args[]){
        String s1 = "pineapple";
        HashMap<Character, Integer> hs = new HashMap<Character, Integer>();
        char strArr[] = s1.toCharArray();
        for (char c:strArr) {

            if(hs.containsKey(c)){
                hs.put(c,hs.get(c)+1);
            }
            else {
                hs.put(c,1);
            }
        }

        System.out.println(hs);

        Set<Map.Entry<Character, Integer>> se = hs.entrySet();

        LinkedList li = new LinkedList();

        for (Map.Entry<Character, Integer> m:se) {
            if(m.getValue() == 1){
                System.out.println(m.getKey() + "-" +m.getValue());
                li.add(m.getKey());
            }
        }

        System.out.println("Unique elements in the string -- "+li);

    }
}
