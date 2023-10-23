package javaCollections.Generic.MobileCompare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class MobileDetails{
    String model;
    int pixels;
    int price;

    public String toString(){
        return " "+this.price + " "+ this.model + " "+this.pixels;
    }
    MobileDetails(String model, int pixels, int price ){
        this.model = model;
        this.pixels = pixels;
        this.price = price;
    }

    public static void main(String args[]){

        MobileDetails samsung = new MobileDetails("ABC", 8, 50000);
        MobileDetails vivo = new MobileDetails("XYZ", 16, 18000);
        MobileDetails apple = new MobileDetails("PQR", 32, 98000);

        ArrayList arr = new ArrayList();
        arr.add(samsung);
        arr.add(vivo);
        arr.add(apple);

        //normal sort
       // Collections.sort(arr); -> objects cant be sorted so it shows classcastException
        System.out.println(arr);

        Comparator comp = new comparatorDemo();

        //sort using comparator
        Collections.sort(arr,comp);
        System.out.println(arr);

        //reverse
        Collections.reverse(arr);
        System.out.println(arr);
    }
}