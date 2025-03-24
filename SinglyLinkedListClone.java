package Corejava;

	public class SinglyLinkedListClone {

	    
	    static class Node {
	        int data;
	        Node next;

	  
	        Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

	   
	    static class SinglyLinkedList {
	        Node head;

	       
	        public void append(int data) {
	            Node newNode = new Node(data);
	            if (head == null) {
	                head = newNode;
	                return;
	            }
	            Node last = head;
	            while (last.next != null) {
	                last = last.next;
	            }
	            last.next = newNode;
	        }

	      
	        public void printList() {
	            Node current = head;
	            while (current != null) {
	                System.out.print(current.data + " -> ");
	                current = current.next;
	            }
	            System.out.println("None");
	        }

	        
	        public SinglyLinkedList clone() {
	            if (head == null) {
	                return null;
	            }

	            
	            Node current = head;
	            while (current != null) {
	                Node newNode = new Node(current.data);
	                newNode.next = current.next;
	                current.next = newNode;
	                current = newNode.next;
	            }

	          
	            Node original = head;
	            Node cloneHead = head.next;
	            Node cloneCurrent = cloneHead;

	            while (original != null) {
	                original.next = original.next != null ? original.next.next : null;
	                if (cloneCurrent.next != null) {
	                    cloneCurrent.next = cloneCurrent.next.next;
	                    cloneCurrent = cloneCurrent.next;
	                }
	                original = original.next;
	            }

	           
	            SinglyLinkedList clonedList = new SinglyLinkedList();
	            clonedList.head = cloneHead;
	            return clonedList;
	        }
	    }

	    
	    public static void main(String[] args) {
	        SinglyLinkedList sll = new SinglyLinkedList();
	        sll.append(1);
	        sll.append(2);
	        sll.append(3);

	        System.out.println("Original List:");
	        sll.printList();

	        SinglyLinkedList clonedList = sll.clone();

	        System.out.println("Cloned List:");
	        clonedList.printList();
	    }
	}


