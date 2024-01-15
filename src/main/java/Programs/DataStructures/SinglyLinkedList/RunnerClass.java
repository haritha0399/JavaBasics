package Programs.DataStructures.SinglyLinkedList;

public class RunnerClass {
    public static void main(String args[]){

        SinglyLinkedList list = new SinglyLinkedList();
        list.insert(5);
        list.insert(10);
        list.insert(15);
        list.insert(20);
        list.insert(25);

        list.insertAtStart(0);

        list.insertAtIndex(2,44);

        list.deleteAt(2);

        list.showElementsFromSinglyLinkedList();
    }
}
