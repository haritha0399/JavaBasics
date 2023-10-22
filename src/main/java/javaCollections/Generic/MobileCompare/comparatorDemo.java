package javaCollections.Generic.MobileCompare;

import java.util.Comparator;

public class comparatorDemo implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        MobileDetails m1 = (MobileDetails) o1;
        MobileDetails m2 = (MobileDetails) o2;

        if(m1.price > m2.price) {
            return +1;
        }
        else if(m1.price < m2.price){
            return -1;
        }
        return 0;
    }
}
