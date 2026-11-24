
public class palindromeTree {

    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    static boolean isMirror(TreeNode a, TreeNode b) {

        if (a == null && b == null)
            return true;

        if (a == null || b == null)
            return false;

        if (a.data != b.data)
            return false;

        return isMirror(a.left, b.right) &&
               isMirror(a.right, b.left);
    }

    static boolean isSymmetric(TreeNode root) {

        if (root == null)
            return true;

        return isMirror(root.left, root.right);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(2);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);

        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        if (isSymmetric(root))
            System.out.println("Palindrome / Symmetric Tree");
        else
            System.out.println("Not Palindrome / Not Symmetric Tree");
    }
}
