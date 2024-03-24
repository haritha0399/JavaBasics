package Inheritance.Priority;

public class Example3 extends Example1 {

    public void insideClassOne(){
        System.out.println("One");
    }

    public void insideClassTwo(){
        System.out.println("Two");
    }

    public void insideClassThree(){
        System.out.println("Three");
    }

    public static void main(String args[]){
        Example3 ex = new Example3();
        ex.insideClassOne();

    }
}
