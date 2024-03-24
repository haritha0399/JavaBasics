package Inheritance.DefaultMethodsAndInterfaces;


interface TestInterface2{

    public void value(int a);
    //default method
    static void defaultMethod(){
        System.out.println("Static Default methof from Interface");
    }
}


public class Example2 implements TestInterface2{

    public static void main(String args[]){
        Example1 e = new Example1();
        e.value(5);
        TestInterface2.defaultMethod();
    }


    @Override
    public void value(int a) {
        System.out.println("Square of "+a*a);
    }
}
