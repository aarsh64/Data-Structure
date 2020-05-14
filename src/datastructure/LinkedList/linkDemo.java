package datastructure.LinkedList;
public class linkDemo{
	
	static Node head1,head2=null;
	
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next =null;
		}
	}
	
	int getNode() {
		int l1=length(head1);
		int l2=length(head2);
		int d;
		
		if(l1>l2) {
			d=l1-l2;
			 return interSectionNode(d,head1,head2);
		}
		else
		{
			 d=l2-l1;
			return interSectionNode(d,head1,head2);
			
		}
	}
	int length(Node node) {
		Node current = node;
		int l=0;
		while(current!=null) {
			l++;
			current=current.next;
		}
		return l;
	}
	int interSectionNode(int x,Node n1,Node n2) {
		
		Node node1=n1;
		Node node2=n2;
		for (int i = 0; i < x; i++) { 
            if (node1 == null) { 
                return -1; 
            } 
            node1 = node1.next; 
        } 

		while(node1!=null && node2!=null) {
			if(node1.data==node2.data) {
				return node1.data;
			}
			node1=node1.next;
			node2=node2.next;
		}
		return -1;
	}

	
	public static void main(String[] args) {
		
		linkDemo l1= new linkDemo();
		
		l1.head1 = new Node(3); 
        l1.head1.next = new Node(6); 
        l1.head1.next.next = new Node(9); 
        l1.head1.next.next.next = new Node(15); 
        l1.head1.next.next.next.next = new Node(30); 
		
        l1.head2 = new Node(10); 
        l1.head2.next = new Node(15); 
        l1.head2.next.next = new Node(30);
		System.out.println("Intersction Node is :"+l1.getNode());
	}
}