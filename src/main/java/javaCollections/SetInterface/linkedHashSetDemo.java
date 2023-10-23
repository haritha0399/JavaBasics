package javaCollections.SetInterface;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class linkedHashSetDemo {

    public static void main(String args[])
    {
        //Maintain the order and remove duplicates
        LinkedList li = new LinkedList();
        li.add(100);
        li.add(50);
        li.add(50);
        li.add(90);
        li.add(59);

        System.out.println("Maintain the insertion order with duplicates --"+li);

        LinkedHashSet hs = new LinkedHashSet<>(li);
        System.out.println("Maintain insertion order and no duplicates -- "+hs);

        //convert to array
        li.toArray();
        System.out.println("Array --"+li);

        LinkedHashSet hs1 = new LinkedHashSet();

        //1.add
        hs1.add(1);
        hs1.add(20);
        hs1.add(20);
        hs1.add(54);
        hs1.add(100);
        hs1.add(50);

        System.out.println(hs1);

        //2. size
        System.out.println(hs1.size());

        //Note: Methods available in hashset are also available to LinkedHashSet
    }
}
