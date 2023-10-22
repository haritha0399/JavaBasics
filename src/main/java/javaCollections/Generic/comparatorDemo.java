package javaCollections.Generic;

import java.util.Comparator;

public class comparatorDemo implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {

        //typecast
        String s1 = o1.toString();
        String s2 = o2.toString();

        if(s1.length() > s2.length()) {return +1;}
        else if(s1.length() < s2.length()) {return -1;}
        return 0;
    }
}
