package Inheritance.MultipleInheritance;

class GrandParents {
    void CallBy(){
        System.out.println("Grandpa");
    }
}

class Aunty extends GrandParents{
    void callBy(){
        System.out.println("Grandpa's Daughter");
    }
}

class Uncle extends GrandParents{
    void callBy(){
        System.out.println("Grandpa's Son");
    }
}

// compiler doesn't know which class method to call - so multiple inheritabxe is not supported

//public class Example2DiamondProblem extends Aunty, Uncle {
//    public static void main(String args[]){}
//    Example2DiamondProblem e = new Example2DiamondProblem();
//    e.callBy();
//}
