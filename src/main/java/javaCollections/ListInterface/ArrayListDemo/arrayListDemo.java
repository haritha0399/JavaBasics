package javaCollections.ListInterface.ArrayListDemo;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayListDemo {

    public static void main(String args[]){

        //1.Create an arrayList
        ArrayList arr1 = new ArrayList();

        //2.Add elements to arrayList
        arr1.add(1);
        arr1.add("Haritha");
        arr1.add(2);
        arr1.add("Vaishnavi");

        //3.Size of the arrayList
        System.out.println(arr1.size());

        //4. Add an element at the index
        arr1.add(4, 3);
        arr1.add(3,"Kavitha");

        //Print the array
        System.out.println(arr1);

        //5. Remove the element
        arr1.remove("Vaishnavi");
        arr1.remove(4);

        System.out.println(arr1);

        //6. fetch particular index value
        System.out.println(arr1.get(0));

        //7. Check if the required element is available
        System.out.println(arr1.contains("Haritha"));

        //8. Set the element in the index
        //Note : add() -> insertion in middle moves the existing element one side right
        //whereas set() -> replaces the existing element with the new one
        System.out.println(arr1.set(0, "SNK"));
        System.out.println(arr1);

        //9.Get the index of the element
        System.out.println(arr1.indexOf("SNK"));

        //10. Copy of one arrayList to another
        ArrayList originalList = new ArrayList();
        originalList.add("Happy");
        originalList.add("Coding");
        originalList.add("Copy to another arrayList");

        ArrayList copyList = new ArrayList();
        copyList.addAll(originalList);

        System.out.println("+++CopyArrayList++"+copyList);


        //11. Use of addAll from index
        ArrayList thirdList = new ArrayList();
        thirdList.add(1);
        thirdList.add(2);
        thirdList.add(3);
        thirdList.add(4);

        thirdList.addAll(2,originalList);
        System.out.println(thirdList);;

        //12. Get the sublist
        List forthList ;
        forthList = thirdList.subList(0,2);
        System.out.println(forthList);

        //13. lastIndexOf()
        System.out.println(thirdList.lastIndexOf(4));

        //14. removeAll()
        System.out.println(thirdList.removeAll(originalList));
        System.out.println(thirdList);

        //15. clear
        originalList.clear();
        System.out.println("Removes all the values -->"+originalList.isEmpty());




    }
}
