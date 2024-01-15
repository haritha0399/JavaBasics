package Programs.DataStructures.SinglyLinkedList;


public class SinglyLinkedList {

    //Making it as head node
    Node head;

    public void insert(int data) {
        Node node = new Node();
        node.data = data;

        //if it is a first node then take it as head
        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

        public void showElementsFromSinglyLinkedList(){
        //Temp element to point to the head
            Node n = head;

            //Traverse until the address of the node is null
            while(n.next!=null){
                System.out.print(n.data+ " ");

                //To shift to the next element
                n = n.next;
            }
            System.out.print(n.data+" ");
        }

        public void insertAtStart(int data){

            Node node = new Node();
            node.data = data;
            node.next = head;

            head = node;
        }

        public void insertAtIndex(int index, int data){

        if(index==0){
            insertAtStart(data);
        }else {
            Node node = new Node();
            node.data = data;

            //Whenever starting from head
            Node n = head;

            //Traverse
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }

            //take n as  exiting node & node as newly inserted node

            node.next = n.next;
            n.next = node;
        }
        }

        public void deleteAt(int index){

        if(index == 0){
            head = head.next;
        }
        else{
            Node n = head;
            Node n1 = null;
            for(int i=0;i<index-1;i++){
                //To move forward
                n = n.next;
            }

            n1 = n.next;
            n.next = n1.next;
            n1 = null;
        }
        }
    }
