package com.bridglabz.assignment6.java;

public class LinkedListUC6 extends LinkedList{

	public static void main(String[] args) {
		LinkedListUC6 list =new LinkedListUC6();
		list.addLast(56);
		list.addLast(30);
		list.addLast(70);
		list.display();
		System.out.println();
		list.deleteLast();
		list.display();

	}

}
