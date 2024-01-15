package Programs.DataStructures.BinarySearchTree;


class Node{
    int data;
    Node left;
    Node right;
}

class BSTMethods{

    public Node createNewNode(int value){
        Node node = new Node();
        node.data = value;
        node.left = null;
        node.right = null;
        return node;
    }

    public Node insertNode(Node node, int value){
        if(node == null){
            return createNewNode(value);
        }
        if(value < node.data){
            node.left = insertNode(node.left, value);
        }
        else if(value > node.data){
            node.right = insertNode(node.right, value);
        }

        return node;
    }

    public Node delete(Node node,int value){
        if(node == null){
            return null;
        }

        //if and else if for traversing
        if(value < node.data){
            node.left = delete(node.left, value);
        }
        else if(value > node.data) {
            node.right = delete(node.right, value);
        }
        else{

            //If there is one or both nodes are empty then the below logic
            if(node.left == null || node.right == null)
            {
                Node temp = null;
                temp = node.left == null ? node.right : node.left;

                if(temp == null ){
                    return null;
                }
                else{
                    return temp;
                }
            }
            else{

                Node successor = getSuccessor(node);
                node.data = successor.data;
                node.right = delete(node.right, node.data);
                return node;
            }
        }
        return node;
    }

    public Node getSuccessor(Node node){

        if(node == null ){
            return null;
        }
        Node temp = node.right;

        while(temp.left !=null){
            temp = temp.left;
        }
        return temp;
    }

    public void inorderTraversal(Node node){
        if(node == null){
            return;
        }

        inorderTraversal(node.left);
        System.out.print(node.data+ " ");
        inorderTraversal(node.right);
    }

    public void preOrderTraversal(Node node){
        if(node == null){
            return;
        }

        System.out.print(node.data+" ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    public void postOrderTraversal(Node node){
        if(node == null){
            return;
        }

        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.data+" ");
    }

    public boolean isNodePresent(Node node, int value){
        if(node == null){
            return false;
        }

        boolean isPresent = false;

        while(node != null){
            if(value < node.data){
                node = node.left;
            }else if(value > node.data){
                node = node.right;
            }else{
                isPresent = true;
                break;
            }
        }
        return isPresent;
    }

    public Node getParentNode(Node node, int value){
        if(node == null){
            return null;
        }

        Node getParent = null;

        while(node != null){
            if(value < node.data){
                //Before shifting catch the parent Node
                getParent = node;
                node = node.left;
            }
            else if(value > node.data){
                getParent = node;
                node = node.right;
            }
            else{
                break;
            }
        }
        return node !=null ? getParent : null;
    }

    public Node getSiblingNode(Node node, int value){
        if(node == null){
            return null;
        }

        Node parentNode = null;

        while(node != null){
            if(value < node.data){
                parentNode = node;
                node = node.left;
            }
            else if(value > node.data){
                parentNode = node;
                node = node.right;
            }else{
                break;
            }
        }


        if(parentNode.left != null && value == parentNode.left.data){return parentNode.right;}
        else if(parentNode.right  != null &&value == parentNode.right.data){ return parentNode.left;}
        return  null;
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
        Node inorderNode = a.getSiblingNode(root, 10);
        if(inorderNode != null){
            System.out.println("Inorder parent node of the value is "+inorderNode.data);
        }else {
            System.out.println("Oops! inorder parent node not found");
        }
    }
}
