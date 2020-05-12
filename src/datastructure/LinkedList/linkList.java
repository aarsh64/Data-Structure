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
	public boolean isCircular() {
		if(head==null) {
			return true;
		}
		Node temp=head;
		while(temp!=null && temp!=head) {
			temp=temp.next;
				}
		return (temp == head);
		}
	
	public static void main(String[] args) {

	    	linkList L = new linkList();
	    	L.add(1);
//	    	L.show();
	    	L.add(2);
//	    	L.show();
	    	L.add(3);
//	    	L.show();	
	    	L.add(4);
//	    	L.show();
	    	L.show();
	    	L.showIndex(4);
	    	L.nthIndexValueOptimised(4);
	    	L.nthIndexValue(4);
	    	L.lastNodeValue();
	    System.out.println(L.isCircular()?"Yes":"No");
}
	

}