package datastructure;



public class linkList{
	public Node head;
	public int count;
	
	public linkList() {
	head = new Node(0);
	count=0;
	}
	
	public void show() {
		Node current =head;
		while(current.next !=null) {
			current = current.next;
			
		}
		System.out.println(current.data);
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
	
	public static void main(String[] args) {

	    	linkList L = new linkList();
	    	L.add(1);
	    	L.show();
	    	L.add(2);
	    	L.show();
	    	L.add(3);
	    	L.show();	
	    	L.add(4);
	    	L.show();
	    	L.del(2);
	    	L.delIndex(2);
	    	
}
}
