package javaCollections.Generic.MobileCompare;

import java.util.Comparator;

public class comparatorDemo implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        MobileDetails m1 = (MobileDetails) o1;
        MobileDetails m2 = (MobileDetails) o2;

        // want to compare the string use compareTo which returns the int value.
        int result = m1.model.compareTo(m2.model);

        if(result > 0){
            return -1;
        }else if(result < 0) {return +1;}
        else return 0;
//        if(m1.price > m2.price) {
//            return +1;
//        }
//        else if(m1.price < m2.price){
//            return -1;
//        }
//        return 0;
    }
}
