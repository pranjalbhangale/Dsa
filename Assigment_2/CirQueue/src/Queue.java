
public class Queue {
	int SIZE;
	int cnt;
	int front;
	int rear;
	int arr[];
	public Queue(int size) {
		SIZE=size;
		front=rear=-1;
		cnt=0;
		arr=new int[SIZE];
	}
	public void offer(int val) {
		if(cnt==SIZE) {
			System.out.println("Queue is FULL");
			return;
		}
		else {
			rear=(++rear)%SIZE;
			arr[rear]=val;
			cnt++;
			
		}
	}
	public int poll() {
		if(cnt==0) {
			System.out.println("Queue is Empty");
			return -1;
		}
		else {
			cnt--;
			front=(++front)%SIZE;
			return arr[front];
		}
	}
	public int peek() {
		if(cnt==0) {
			System.out.println("Queue is Empty");
			return -1;
		}
		else {
			
			return arr[(front+1)%SIZE];
		}
	}
}
