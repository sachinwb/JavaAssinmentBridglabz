package com.bridglabz.assignment6.java;

public class LinkedList {

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
//			head.ref=newNode;
		}
		else {
			Node temp=head;
			while(temp.ref != null) {
//				System.out.println(temp.data);
				temp=temp.ref;
			}
			temp.ref=newNode;
		}
	}

	public void deleteLast() {
		if(head == null) {
			System.out.println("There is no data to delete");
		}
		else if(head.ref == null) {
			head=null;
		}
		else {
			Node temp = head;
			while(temp.ref.ref !=null) {
				temp=temp.ref;
			}
			temp.ref=null;
		}
	}
	
	public void addFirst(Object data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		}
		else  {
			Node temp = head;
			newNode.ref = temp;
			head = newNode;
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

	public void addInBetween(Object data1,Object data2,Object data3) {
		Node newNode1 = new Node(data1);
		Node newNode2 = new Node(data2);
		Node newNode3 = new Node(data3);
		Node temp1=head;
		Node temp2;
		while(temp1.data!=newNode2.data) {
			temp1=temp1.ref;
		}
		temp2=temp1;
		newNode3.ref=temp2;
		
		temp1=head;
		while(temp1.data!=newNode1.data) {
			temp1=temp1.ref;			
		}
		temp1.ref=newNode3;		
	}
	public void deleteInBetween(Object data) {
		Node newNode=new Node(data);
		Node temp1=head;
		Node temp2;
		while(temp1.data!=newNode.data) {
			temp1=temp1.ref;
		}
		temp2=temp1.ref;
		temp1=head;
		while(temp1.ref.data!=newNode.data) {
			temp1=temp1.ref;
		}
		temp1.ref=temp2;
	}
	
	public void searchNode(Object data) {
		Node newNode=new Node(data);
		Node temp=head;
		int count=0;
		int c=0;
		while(temp!=null) {
			count+=1;
			if(temp.data == newNode.data) {
				c=count;
				break;
			}
			temp=temp.ref;
			
		}	
		if(c==count)
			System.out.println(newNode.data+" is at index of :"+count+" and is at "+(count+1)+" Node");
		else
			System.out.println("Please enter valid input");		
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

}
