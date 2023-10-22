package javaCollections.Generic.MobileCompare;

import java.util.Arrays;
import java.util.Comparator;

class MobileDetails{
    String model;
    int pixels;
    int price;
    MobileDetails(String model, int pixels, int price ){
        this.model = model;
        this.pixels = pixels;
        this.price = price;
    }

    public static void main(String args[]){

        MobileDetails samsung = new MobileDetails("ABC", 8, 50000);
        MobileDetails vivo = new MobileDetails("XYZ", 16, 18000);
        MobileDetails apple = new MobileDetails("PQR", 32, 98000);

        MobileDetails[] mob = {samsung,vivo,apple};
        Comparator comp = new comparatorDemo();
        Arrays.sort(mob,comp);
        for (MobileDetails m:mob) {
            System.out.println(m);
        }
    }
}