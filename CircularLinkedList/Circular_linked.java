package Corejava;

public class Circular_linked {
	Node last; 
	class Node{
		int data;
		Node next;
	
	Node(int val){
		data=val;
		next=null;
	}
	}
	 Circular_linked()
	{
		last=null;
	}
	public void insertAtBegin(int val)
	{
		Node newnode=new Node(val);
		if(last==null) {
			last=newnode;
			last.next=last;
		}
		else
			{
			newnode.next=last.next;
			last.next=newnode;
			}
	}
	public void display()
	{
		Node current=last.next;
		do
		{
			System.out.println(current.data);
			current=current.next;
	     } while(current!=last);
	
		
		
	System.out.println(current.data);
	}
	public void insertAtEnd(int val)
	{
		Node newnode=new Node(val);
		if(last==null) {
			last=newnode;
			last.next=last;
		}
		else
			{
			newnode.next=last.next;
			last.next=newnode;
			last=newnode;
			}
	}
	public void deleteAtBegin(int val) {
		Node current=last.next;
		last.next=last.next.next;
		
		current.next=null;
		
		
	}
	public void deleteAtEnd(int val)
	{
		Node current = last.next;
        while (current.next != last) {
            current = current.next;
        }
        current.next = last.next;
        last = current;
	}
	
	
		
		
}


