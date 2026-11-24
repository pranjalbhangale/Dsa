
public class MaxHeap {
	private int SIZE;
	private int[] arr;

	public MaxHeap(int len) {
		SIZE = -1;
		arr = new int[len -1];
	}

	public void add(int key) {
		if(isFull())
			return;
		arr[++SIZE] = key;

		int ci = SIZE;
		int pi = (ci - 1) / 2;
		while (ci > 0) {
			if (arr[pi] > arr[ci])
				break;
			int temp = arr[pi];
			arr[pi] = arr[ci];
			arr[ci] = temp;
			ci = pi;
			pi = (ci - 1) / 2;

		}

	}

	public int remove() {
		if(isEmpty())
			return -1;
		int del = arr[0];
		arr[0] = arr[SIZE--];
		int pi = 0;
		int ci = (pi * 2)+1;
		
		//till left child exists
		while (ci <= SIZE) {
			//handle if rigth child is absend
			if (ci + 1 <= SIZE)
				ci = arr[ci] > arr[ci + 1] ? ci : ci + 1;
			
				// exits when root is on vaid pos
			if(arr[ci]<arr[pi])
				break;
			//swaping root with max child
			int temp = arr[pi];
			arr[pi] = arr[ci];
			arr[ci] = temp;
			
			//incrementing pi to vaild subtree root and ci to its left child
			pi=ci;
			ci=(pi*2)+1;

	}
		return del;

	}
	public boolean isEmpty() {
		return SIZE==-1;
	}
	public boolean isFull() {
		return SIZE==arr.length-1;
	}
	public int maxEle() {
		return arr[0];
	}
}
