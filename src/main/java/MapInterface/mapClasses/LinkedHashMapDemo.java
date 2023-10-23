package MapInterface.mapClasses;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String args[]){
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer,String>();
        lhm.put(1,"One");
        lhm.put(4,"Four");
        lhm.put(2,"Two");
        lhm.put(3,"Three");

        System.out.println("First map -- "+lhm);

        LinkedHashMap lhm2 = new LinkedHashMap();
        lhm2.putAll(lhm);
        System.out.println("Second map -- "+lhm2);

        System.out.println("Get method -- "+lhm.get(1));

        lhm.replaceAll((k,v)-> v.toUpperCase());
        System.out.println("After replaceAll method -- "+lhm);
    }
}
