package javaCollections.ListInterface.LinkedListDemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class linkedListDemo {
    public static void main(String args[]){
        LinkedList list = new LinkedList();

        //1. add
        list.add(1);
        list.add(2);
        list.add(3);

        //2. add at the index
        list.add(3, 4);

        //3. addAll
        LinkedList list2 = new LinkedList();
        list2.addAll(list);
        System.out.println(list2);

        //4. addAll of the specified index
        LinkedList list3 = new LinkedList<>();
        list3.add("I'm");
        list3.add("in");
        list3.add("the");
        list3.add("middle");

        list.addAll(2,list3);
        System.out.println("++Insertion in the middle++ --> "+list);

        //5. addFirst
        list.addFirst("I'm the first");

        //6. addLast
        list.addLast("I'm the last");

        System.out.println("After first & last methods -->"+list);

        //7. clear - removes all the elements form the list

        //8. Contains
        boolean res = list3.contains("in");
        System.out.println(res);

        //9. element
        System.out.println("get the first element of the list --> "+list.element());

        //10. get(index)
        System.out.println(list.get(3));

        //11. getFirst
        System.out.println("Get the first --"+list.getFirst());

        //12. getLast
        System.out.println("Get the last --"+list.getLast());

        //13. descending iterator
        Iterator itr =  list3.descendingIterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        //14. indexOf
        System.out.println("Index of -- "+list3.indexOf("the"));

        //15. lastIndexOf
        System.out.println("Last index of -- "+list3.lastIndexOf("middle"));

        //16. listInterator
        ListIterator itr1 =  list3.listIterator();

        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }

        //17. offer - adds to the last
        LinkedList list4 = new LinkedList<>();
        list4.add("cbe");
        list4.add("chennai");
        list4.offer("Tenkasi");
        System.out.println(list4);

        //18. offerFirst & offerLast
        list4.offerFirst("Kerala");
        list4.offerLast("Kanyakumari");
        System.out.println("After offer first & last methods --"+list4);

        //19. peek
        LinkedList list5 = new LinkedList();
        list5.add(1);
        list5.add(2);
        list5.add(3);
        System.out.println("Peek the first element --"+list5.peek());

        //20. peekFirst & peekLast
        System.out.println(list5.peekFirst());
        System.out.println(list5.peekLast());

        //21. poll
        LinkedList list6 = new LinkedList();
        list6.add("a");
        list6.add("b");
        list6.add("c");
        System.out.println("Poll --"+list6.poll());
        System.out.println("Poll first -- "+list6.pollFirst());
        System.out.println("Poll last -- "+list6.pollLast());

        //22. push , pop
        list6.push("new");
        list6.push("one");
        list6.push(1);

        list6.pop();

        //23. remove
        System.out.println(list6.remove(1));

        //24. removeFirst
        System.out.println(list6.removeFirst());

        //25. removeLast
//        System.out.println(list6.removeLast());


        //26. firstOccurance
        LinkedList list7 = new LinkedList();
        list7.add("a");
        list7.add("p");
        list7.add("p");
        list7.add("l");
        list7.add("e");

        System.out.println("First occurance -- "+list7.removeFirstOccurrence("p"));
        System.out.println("last occurance -- "+list7.removeFirstOccurrence("l"));

        //27. set , size , toArray
        list.set(2,"second one");
        System.out.println(list.size());
    }
}
