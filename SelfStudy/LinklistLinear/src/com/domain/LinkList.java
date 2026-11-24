package com.domain;

public class LinkList<E> {

	static private class Node<E> {
		E data;
		Node<E> next;

		Node(E val) {
			data = val;
			next = null;
		}
	}

	private Node<E> head, tail;

	LinkList() {
		head = null;
		tail = null;
	}

	public boolean addFirst(E val) {
		Node<E> newNode = new Node<E>(val);

		newNode.next = head;
		head = newNode;
		tail = newNode;
		return true;

	}

	public boolean add(E val) {
		Node<E> newN = new Node<E>(val);
		if (head == null) {
			newN.next = head;
			head = newN;
			tail = newN;
		} else {
			tail.next = newN;
			tail = newN;
		}
		return true;

	}

	public void add(int idx, E val) {
		if (idx < 0) {
			System.err.println("Index Out Of Bound Exception");
			return;
		}
		if (head == null) {
			if (idx == 0)
				add(val);
			return;
		} else if (idx == 0) {
			addFirst(val);
		} else {
			Node<E> newNode = new Node<E>(val);
			Node<E> trev = head;
			for (int i = 0; i < idx - 1; i++) {
				trev = trev.next;
				if (trev == null) {
					System.err.println("Index Out Of Bound Exception");
					return;
				}
			}
			if (trev == tail) {
				newNode.next = trev.next;
				trev.next = newNode;
				tail = newNode;
				return;

			}
//			System.out.println("Idx Addsion"+trev.data);
			newNode.next = trev.next;
			trev.next = newNode;

		}
	}

	public boolean remove(int idx) {
		if (head == null || idx < 0) {

			return false;
		} else if (idx == 0) {
			head = head.next;
			return true;
		} else {
			Node<E> trev = head;

			for (int i = 0; i < idx - 1; i++) {
				trev = trev.next;
				if (trev.next == null) {
					System.err.println("rrIndex Out Of Bound Exception");
					return false;
				}
			}
			if (trev.next == tail)
				tail = trev;

			trev.next = trev.next.next;

			return true;
		}
	}

	public String toString() {
		StringBuffer list = new StringBuffer();

		if (head == null) {
			return "Empty";
		} else {
			Node<E> trev = head;
			while (trev != null) {
				list.append(trev.data + " ");
				trev = trev.next;
			}
		}
		return list.toString();
	}
}
