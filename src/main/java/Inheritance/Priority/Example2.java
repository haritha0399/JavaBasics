package Inheritance.Priority;

class First{

    public void methodFirst(){
        System.out.println("First Method");
    }
}


class Second extends First{
    public void methodSecond() {
        System.out.println("Second method");
    }
}
public class Example2 {
    public static void main(String args[]){
        Second s = new Second();
        s.methodSecond();

        First f = new First();
        f.methodFirst();

        First ff = new Second();
        ff.methodFirst();

    }
}
