package javaCollections.SetInterface;

import java.util.HashSet;
import java.util.Iterator;

public class hashSetDemo {

    public static void main(String args[]){
        HashSet hs1 = new HashSet();

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

        //3. contains
        System.out.println("Contains check --"+hs1.contains(20));

        //4. Iterator
        Iterator itr = hs1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        //5. clear
        hs1.clear();

        //6. isEmpty
        boolean result = hs1.isEmpty();
        System.out.println(result);
    }
}
