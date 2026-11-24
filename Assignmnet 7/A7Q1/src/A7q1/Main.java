package A7q1;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}

class BinarySearchTree {
    Node root;

    Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }

        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }

        return root;
    }

    Node findSuccessor(Node root, int key) {
        Node current = root;
        Node successor = null;

        while (current != null) {
            if (key < current.data) {
                successor = current;
                current = current.left;
            } else if (key > current.data) {
                current = current.right;
            } else {
                if (current.right != null) {
                    current = current.right;

                    while (current.left != null) {
                        current = current.left;
                    }

                    return current;
                }

                return successor;
            }
        }

        return null;
    }
}

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        int[] values = {20, 10, 30, 5, 15, 25, 35, 13, 17};

        for (int value : values) {
            bst.root = bst.insert(bst.root, value);
        }

        int key = 15;

        Node result = bst.findSuccessor(bst.root, key);

        if (result != null) {
            System.out.println("Successor of " + key + " is " + result.data);
        } else {
            System.out.println("Successor does not exist");
        }
    }
}
