package Inheritance.Interfaces;

interface test1{
    void m1();
}

interface test2{
    void m2();
}

public class MultipleInterfacesByClass implements test1,test2{

    public static void main(String[] args) {
       MultipleInterfacesByClass obj = new MultipleInterfacesByClass();
       obj.m1();
       obj.m2();
    }

    @Override
    public void m1() {
        System.out.println("From test1 interface");
    }

    @Override
    public void m2() {
        System.out.println("From test2 interface");
    }


}
