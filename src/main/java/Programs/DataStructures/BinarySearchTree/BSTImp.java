package Programs.DataStructures.BinarySearchTree;


class Node{
    int data;
    Node left;
    Node right;
}

class BSTMethods {

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

    public Node delete(Node node, int value) {
        if (node == null) {
            return null;
        }

        //if and else if for traversing
        if (value < node.data) {
            node.left = delete(node.left, value);
        } else if (value > node.data) {
            node.right = delete(node.right, value);
        } else {

            //If there is one or both nodes are empty then the below logic
            if (node.left == null || node.right == null) {
                Node temp = null;
                temp = node.left == null ? node.right : node.left;

                if (temp == null) {
                    return null;
                } else {
                    return temp;
                }
            } else {

                Node successor = getSuccessor(node);
                node.data = successor.data;
                node.right = delete(node.right, node.data);
                return node;
            }
        }
        return node;
    }

    public Node getSuccessor(Node node) {

        if (node == null) {
            return null;
        }
        Node temp = node.right;

        while (temp.left != null) {
            temp = temp.left;
        }
        return temp;
    }

    public void inorderTraversal(Node node) {
        if (node == null) {
            return;
        }

        inorderTraversal(node.left);
        System.out.print(node.data + " ");
        inorderTraversal(node.right);
    }

    public void preOrderTraversal(Node node) {
        if (node == null) {
            return;
        }

        System.out.print(node.data + " ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    public void postOrderTraversal(Node node) {
        if (node == null) {
            return;
        }

        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.data + " ");
    }

    public boolean isNodePresent(Node node, int value) {
        if (node == null) {
            return false;
        }

        boolean isPresent = false;

        while (node != null) {
            if (value < node.data) {
                node = node.left;
            } else if (value > node.data) {
                node = node.right;
            } else {
                isPresent = true;
                break;
            }
        }
        return isPresent;
    }

    public Node getParentNode(Node node, int value) {
        if (node == null) {
            return null;
        }

        Node getParent = null;

        while (node != null) {
            if (value < node.data) {
                //Before shifting catch the parent Node
                getParent = node;
                node = node.left;
            } else if (value > node.data) {
                getParent = node;
                node = node.right;
            } else {
                break;
            }
        }
        return node != null ? getParent : null;
    }

    public Node getSiblingNode(Node node, int value) {
        if (node == null) {
            return null;
        }

        Node parentNode = null;

        while (node != null) {
            if (value < node.data) {
                parentNode = node;
                node = node.left;
            } else if (value > node.data) {
                parentNode = node;
                node = node.right;
            } else {
                break;
            }
        }


        if (parentNode.left != null && value == parentNode.left.data) {
            return parentNode.right;
        } else if (parentNode.right != null && value == parentNode.right.data) {
            return parentNode.left;
        }
        return null;
    }

    public Node getInorderParentNode(Node node, int value) {
        if (node == null) {
            return null;
        }

        Node inorderParentNode = null;

        while (node != null) {
            if (value < node.data) {
                inorderParentNode = node;
                node = node.left;
            } else if (value > node.data) {
                node = node.right;
            } else {
                break;
            }
        }
        return node != null ? inorderParentNode : null;
    }

    public Node getInorderSuccessorNode(Node node, int value){
        if (node == null) {
            return null;
        }

        Node inorderSuccessorNode = null;

        while (node != null) {
            if (value < node.data) {
                inorderSuccessorNode = node;
                node = node.left;
            } else if (value > node.data) {
                node = node.right;
            } else {
                if(node.right != null){
                    inorderSuccessorNode = getSuccessor(node);
                }
                break;
            }
        }
        return node != null ? inorderSuccessorNode : null;
    }

    Node prev = null;
    public boolean isBSTree(Node node){
        if(node == null){
            return true;
        }

        if(!isBSTree(node.left)){
            return false;
        }

        if(prev !=null && prev.data > node.data){
            return false;
        }

        prev = node;

        return isBSTree(node.right);
    }

    public int getDifference(Node node){
        if(node == null){
            return 0;
        }

        return node.data - getDifference(node.left) - getDifference(node.right);
    }

    public int getMax(Node node){
        if(node == null){
            System.out.println("Tree is empty");
            return 0;
        }

        while(node.right != null){
            node = node.right;
        }

        return node.data;
    }

    public int getMin(Node node){
        if(node == null){
            return 0;
        }
        while(node.left !=null){
            node = node.left;
        }

        return node.data;
    }
}


public class BSTImp {
    public static void main(String[] args) {
        BSTMethods a = new BSTMethods();
        Node root = null;

        //Addition of element
        root = a.insertNode(root, 8);
        root = a.insertNode(root, 3);
        root = a.insertNode(root, 6);
        root = a.insertNode(root, 10);
        root = a.insertNode(root, 4);
        root = a.insertNode(root, 7);;
        root = a.insertNode(root, 1);
        root = a.insertNode(root, 14);
        root = a.insertNode(root, 13);

        System.out.println();
        System.out.println("Is it a BST ?? "+a.isBSTree(root));

        //Deletion of element
        root = a.delete(root, 1);
        root = a.delete(root, 14);

        //Inorder traversal - Left root right
        System.out.println("In-order Trvaseral");
        a.inorderTraversal(root);
        System.out.println();

        //Preorder traversal - Root, left, right
        System.out.println("Pre-order Trvaseral");
        a.preOrderTraversal(root);
        System.out.println();

        //Posteorder traversal - Left right root
        System.out.println("Post-order Trvaseral");
        a.postOrderTraversal(root);
        System.out.println();

        //Find the element in the BST
        System.out.println("Have I got the element I searched for "+ a.isNodePresent(root,3));

        //Find the parent node of the given value / node
        System.out.println();
        Node parentNode = a.getParentNode(root, 8);
        if(parentNode != null){
            System.out.println("Parent node of the value is "+parentNode.data);
        }else {
            System.out.println("Oops! Parent node not found");
        }

        //To find the sibling
        System.out.println();
        Node siblingNode = a.getSiblingNode(root, 10);
        if(siblingNode != null){
            System.out.println("Sibling node of the value is "+siblingNode.data);
        }else {
            System.out.println("Oops! Sibling node not found");
        }

        //To find the inorder parent
        System.out.println();
        Node inorderNode = a.getInorderParentNode(root, 3);
        if(inorderNode != null){
            System.out.println("Inorder parent node of the value is "+inorderNode.data);
        }else {
            System.out.println("Oops! inorder parent node not found");
        }


        //To get the inorder successor
        System.out.println();
        Node inorderSuccessorNode = a.getInorderSuccessorNode(root, 6);
        if(inorderSuccessorNode != null){
            System.out.println("Inorder successor node of the value is "+inorderSuccessorNode.data);
        }else {
            System.out.println("Oops! inorder successor node not found");
        }

        System.out.println();
        System.out.println("Get Difference even odd values "+a.getDifference(root));

        //Get the max node
        System.out.println();
        System.out.println("Get the maximum node value "+a.getMax(root));

        //Get the min node
        System.out.println();
        System.out.println("Get the minimum node value "+a.getMin(root));

    }
}
