import java.util.Scanner;

public class CircularQueue {

	public static void main(String[] args) {
		Queue cq=new Queue(4);
		Scanner sc= new Scanner(System.in);
		
		int ch=1;
		while(ch!=0) {
			System.out.println("0.EXIT");
			System.out.println("1.Offer");
			System.out.println("2.Poll");
			System.out.println("3.Peek");
			ch=sc.nextInt();
			
			switch(ch) {
			case 1:
				System.out.println("Enter Val");
				int val=sc.nextInt();
				cq.offer(val);
				break;
			case 2:
				System.out.println("Pull : "+ cq.poll());
				break;
			case 3:
				 System.out.println("Peek Ele: "+ cq.peek());
				break;
					
			}
			
		}
	}

}
