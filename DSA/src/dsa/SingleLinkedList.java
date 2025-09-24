package dsa;


class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class SingleLinkedList{
    Node head;
    void insertatbegin(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    void insertatend(int data){
        Node newNode = new Node(data);
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    void insertatposition(int pos,int data){
        Node newNode = new Node(data);
        Node temp = head;
        for(int i = 1;i < pos;i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    void deleteatbegin(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }
    void deleteatend(){
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
    }
    void deleteatposition(int pos){
        Node temp = head;
        for (int i = 1;i < pos-1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }
    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        SingleLinkedList newlist = new SingleLinkedList();
        newlist.insertatbegin(5);
        newlist.insertatbegin(10);
        newlist.insertatend(15);
        newlist.display();
        newlist.insertatposition(2,20);
        newlist.display();
        System.out.println("Delete at begin: ");
        newlist.deleteatbegin();
        newlist.display();
        System.out.println("Delete at end: ");
        newlist.deleteatend();
        newlist.display();
        System.out.println("Delete at pos: ");
        newlist.deleteatposition(2);
        newlist.display();
    }}

