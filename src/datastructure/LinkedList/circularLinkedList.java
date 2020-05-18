package datastructure.LinkedList;



public class circularLinkedList {
	
	static Node addEmpty(Node l,int data) {
		if(l!=null) {
			return l;
		}
		Node temp =  new Node();
		
		temp.data = data;
		l = temp;
		
		l.next = l;
		
		return l;
	}
	
	static Node addBegin(Node l,int data) {
		if(l == null) {
			return addEmpty(l,data);
		}
		Node temp =  new Node();
		
		temp.data = data;
		temp.next=l.next;
		l.next=temp;
	
		return l;
	}
	
	static Node addEnd(Node l,int data) {
		if(l == null) {
			return addEmpty(l,data);
		}
		Node temp = new Node();
		
		temp.data = data;
		temp.next = l.next;
		l.next = temp;
		l = temp;
		
		return l;
	}
	
	static void traverse(Node l) {
		Node p;
		
		p=l.next;
		
		do {
			System.out.println(p.data);
			p=p.next;
		}
		while(p != l.next);
	}
	
	public static void main(String args[]){
		Node last = null;
	
	last = addEmpty(last,5);
	last = addBegin(last,1);
	last = addEnd(last,3);
	traverse(last);
}

}
