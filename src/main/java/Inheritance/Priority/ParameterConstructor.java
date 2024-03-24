package Inheritance.Priority;

class BaseTest {
    int x;

    BaseTest(int x){
        this.x = x;
    }
}

class SubTest extends BaseTest{
    int y;
    SubTest(int x, int y){
        super(x);

this.y = y;
    }

    void Display(){
        System.out.println("x-- "+x+" y-- "+y);
    }
}

public class ParameterConstructor {
    public static void main(String args[]){
        SubTest obj = new SubTest(10,20);
        obj.Display();
    }
}
