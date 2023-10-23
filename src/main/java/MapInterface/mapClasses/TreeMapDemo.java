package MapInterface.mapClasses;

import java.util.TreeMap;

public class TreeMapDemo {
    //sorting based on key
    //DS : Red black algorithm

    public static void main(String args[]) {
        TreeMap tm = new TreeMap();
        tm.put(2,"Kavitha");
        tm.put(1,"SNK");
        tm.put(5,"Vaishnavi");
        tm.put(3,"Vignesh");
        tm.put(4,"Haritha");

        System.out.println("Tree map initial -- "+tm);

        //1. ceilingEntry
        System.out.println("Ceiling entry -- "+tm.ceilingEntry(3));

        //2. ceilingKey
        System.out.println("Ceiling key -- "+tm.ceilingKey(5));

        //3. descendingKeyset
        System.out.println("descending keyset --"+tm.descendingKeySet());

        //4. descendingMap
        System.out.println("Descending map -- "+tm.descendingMap());

        //5.entry set
        System.out.println("Entry set -- "+tm.entrySet());

        //6.firstEntry
        System.out.println("First entry -- "+tm.firstEntry());

        //17. firstKey
        System.out.println("first key -- "+tm.firstKey());

        //18. floorEntry
        System.out.println("floor Entry -- "+tm.floorEntry(3));

        //19.floorKey
        System.out.println("floor key -- "+tm.floorKey(2));

        //20. lowerKey, lowerEntry

        //21. remove

        //22. replace, replaceAll

        //23. subMap

        //24.tailMap

        //25. headMap

        //26. higherKey, higherEntry

        //27. lastKey, lastEntry

        //28. pollKey, pollEntry

    }
}
