package Inheritance.DefaultMethodsAndInterfaces;

interface TestInterface1{

    public void value(int a);
    //default method
   default void defaultMethod(){
        System.out.println("Default methof from Interface");
    }
}


public class Example1 implements TestInterface1{

    public static void main(String args[]){
        Example1 e = new Example1();
        e.defaultMethod();
        e.value(5);
    }


    @Override
    public void value(int a) {
        System.out.println("Square of "+a*a);
    }
}
