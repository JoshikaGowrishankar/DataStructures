package Corejava;

public class Circular_Access {
	public static void main(String args[]) {
		Circular_linked l=new Circular_linked();
		l.insertAtBegin(23);
		l.insertAtBegin(45);
		l.insertAtBegin(56);
		l.insertAtBegin(100);
		l.insertAtEnd(500); 
		l.deleteAtBegin(0);
		l.deleteAtEnd(0);
		l.display();
	}
	

}
