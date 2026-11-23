
public class TreeDepth {

	public static void main(String[] args) {
		Bst bt=new Bst();
		bt.addNode(10);
		bt.addNode(9);
		bt.addNode(8);
		bt.addNode(12);
		bt.addNode(16);
		bt.addNode(15);
		bt.addNode(11);
		bt.addNode(13);
		
		Bst.Node n=bt.get(11);
		
		int level = bt.depth(n);
		System.out.println("Level: "+ level);
		bt.preOrder();
		bt.inOrder();
	}

}
