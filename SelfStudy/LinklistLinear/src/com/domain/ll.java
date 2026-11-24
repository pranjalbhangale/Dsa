package com.domain;

import java.util.LinkedList;
import java.util.List;

public class ll {
	public static void main(String[] args) {
	LinkList<Integer> ll=new LinkList<>();
	ll.add(10);
	ll.add(20);
	ll.add(30);
	ll.add(40);
	System.out.println("LinkList :: "+ll.toString());
	ll.add(1,50);
	System.out.println("LinkList :: "+ll.toString());
//	boolean delSuc=ll.remove(7);
//	System.out.println("Delete :: "+delSuc);
	System.out.println("LinkList :: "+ll.toString());
	
	System.out.println("Circular LinkedList-----------");
	CircularList<Integer> cl=new CircularList<>();
	System.out.println(cl.toString());
	cl.add(0, 30);
	cl.add(10);
	cl.add(20);
	cl.add(30);
	
	System.out.println(cl.toString());
	
	cl.remove(3);
	System.out.println(cl.toString());
	
	System.out.println();
	
	
	}
}
