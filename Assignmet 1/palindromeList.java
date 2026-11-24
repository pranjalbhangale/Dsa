
public class palindromeList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node reverse(Node head) {

        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node nextNode = curr.next;

            curr.next = prev;

            prev = curr;
            curr = nextNode;
        }

        return prev;
    }

    static boolean isPalindrome(Node head) {

        if (head == null || head.next == null)
            return true;

        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node secondHalf = reverse(slow.next);

        // Step 3: Compare both halves
        Node p1 = head;
        Node p2 = secondHalf;

        boolean flag = true;

        while (p2 != null) {

            if (p1.data != p2.data) {
                flag = false;
                break;
            }

            p1 = p1.next;
            p2 = p2.next;
        }

        slow.next = reverse(secondHalf);

        return flag;
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);

        if (isPalindrome(head))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
