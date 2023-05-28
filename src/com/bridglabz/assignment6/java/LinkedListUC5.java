package com.bridglabz.assignment6.java;

public class LinkedListUC5 extends LinkedList{

	public static void main(String[] args) {
		LinkedListUC5 list =new LinkedListUC5();
		list.addLast(56);
		list.addLast(30);
		list.addLast(70);
		list.display();
		System.out.println();
		list.deleteFirst();
		list.display();

	}

}
