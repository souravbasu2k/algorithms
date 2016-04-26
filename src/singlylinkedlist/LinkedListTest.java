package singlylinkedlist;

public class LinkedListTest {
	public static void main(String[] args) {
		SinglyLinkedList1<Integer> sl = new SinglyLinkedList1<Integer>();
		
		sl.add(10);
		sl.add(20);
		sl.add(30);
		sl.add(40);
		sl.add(50);
		sl.add(60);
		
		for(int i=1; i<=SinglyLinkedList.getCount(); i++) {
			System.out.print(sl.get(i)+"-->");
		}
	}
}

class SinglyLinkedList1<T> {
	Node1<T> head;
	private static int counter;
	
	public SinglyLinkedList1() {
			
	}
	
	public void add(T data) {
		if(head==null) {
			head = new Node1<T>(data);
		}
		
		Node1<T> temp = new Node1<T>(data);
		Node1<T> current = head;
			
		while(current.getNext()!=null) {
			current = current.getNext();
		}		
		current.setNext(temp);
		counter++;
	}
	
	public static int getCount() {
		return counter;
	}
	
	public T get(int index) {
		if(index<=0) {
			return null;
		}
		Node1<T> current = head;
		for(int i=0; i<index; i++) {
			if(current.getNext()==null)
				return null;
			current = current.getNext();
		}
		return current.getData();
	}
}

class Node1<T> {
	Node1<T> next;
	T data;
	
	public Node1(T dataVal) {
		data = dataVal;
		next = null;
	}
	
	public void setNext(Node1<T> next) {
		this.next = next;
	}
	
	public Node1<T> getNext() {
		return this.next;
	}
	
	public void setData(T dataVal) {
		data = dataVal;
	}
	
	public T getData() {
		return this.data;
	}
	
	
}