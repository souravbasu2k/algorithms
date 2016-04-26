package singlylinkedlist;

public class PracticeLinkedList {
	public static void main(String[] args) {
		PLinkedList list = new PLinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		list.display(list.head);
		/*PNode new_head = list.reverse(list.head);
		System.out.println();
		list.display(new_head);*/		
	}
}

class PLinkedList {
	PNode head;
	static int counter = 0;
	
	public void add(int data) {
		if(head==null) {
			head = new PNode(data);
		}
		
		PNode temp = new PNode(data);
		PNode current = head;
		
		while(current.next!=null) {
			current = current.next;
		}
		current.next = temp;
		counter++;
	}
	
	public int get(int index) {
		if(index<=0)
			return -1;
		
		PNode current = head;
		for(int i=0; i<index; i++) {			
			if(current.next==null)
				return -1;
			current = current.next;
		}
		return current.data;
	}
	
	public void display(PNode node) {
		PNode current = node;
		while(current!=null) {			
			System.out.print(current.data+" --> ");	
			current = current.next;
		}
	}
	
	public PNode reverseRecur2(PNode current){
		if(current==null){
			return null;
		}
		if(current.next==null){
			head = current;
			return null;
		}
		reverseRecur2(current.next);
		current.next.next = current;
		current.next = null;
		return head;
	}
	
	/* Function to reverse the linked list */
    public PNode reverse(PNode node) {
        PNode prev = null;
        PNode current = node;
        PNode next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
}

class PNode {
	PNode next = null;
	int data;
	
	public PNode(int data) {
		this.data = data;
	}
}
