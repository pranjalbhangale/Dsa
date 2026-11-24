package com.domain;

public class CircularList <E>{

	private static class Node<E>{
		E data;
		Node<E> next;
		Node(E val){
			data=val;
			next=null;
		}
	}
	Node<E> head,tail;
	int size;
	public CircularList() {
		head=null;
		tail=null;
		size=0;
		}
	public boolean add(E val) {
		Node<E> newNode=new Node<>(val);
		if(head==null) {
			head=newNode;
			tail=newNode;
			tail.next=head;
			size++;
			return true;
		}
		tail.next=newNode;
		tail=newNode;
		tail.next=head;
		size++;
		return true;
	
	}
	public boolean addFirst(E val) {
		Node<E> newNode=new Node<>(val);
		if(head==null && tail==null) {
			head=newNode;
			tail=newNode;
			tail.next=head;
			size++;
			return true;
		}
		else {
			newNode.next=head;
			head=newNode;
			tail.next=head;
			size++;
			return true;
		}
	}
	public void add(int idx,E val) {
		Node<E> newNode=new Node<E>(val);
		if(idx<0 || idx>size) {
			System.err.println("Index Out Of Bound");
			return;
		}else if(head==null && idx==0) {
			addFirst(val);
			return;
			
		}
		else {
			Node<E> trev=head;
			for(int i=0;i<idx-1;i++) {
				trev=trev.next;
			}
			if(trev==tail) {
				trev.next=newNode;
				tail=newNode;
				tail.next=head;
				size++;
				return;
			}
			newNode.next=trev.next;
			trev.next=newNode;
			size++;
			
		}
	}
	public String toString() {
		StringBuffer list=new StringBuffer();
		Node<E> trev=head;
		if(head==null) {
			return "List Empty";
		}
		do {
			list.append(trev.data+" ");
			trev=trev.next;
		}while(trev!=head);
		return list.toString();
	}
public boolean remove(int idx) {
	if(idx<0||idx>=size) {
		System.err.println("Index out of bound");
		return false;
	}
	else if(head==null) {
		System.err.println("list Empty");
		return false;
	}
	else if(idx==0) {
		head=head.next;
		tail.next=head;
		size--;
	}
	else {
		Node<E> trev=head;
		for(int i=0;i<idx-1;i++) {
			trev=trev.next;
			
		}
			trev.next= trev.next.next;
			size--;
			return true;
			
		
	}
	return false;
}
}
