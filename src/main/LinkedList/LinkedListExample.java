package LinkedList;
public class LinkedListExample {
    public static void main(String[] args) {
        Node head = createLinkedList();
        print(head);
        head = insertNodeAtFirst(head);
        print(head);
        head = insertNodeAtLast(head);
        print(head);
    }
    public static Node createLinkedList() {
        Node FirstNode = new Node(10);
        Node SecondNode = new Node(20);
        Node ThirdNode = new Node(30);
        Node FourthNode = new Node(40);

        FirstNode.next = SecondNode;
        SecondNode.next = ThirdNode;
        ThirdNode.next = FourthNode;
        Node head = FirstNode;
        return head;
    }
    public static Node insertNodeAtFirst(Node head){
        Node newNode = new Node(50);
        newNode.next = head; // newNode is pointing head linkedlist
        head = newNode; // reset to newNode as Head
        return head;
    }
    public static Node insertNodeAtLast(Node head){
        //Traverse
        Node temp = head;
        while(temp != null){
            if(temp.next == null){
                Node newNode = new Node(60);
                temp.next = newNode;
                return head;
            }
            temp = temp.next;
        }
        return head;
    }
    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }
}

