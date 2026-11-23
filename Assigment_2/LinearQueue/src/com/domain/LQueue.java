package com.domain;

import java.util.Scanner;





class Queue{
	final int  SIZE;
	int front;
	int rear;
	int[] arr; 
	 Queue(int size){
		 SIZE=size;
		 front=0;
		 rear=0;
		 arr= new int[SIZE];
		 arr[rear]=-1;
		 
	 }
	public void offer(int val) {
		if(front==0 && rear==SIZE) {
			System.out.println("Queue is Full");
		}
		else {
			arr[rear]=val;
			rear=rear+1;
		}
	}
	public int poll() {
		if((front== rear&& rear==0 )||(front==rear && rear!=0) ) {
			System.out.println("Is Empty");
			return -1;
		}
		int temp= arr[front];
		if(front+1==SIZE) {
			front=rear=0;
			arr[front]=-1;
			
		}
		else
			front=front+1;
		return temp;
		

	}
	public int peek() {
		if(isEmpty()) {
			System.out.println("Queue Empty");
			return -1;
		}
		return arr[front];
	}
	public boolean isEmpty() {
		return (front== rear&& rear==0 )||(front==rear && rear!=0) ;
	}
	public boolean isFull() {
		return (front==0 && rear==SIZE-1)||(front==rear&& rear!=0);
	}
}
public class LQueue {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Queue q=new Queue(4);
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
				q.offer(val);
				break;
			case 2:
				System.out.println("Poll : "+ q.poll());
				break;
			case 3:
				 System.out.println("Peek Ele: "+ q.peek());
				break;
					
			}
			
		}
				
				
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
