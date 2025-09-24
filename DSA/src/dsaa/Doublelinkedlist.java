package dsaa;

class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = this.next = null;
    }
}
public class Doublelinkedlist{
    Node head;
    void insertAtBeginning(int data) {
    Node newNode = new Node(data);
    if (head != null) {
        newNode.next = head;
        head.prev = newNode;
        }
         head = newNode;
    }
    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }
    void deleteFromBeginning() {
        head = head.next;
        head.prev = null;
    }
    void deleteFromEnd() {
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.prev.next = null;
    }
    void displayForward() {
        Node temp = head;
        System.out.print("Elements: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Doublelinkedlist dll = new Doublelinkedlist();

        dll.insertAtBeginning(10);
        dll.insertAtBeginning(20);
        dll.insertAtEnd(5);
        dll.insertAtEnd(1);

        dll.displayForward();   // 20 10 5 1

        dll.deleteFromBeginning();  // removes 20
        dll.deleteFromEnd();        // removes 1

        dll.displayForward();   // 10 5
    }
}