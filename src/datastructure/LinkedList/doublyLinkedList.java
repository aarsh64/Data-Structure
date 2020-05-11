package datastructure.LinkedList;

public class doublyLinkedList {
	public linkedList head;
	public linkedList tail;
	public int length;
	
	public doublyLinkedList() {
		this.head = null;
		this.tail = null;
		this.length = 0;	
	}
	
	public boolean isEmpty() {
		return length == 0;
	}
public void addNode(int d) {
	linkedList n = new linkedList(d);
	if(isEmpty()) {
		tail = n;
	}
	else {
		head.previous =  n;
	}
	n.next = head;
	head = n;
	length++;
}
public void printData() {
	if (head == null) {
		return;
	}
	else
	{
		linkedList temp = head;
		while(temp != null) {
			System.out.print(" ---> "+ temp.data);
			temp= temp.next;
		}
		
	}
}

public linkedList deleteData() {
	if(isEmpty()) {
		System.out.println("LinkedList is alredy empty");
	}
	
		linkedList temp = head;
		if(head == tail) {
			tail = null;
		}
		else {
			System.out.println("\n");
		System.out.println("Deleted item is:"+ this.head.data );
			head.next.previous = null;
			}
		head = head.next;
		temp.next =null;
		length--;
		return temp;

	
}
public void lastNode() {
	if(isEmpty()) {
		System.out.println("No node in LinkedList");
	}
	else {
		linkedList temp = head;
		while(temp.next!=null) {
			temp= temp.next;
		}
		System.out.println("\nlast node value:"+temp.data);
	}
}
	
public static void main(String[] args) {
	doublyLinkedList L = new doublyLinkedList();
	
	L.addNode(5);
	L.addNode(10);
	L.addNode(15);
	L.printData();
	L.deleteData();
	L.printData();
	L.lastNode();
	

}
}