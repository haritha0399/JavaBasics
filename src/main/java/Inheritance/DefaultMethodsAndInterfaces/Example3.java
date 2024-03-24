package Inheritance.DefaultMethodsAndInterfaces;

interface TestInter1{

    default void show(){
        System.out.println("Inter1");
    }
}

interface TestInter2{
    default void show(){
        System.out.println("Inter2");
    }
}

public class Example3 implements TestInter1, TestInter2{
    public static void main(String args[]){
        Example3 e = new Example3();
        e.show();
    }

    @Override
    public void show() {
        TestInter1.super.show();

        TestInter2.super.show();
    }


}
