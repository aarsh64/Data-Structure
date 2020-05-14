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
		System.out.println("\n last node value:"+temp.data);
	}
}
public void nthNodeValue(int a) {
	
	linkedList temp = head;
	int leng=0;
	while(temp!=null) {
		temp=temp.next;
		leng++;
	}
	if(leng<a){
		System.out.println("Invalid value");
	}
	
	temp=head;
	for(int i=1;i<leng-a+1;i++) {
		temp=temp.next;		
	}
	System.out.println("nth Node value:"+temp.data);

}


public void nthNodeValueOptimised(int b) {
linkedList temp=head,lastNode=null;
for(int count=1;count<b;count++) {
	if(temp !=null) {
	temp=temp.next;
	}
}
	while(temp!=null) {
		if(lastNode==null) {
			lastNode=head;
		}
		else
		{
			lastNode=lastNode.next;
		}
	temp=temp.next;
	}
	if(lastNode!=null) {
		System.out.println("nthIndex value: "+lastNode.data);
	}

}
public static void main(String[] args) {
	doublyLinkedList L = new doublyLinkedList();
	L.addNode(5);
	L.addNode(10);
	L.addNode(15);
	L.printData();
	L.lastNode();
	L.nthNodeValue(2);
	L.nthNodeValueOptimised(2);
//    nthNodeRecursive(L,2);

}

	}
	


