package Programs.DataStructures.BinarySearchTree;


import java.util.ArrayList;
import java.util.List;

class TripletSumLogic {
    public Node createNewNode(int value) {
        Node node = new Node();
        node.data = value;
        node.left = null;
        node.right = null;
        return node;
    }

    public Node insertNode(Node node, int value) {
        if (node == null) {
            return createNewNode(value);
        }
        if (value < node.data) {
            node.left = insertNode(node.left, value);
        } else if (value > node.data) {
            node.right = insertNode(node.right, value);
        }

        return node;
    }

    public boolean checkIfTripletExists(Node node, int sum){

        List<Integer> list = new ArrayList<>();

        inorder(node, list);
        return checkIfTripletExistsUtil(sum,list);

    }

    public void inorder(Node node, List<Integer> list){
        if(node == null){
            return;
        }
        inorder(node.left,list);
        list.add(node.data);
        inorder(node.right, list);
    }

    public boolean checkIfTripletExistsUtil(int sum, List<Integer> list){
        int elementSize = list.size();

        for(int i=0;i<elementSize-2;i++){
            int start = i+1;
            int end = elementSize -1;

            while(start < end){
                int currentSum = list.get(i) + list.get(start) + list.get(end);

                if(currentSum == sum){
                    return true;
                }
                else if(currentSum < sum){
                    start++;
                }
                else{
                    end --;
                }
            }
        }
        return false;
    }
}

public class TripletsSum {
    public static void main(String[] args) {

        TripletSumLogic a = new TripletSumLogic();
        Node root = null;

        //Addition of element
        root = a.insertNode(root, 8);
        root = a.insertNode(root, 15);
        root = a.insertNode(root, 6);
        root = a.insertNode(root, 2);
        root = a.insertNode(root, -8);
        root = a.insertNode(root, 7);

        System.out.println(a.checkIfTripletExists(root, 29));

    }
}
