package com.A3;


class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {

    Node head;

    public void addPosition(int data, int pos) {
        if (pos < 1) {
            System.out.println("Invalid position");
            return;
        }

        Node newNode = new Node(data);

        if (head == null) {
            if (pos != 1) {
                System.out.println("Invalid position");
                return;
            }

            head = newNode;
            newNode.next = head;
            return;
        }

        if (pos == 1) {
            Node temp = head;

            while (temp.next != head) {
                temp = temp.next;
            }

            newNode.next = head;
            temp.next = newNode;
            head = newNode;
            return;
        }

        Node temp = head;
        int count = 1;

        while (count < pos - 1 && temp.next != head) {
            temp = temp.next;
            count++;
        }

        if (count != pos - 1) {
            System.out.println("Invalid position");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void deletePosition(int pos) {
        if (head == null || pos < 1) {
            System.out.println("Invalid position");
            return;
        }

        if (pos == 1) {
            if (head.next == head) {
                head = null;
                return;
            }

            Node temp = head;

            while (temp.next != head) {
                temp = temp.next;
            }

            temp.next = head.next;
            head = head.next;
            return;
        }

        Node temp = head;
        int count = 1;

        while (count < pos - 1 && temp.next != head) {
            temp = temp.next;
            count++;
        }

        if (temp.next == head) {
            System.out.println("Invalid position");
            return;
        }

        temp.next = temp.next.next;
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;

        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(back to head)");
    }
}

public class Main {
    public static void main(String[] args) {

        CircularLinkedList list = new CircularLinkedList();

        list.addPosition(10, 1);
        list.addPosition(20, 2);
        list.addPosition(30, 3);
        list.addPosition(40, 4);

        list.display();

        list.addPosition(25, 3);
        list.display();

        list.addPosition(5, 1);
        list.display();

        list.deletePosition(3);
        list.display();

        list.deletePosition(1);
        list.display();
    }
}
