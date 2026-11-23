import java.util.Scanner;



public class StackTest {

	public static void main(String[] args) {
		Stack s=new Stack(4);
		Scanner sc= new Scanner(System.in);
		
		int ch=1;
		while(ch!=0) {
			System.out.println("0.EXIT");
			System.out.println("1.Push");
			System.out.println("2.Pull");
			System.out.println("3.Peek");
			ch=sc.nextInt();
			
			switch(ch) {
			case 1:
				System.out.println("Enter Val");
				int val=sc.nextInt();
				s.push(val);
				break;
			case 2:
				System.out.println("Pull : "+ s.pull());
				break;
			case 3:
				 System.out.println("Peek Ele: "+ s.peek());
				break;
					
			}
			
		}
	}

}
