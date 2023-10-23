package javaCollections.SetInterface.sortedSetSubInterface.NavigableInterface;

import com.sun.source.tree.Tree;

import javax.swing.tree.TreeCellRenderer;
import java.util.*;

public class TreeSetDemo {

    public static void main(String args[]){

        //Maintain the order and remove duplicates
        LinkedList li = new LinkedList();
        li.add(100);
        li.add(50);
        li.add(50);
        li.add(90);
        li.add(59);

        System.out.println("Maintain the insertion order with duplicates --"+li);

        TreeSet ts1 =  new TreeSet(li);
        System.out.println("Sorted set --"+ts1);

        //sorted set
        //Data Structure -  Balanced Tree
        TreeSet ts =  new TreeSet();
        ts.add("hell0");
        ts.add("girl");
        ts.add("apple");
        ts.add("egg");

        System.out.println("Homogeneous sorted set --" +ts);

        //Note: ClassCastException when using heterogenerous set

        //2. addAll
        TreeSet ts2 = new TreeSet();
        ts2.addAll(ts);
        System.out.println("Copied to another treeset --"+ts2);

        //3. ceiling -- prints the nearest greatest number if no then returns null
        TreeSet ts3 = new TreeSet();
        ts3.add(1);
        ts3.add(100);
        ts3.add(50);
        ts3.add(101);
        ts3.add(100);
        ts3.add(-1);

        System.out.println("Using ceiling fuction --"+ts3.ceiling(45));

       //4. contains
        System.out.println("Contains method --"+ts3.contains(-1));


        //5.descendingIterator
        Iterator itr = ts3.descendingIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        //6. descendingSet
        System.out.println("descendent set --"+ts3.descendingSet());

        //7. first
        System.out.println("first method --"+ts3.first());

        //8. floor
        System.out.println("floor method --"+ts3.floor(5));

        //9. headSet
        System.out.println("Headset method --"+ ts3.headSet(50));

        //10.headset
        System.out.println("Headset method two params --"+ts3.headSet(100, true));

        //11.higher
        System.out.println("Higher than --"+ts3.higher(100));

        //12. isEmpty & iterator

        //13. last
        System.out.println("last method --"+ts3.last());

        //14. lower
        System.out.println("Lowest -- "+ts3.lower(100));

        //15. pollFirst
        System.out.println("Poll first method --"+ts3.pollFirst());

        //16. pollLast
        System.out.println("Poll last method -- "+ ts3.pollLast());

        //17. remove & size

        //18. subset
        System.out.println("subset --"+ts3.subSet(1, 101));
        System.out.println("subset with 4 params -- "+ts3.subSet(1, true, 101, true));

        //19. tailSet
        System.out.println("tailset -- "+ts3.tailSet(50));





    }
}
