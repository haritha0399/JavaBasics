package javaCollections.ListInterface.LinkedListDemo;

import java.util.LinkedList;

public class linkedListDemo {
    public static void main(String args[]){
        LinkedList list = new LinkedList();

        //1. add
        list.addFirst("FIRST");
        list.addLast("LAST");
        list.add(2);

        //2.Print the list
        System.out.println(list);
    }
}
