package MapInterface.mapClasses;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class hashMapDemo {
    public static void main(String args[]){

        //Create hashMap
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1,"Anu");
        hm.put(2,"Vinu");
        hm.put(3,"Haritha");
        hm.put(4,"Kavitha");

        System.out.println("Print hashmap -- "+hm);

        //getKey
        System.out.println("Get key -- "+hm.get(4));

        //get All keys
        System.out.println("All keys -- "+hm.keySet());

        //get all values
        System.out.println("All values -- "+hm.values());

        //get all entries
        System.out.println("All entries -- "+hm.entrySet());

        //containsKey
        System.out.println("Contains Key -- "+hm.containsKey(2));

        //containsValue
        System.out.println("Contains value -- "+hm.containsValue("Kavitha"));

        //compute - remap the values
        hm.compute(2,(key,val) -> (val.concat(" Vihaani")));
        System.out.println("Computed hashmap -- "+hm.entrySet());

        //compute if absent
        hm.computeIfAbsent(5,k-> "Vihaan");
        System.out.println("Compute if absent -- "+hm);

        //compute if present
        hm.computeIfPresent(2,(key, val) ->"Vihani Vignesh");
        System.out.println("compute if present -- "+hm);

        //put & putAll

        //remove
        hm.remove(1);
        System.out.println("After removal of first key -- "+hm);

        //replace & replaceAll
        hm.replace(3,"Haritha Navanee");
        System.out.println("After using replace method -- "+hm);

        //putIfAbsent
        hm.putIfAbsent(1,"Bringing back ANU");
        System.out.println("putIfAbsent method -- "+hm);




    }
}
