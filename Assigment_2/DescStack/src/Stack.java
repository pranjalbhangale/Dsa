
public class Stack {
	int[] arr;
	int SIZE;
	int top;
	Stack(int size){
		SIZE=size;
		top=SIZE;
		arr=new int[SIZE];
	}
	public void push(int val) {
		if(top==0) {
			System.out.println("Stack is full");
			return;
		}else {
		arr[--top]=val;
		System.out.println("Curr index :"+top);
		}
	}
	
	public int pull() {
		if(top==SIZE) {
			System.out.println("Stack is Empty");
			return -1;
		}
		
		return arr[top++];
	}
	public int peek() {
		if(top==SIZE) {
			System.out.println("Stack is Empty");
			return -1;
		}
		
		return arr[top];
	}
	

}
