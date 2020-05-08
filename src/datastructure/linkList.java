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
	   public static void main(String[] args) {

	    	linkList L = new linkList();
	    	L.add(1);
	    	L.show();
	    	L.add(2);
	    	L.show();
}
}
