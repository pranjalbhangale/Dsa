
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {

    Node head;

    // Insert at beginning
    public void insertFirst(int data) {
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    // Insert at end
    public void insertLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Insert after given data
    public void insertAfter(int key, int data) {
        Node temp = head;

        while (temp != null && temp.data != key) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Data not found");
            return;
        }

        Node newNode = new Node(data);

        newNode.next = temp.next;
        temp.next = newNode;
    }

public void insertSorted(int data) {
    Node newNode = new Node(data);

    if (head == null || data <= head.data) {
        newNode.next = head;
        head = newNode;
        return;
    }

    Node temp = head;

    while (temp.next != null && temp.next.data < data) {
        temp = temp.next;
    }

    newNode.next = temp.next;
    temp.next = newNode;
}


    // Insert before given data
    public void insertBefore(int key, int data) {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node newNode = new Node(data);

        // If key is at head
        if (head.data == key) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null && temp.next.data != key) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Data not found");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Display linked list
    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}

public class Main {
    public static void main(String[] args) {

        SinglyLinkedList list = new SinglyLinkedList();

        list.insertLast(10);
        list.insertLast(20);
        list.insertLast(30);
        list.insertLast(40);

        System.out.println("Original List:");
        list.display();

        list.insertAfter(20, 25);
        System.out.println("After inserting 25 after 20:");
        list.display();

        list.insertBefore(30, 28);
        System.out.println("After inserting 28 before 30:");
        list.display();

        list.insertBefore(10, 5);
        System.out.println("After inserting 5 before head:");
        list.display();
    }
}
