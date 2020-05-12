package datastructure.LinkedList;

public class linkList{
	public Node head;
	public int count;
	
	public linkList() {
	head = new Node(0);
	count=0;
	}
	
	//can be used to print all the elements present in the linkedList
	public void show() {
		Node current =head;
		while(current.next !=null) {
			current = current.next;	
			System.out.println(current.data);
		}
	
		
	}
	public void showIndex(int index) {
		Node current = head;
		int jump=0;
		while( jump <index ) {
			current = current.next;
			jump++;
		}
		System.out.println("value at index no."+ index + " is "+current.data);
	}
	
	public boolean add(int d) {
		Node end = new Node(d);
		Node current = head;
		
		while(current.next != null) {
			current = current.next;
		}
		current.next = end;
		count++;
		System.out.println("appended to the tail");
		return true;
	}
	
	public boolean add(int d,int index){
    	Node end = new Node(d);
    	Node current = head;
    	int jump;
    	

    	if(index>count || index<1){
    		System.out.println("Add Failed: index out of bounds of size of linked list!!");
    		return false;
    	}
    	else{
    		jump = 0;
    		while(jump<index-1){
    			current = current.next;
    			jump++;
    		}
    		end.next = current.next;
    		System.out.println("end.next value:"+end.next);
    		current.next = end;
    		count++;
    		System.out.println("Success! "+d+" added at index "+index);
            return true;
    	}
    }
	
	public boolean del(int d) {	
			Node current = head;
			while(current.next != null) {
				if(current.next.data ==  d) {
					current.next = current.next.next;
					count--;
				System.out.println("Deleted successfully");
				return true;
				}
				current =  current.next;
			}	
		return false;
	
	}	   
	
//To delete the specific node from the LinkedList..

	public boolean delIndex(int index) {
	Node current = head;
	int jump;
	if(index>count || count <1) {
		System.out.println("Not valid index value");
		return false;
	}
	else
	{
		jump=0;
		while(jump<index-1) {
			current=current.next;
			jump++;
		}
		current.next =  current.next.next;
		System.out.println("index "+index+" value is deleted successfully");
		return true;
	}
}

// Returns the value of nTh last from the LinkedList... 

public void nthIndexValue(int x) {
	Node temp = head;
	int leng=0;
	while(temp!=null) {
		temp=temp.next;
		leng++;
	}
	if(leng<x){
		System.out.println("Invalid value");
	}
	
	temp=head;
	for(int i=1;i<leng-x+1;i++) {
		temp=temp.next;		
	}
	System.out.println("nth value is: "+temp.data);
}

// it reuturns the nth last node value...
public void nthIndexValueRec(linkedList p,int p2) {
	

}
public void nthIndexValueOptimised(int x) {
		Node temp=head,lastNode=null;
		
		for(int count=1;count<x;count++) {
			if(temp!=null) {
				temp=temp.next;
			}
		}
		while(temp!=null) {
			if(lastNode==null) {
				lastNode=head;
			}
			else
				lastNode=lastNode.next;
			temp=temp.next;
		}

		if(lastNode!=null) {
			System.out.println("nthIndex value from the last:"+lastNode.data);
		}
	}
//Returns the last node value...
	public void lastNodeValue() {
		Node temp = head;
		while(temp!=null) {
			temp=temp.next;
			if(temp.next==null) {
			System.out.println("value of last node in LinkedList is :" + temp.data);
			return;
			}
		}
	}
	
//it checks whether the Linkedlist is null terminated or not...
	//Floyd approach...
	public boolean loopFinder() {
		Node node1=head,node2=head;
		while(node1!=null && node1.next!=null) {
			node1=node1.next.next;
			node2=node2.next;
			if(node1==node2) {
					return true;
			}
			}
		return false;

	}
	
//it checks whether the list has loop or not and if
	//there is a loop it will return the start node of the loop
	public void loopNodeFinder() {
		Node node1=head,node2=head;
		boolean loop=false;
		while(node1!=null && node1.next!=null) {
			node1=node1.next.next;
			node2=node2.next;
			if(node1==node2) {
					loop=true;
					break;
			}
			}
	if(loop) {
		node1=head;
		while(node1!=node2) {
			node1=node1.next;
			node2=node2.next;
		}
		System.out.println("The loop start from"+node1.data);
		return;
	}
	return;
}
	
	public static void main(String[] args) {

	    	linkList L = new linkList();
	    	L.add(1);
	    	L.add(2);
	    	L.add(3);
	    	L.add(4);
	    	L.add(1);
	    	L.show();
	    	L.showIndex(4);
	    	L.nthIndexValueOptimised(4);
//	    	L.nthIndexValueRec(L.head,4);
	    	
	    	L.lastNodeValue();
	    	System.out.println("Loops value:"+L.loopFinder());
	    	L.loopNodeFinder();
		    
}
	

}