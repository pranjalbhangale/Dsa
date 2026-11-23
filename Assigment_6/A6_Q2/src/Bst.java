import java.util.Stack;

public class Bst {
	private Node root;

	static class Node {

		int data;
		Node left;
		Node rigth;

		Node(int val) {
			data = val;
			left = null;
			rigth = null;
		}
	}

	public Bst() {
		root = null;
	}

	public Node addNode(int val) {
		Node node = new Node(val);
		if (root == null) {
			root = node;
			return node;
		} else {
			Node trav = root;
			while (true) {
				if (trav.data > val) {
					if (trav.left == null) {
						trav.left = node;
						return trav.left;
					} else
						trav = trav.left;
				} else {
					if (trav.rigth == null) {
						trav.rigth = node;
						return node;
					} else
						trav = trav.rigth;
				}

			}

		}
	}

	public Node get(int val) {

		Node trav = root;
		while (trav != null) {
			if (trav.data == val) {
				return trav;
			}
			if (trav.data > val) {

				trav = trav.left;
			} else {

				trav = trav.rigth;
			}

		}
		return trav;

	}

	public int depth(Node node) {
		
		if(node==null) {
			return 0;
		}
		int left=depth(node.left);
		int right=depth(node.rigth);
		return Math.max(left, right) + 1;
	}
	public void preOrder(Node root) {
		Stack<Node> st=new Stack<>();
		
		if(root==null)
			return ;
		else {
			Node trav=root;
			st.push(trav);
			while(!st.isEmpty()) {
				
				trav=st.pop();
				System.out.print(trav.data+"  ");
				if(trav.rigth!=null) {
					st.push(trav.rigth);
				}
				if(trav.left!=null) {
					st.push(trav.left);
				}
			}
		}
	}
	
	public void inOrder(Node root) {
		Stack<Node> st=new Stack<>();
		
		if(root==null)
			return ;
		else {
			Node curr=root;
		
			while(curr!=null ||!st.isEmpty()) {
				
				while (curr!=null) {
					st.push(curr);
					curr=curr.left;
				}
				
				curr=st.pop();
				System.out.print(curr.data+"  ");
				
				curr=curr.rigth;
				
				
			}
		}
	}
	public void postOrder(Node root) {
		Stack<Node> st=new Stack<>();
		
		if(root==null)
			return ;
		else {
			Node curr=root;
		
			while(curr!=null ||!st.isEmpty()) {
				
				while (curr!=null) {
					st.push(curr);
					curr=curr.left;
				}
				
				curr=st.pop();
				System.out.print(curr.data+"  ");
				
				curr=curr.rigth;
				
				
			}
		}
	}
	public void inOrder() {
		System.out.println("\nInOrder:  ");
		inOrder(root);
	}
	public void preOrder() {
		System.out.println("\npreOrder:  ");
		preOrder(root);
	}
}
