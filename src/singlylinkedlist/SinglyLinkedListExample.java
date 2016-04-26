package singlylinkedlist;

public class SinglyLinkedListExample {
	public static void main(String[] args) {
		SinglyLinkedList sl = new SinglyLinkedList();
		
		sl.add(10);
		sl.add(20);
		sl.add(30);
		sl.add(40);
		sl.add(50);
		sl.add(60);
		
		/*for(int i=1; i<=SinglyLinkedList.getCount(); i++) {
			System.out.print(sl.get(i)+"-->");
		}*/
		
		sl.display();
		
		sl.reverseIterative();
	}
}

class SinglyLinkedList {
	Node head;
	private static int counter;
	
	public void add(int data) {
		if(head==null) {
			head = new Node(data);
		}
		
		Node temp = new Node(data);
		Node current = head;
			
		while(current.next!=null) {
			current = current.next;
		}		
		current.next = temp;
		counter++;
	}
	
	public static int getCount() {
		return counter;
	}
	
	public int get(int index) {
		if(index<=0) {
			return -1;
		}
		Node current = head;
		for(int i=0; i<index; i++) {
			if(current.next==null)
				return -1;
			current = current.next;
		}
		return current.getData();
	}
	
	public void reverseIterative(){
		Node currNode = head;
		Node nextNode = null;
		Node prevNode = null;

		while(currNode!=null){
			nextNode = currNode.next;
			currNode.next = prevNode;
			prevNode = currNode;
			currNode = nextNode;
		}
		head = prevNode;
		System.out.println("\n Reverse Through Iteration");
		display();
	}
	
	public void display() {
		Node current = head;
		while(current!=null) {			
			System.out.print(current.data+" --> ");	
			current = current.next;
		}
	}
}

class Node {
	Node next;
	int data;
	
	public Node(int dataVal) {
		data = dataVal;
		next = null;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
	
	public Node getNext() {
		return this.next;
	}
	
	public void setData(int dataVal) {
		data = dataVal;
	}
	
	public int getData() {
		return this.data;
	}
	
	
}