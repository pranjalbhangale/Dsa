
public class HeapTest {

	public static void main(String[] args) {
		int h;
		MaxHeap heap=new MaxHeap(7);
		heap.add(3);
		heap.add(2);
		heap.add(1);
		heap.add(8);
		heap.add(5);
		heap.add(4);
			System.out.println("Heap");
		System.out.println(heap.remove());
		System.out.println(heap.remove());
		System.out.println(heap.remove());
		System.out.println("Heap Root");
		System.out.println(heap.maxEle());
		System.out.println(heap.maxEle());
		System.out.println(heap.maxEle());

	}

}
