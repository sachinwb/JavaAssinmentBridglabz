package com.bridglabz.assignment6.java;

public class LinkedListUC9 extends LinkedList{

	public static void main(String[] args) {
		LinkedListUC9 list = new LinkedListUC9();
		list.addLast(1);
		list.addLast(2);
		list.addLast(3);
		list.addLast(4);
		list.addLast(5);
		list.addLast(6);
		list.addLast(7);
		list.addLast(8);
		list.addLast(9);
		list.addLast(10);
		list.display();
		System.out.println();
		list.deleteInBetween(6);
		list.display();

	}

}
