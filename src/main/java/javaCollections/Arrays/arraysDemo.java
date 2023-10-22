package javaCollections.Arrays;

import java.util.Arrays;

public class arraysDemo {

    public static void main(String args[]){
        //Concepts learnt
        //Primitive data types sorting
        //Primitive - int, float .. Non-Primitive - all class
        //Overloading - sort (primitive data type) & sort (non-primitive data type)

        int[] arr = {1,3,18,4,21,5,8};
        System.out.println("Initail array");
        for (int i:arr) {
            System.out.println(i);
        }

        //To sort the array
        System.out.println("After sorting array");
        Arrays.sort(arr);
        for (int i:arr) {
            System.out.println(i);
        }

        System.out.println("***************************************************");

        //Inheritance concept
        //Object or cosmo Parent class whereas String is child class
        //Arrays.sort(object[]) -< Non-primitive accepts
        String strArr[] = {"Haritha", "Vaishnavi", "Gokul", "Praneet"};
        System.out.println("Initail array");
        for (String i:strArr) {
            System.out.println(i);
        }

        //To sort the array
        System.out.println("After sorting array");
        Arrays.sort(strArr);
        for (String i:strArr) {
            System.out.println(i);
        }

        //Sort using compartor


    }
}
