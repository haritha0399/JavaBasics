package javaCollections.Generic.CursorsDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class cursorsDemo {
    public static void main(String args[]){

        //Cursor
        //Use to get each object and perform modifications or actions

        String str[] = {"Haritha", "Vaishnavi", "Gokul","Praneet"};
        for (String s:str) {
            System.out.print(s+" ");
        }

        System.out.println();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");

        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);

        System.out.println("Without Iteration -- "+al);
        for (Integer i:al) {
            System.out.print(i+" ");
        }

        //Drawbacks
        //1. Can't make modifications on each object
        //2. Only forward travesal
        System.out.println();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        //Using Iterator

        ArrayList<Integer> arrList = new ArrayList<Integer>();
       arrList.add(4);
       arrList.add(5);
       arrList.add(6);
       arrList.add(7);
       arrList.add(9);

       Iterator itr = arrList.iterator();

       while(itr.hasNext()){
           System.out.println(itr.next());
           itr.remove();
       }
        System.out.println(arrList);

       boolean checkEmpty = arrList.isEmpty();
        System.out.println(checkEmpty);

        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");

        //Using ListIterator -- Bi-directionalcursor

        ArrayList  arrlist2 = new ArrayList<>();
        arrlist2.add("Hari");
        arrlist2.add("Vaishu");
        arrlist2.add("Gokul");
        arrlist2.add("Praneet");
        arrlist2.add(1);

        ListIterator iitr = arrlist2.listIterator();

        while(iitr.hasNext()){
            if(iitr.next().equals(1)){
            iitr.set("Rohit");}
        }

        System.out.println(arrlist2);

        System.out.println();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");


    }
}
