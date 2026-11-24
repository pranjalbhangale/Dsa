

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

    Node delete(Node root, int key) {
        if (root == null) {
            return null;
        }

        if (key < root.data) {
            root.left = delete(root.left, key);
        } else if (key > root.data) {
            root.right = delete(root.right, key);
        } else {
            if (root.left == null) {
                return root.right;
            }

            if (root.right == null) {
                return root.left;
            }

            Node successor = findMin(root.right);
            root.data = successor.data;
            root.right = delete(root.right, successor.data);
        }

        return root;
    }

    Node findMin(Node root) {
        while (root.left != null) {
            root = root.left;
        }

        return root;
    }

    void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
}

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        int[] values = {50, 30, 70, 20, 40, 60, 80};

        for (int value : values) {
            bst.root = bst.insert(bst.root, value);
        }

        System.out.print("Before deletion: ");
        bst.inorder(bst.root);

        bst.root = bst.delete(bst.root, 50);

        System.out.print("\nAfter deletion: ");
        bst.inorder(bst.root);
    }
}

