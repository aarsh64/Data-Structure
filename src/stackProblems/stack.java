package stackProblems;

 class stack {

	static int limit = 100;
	int top;
	int a[]	= new int[limit];


	stack() {
		top=-1;
	}
boolean push(int d) {
	if(top>=(limit-1)) {
		System.out.println("Stack Overflowed!");
		return false;
	}
	else {
		a[++top]=d;
		System.out.println("Data "+d+" is addded");
		return true;
	}
}
int pop() {
	
	if(top<0) {
		System.out.println("Stack is already empty!");
		return 0;
	}
	else {
		int x = a[top--];
		return x;
	}
}
int peek() {
	return a[top];
}
boolean isEmpty()  
{ 
    return (top == -1) ? true : false; 
} 


public static void main(String args[]) {
	
		stack x = new stack();
		x.push(10);
		x.push(20);
		System.out.println("Popped item: "+x.pop());
		System.out.println("Top elemnet is: "+x.peek());

		
}
 } 