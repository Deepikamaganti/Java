package dsaa;

class Nodee{
    int data;
    Nodee next;

    Nodee(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CircularLinkedList {
    Nodee head = null;
    Nodee tail = null;

    // Insert at beginning
    void insertAtBeginning(int data) {
        Node newNode = new Nodee(data);
        if (head == null) { // empty list
            head = tail = newNode;
            tail.next = head; // circular link
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head; // keep circular
        }
    }

    // Insert at end
    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) { // empty list
            head = tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head; // circular link
        }
    }

    // Delete from beginning
    void deleteFromBeginning() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head == tail) { // only one node
            head = tail = null;
        } else {
            head = head.next;
            tail.next = head; // keep circular
        }
    }

    // Delete from end
    void deleteFromEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head == tail) { // only one node
            head = tail = null;
        } else {
            Node temp = head;
            while (temp.next != tail) { // reach 2nd last
                temp = temp.next;
            }
            temp.next = head;
            tail = temp; // update tail
        }
    }

    // Display elements
    void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        System.out.print("Elements: ");
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();

        cll.insertAtBeginning(10);
        cll.insertAtBeginning(20);
        cll.insertAtEnd(5);
        cll.insertAtEnd(1);

        cll.display(); // 20 10 5 1

        cll.deleteFromBeginning(); // removes 20
        cll.deleteFromEnd();       // removes 1

        cll.display(); // 10 5
    }
}
