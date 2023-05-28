package com.bridglabz.assignment6.java;



public class Queue {
	Node head;
	class Node{
		Object data;
		Node ref;
		
		Node(Object data){
			this.data=data;
		}
	}
	public void addLast(Object data) {
		Node newNode=new Node(data);
		if(head == null) {
			head=newNode;
		}
		else if(head.ref == null) {
			Node temp=head;
			temp.ref =newNode;
			head=temp;
		}
		else {
			Node temp=head;
			while(temp.ref != null) {
				temp=temp.ref;
			}
			temp.ref=newNode;
		}
	}
	public void display() {
		if (head == null) {
			System.out.println("There is no Node to display");
		}
		else if(head.ref == null) {
			System.out.println(head.data);
		}
		else {
			Node temp=head;
			while(temp !=null) {
				if (temp.ref !=null) {
				System.out.print(temp.data+" => ");
				}
				else {
					System.out.print(temp.data);
				}
				temp=temp.ref;
			}
			System.out.println();
		}
		
	}
	public void deleteFirst() {		
		if(head == null)
		{
			System.out.println("There is no Node to delete");
			}
		else  {
			head=head.ref;
		}			
	}
	public static void main(String[] args) {
		Queue list = new Queue();
		list.addLast(56);
		list.display();
		list.addLast(30);
		list.display();
		list.addLast(70);
		list.display();
		list.deleteFirst();
		list.display();
		list.deleteFirst();
		list.display();
		list.deleteFirst();

	}

}
