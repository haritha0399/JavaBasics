package Inheritance.DefaultMethodsAndInterfaces;
interface Ancestor {

    default void print(){
        System.out.println("From Ancestor class");
    }
}

interface grand extends Ancestor {
//    default void print(){
//        System.out.println("Grand");
//    }
}

interface child extends Ancestor{
//    default void print(){
//        System.out.println("Child");
//    }
}

public class Example4 implements grand, child {
    public static void main(String args[]){
        Example4 ex = new Example4();
        ex.print();
    }

    @Override
    public void print() {
        grand.super.print();

        child.super.print();
    }
}
