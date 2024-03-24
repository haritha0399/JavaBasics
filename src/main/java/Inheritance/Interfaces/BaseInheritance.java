package Inheritance.Interfaces;

class School{
    public void students(){
        System.out.println("It's a co-ed school");
    }
}
public class BaseInheritance extends School{
    public static void main(String[] args) {
        BaseInheritance obj = new BaseInheritance();
        obj.students();
    }
}

