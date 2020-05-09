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
			System.out.println("data is :"+ temp.data);
			temp= temp.next;
		}
		
		System.out.println("-----------------");
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
			head.next.previous = null;
			}
		head = head.next;
		temp.next =null;
		length--;
		return temp;

	
}
	
public static void main(String[] args) {
	doublyLinkedList L = new doublyLinkedList();
	System.out.println(L.isEmpty());
	
	L.addNode(5);
	L.addNode(10);
	L.addNode(15);
	L.printData();
	System.out.println(L.isEmpty());
	L.printData();
	
	L.deleteData();
	L.printData();
	
	

}
}