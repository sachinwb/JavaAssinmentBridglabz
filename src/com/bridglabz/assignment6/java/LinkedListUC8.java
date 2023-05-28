package com.bridglabz.assignment6.java;

public class LinkedListUC8 extends LinkedList{

	public static void main(String[] args) {
		LinkedListUC8 list = new LinkedListUC8();
		list.addLast(56);
		list.addLast(30);
		list.addLast(70);
		list.display();
		System.out.println();
		list.addInBetween(30, 70, 40);
		list.display();

	}

}
