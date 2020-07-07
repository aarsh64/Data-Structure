package stackProblems;

import java.util.Stack;

public class getMinimum {
	
	Stack<Integer> x;
	int minEle;
	
	getMinimum(){
		x = new Stack<Integer>();
	}
void getMin() {
	if(x.isEmpty()){
		System.out.println("Stack is empty!!");
	}
	else
	{
		System.out.println("Minimum value is:"+minEle);
	}
}
void peek() {
	if(x.isEmpty()) {
		System.out.println("Stack is empty!!");
	}
	Integer d = x.peek();
	if(d<minEle) {
		System.out.println(minEle);
	}else {
		System.out.println(d);
	}
}
void push(int d) {
	if(x.isEmpty()) {
		minEle = d;
		x.push(d);
		return;
	}
	
	if(d<minEle) {
		x.push(2*d-minEle);
		minEle = d;
	}
	else {
		x.push(d);
	}
}
 void pop() {
	 if (x.isEmpty()) 
     { 
         System.out.println("Stack is empty"); 
         return; 
     } 

     System.out.print("Top Most Element Removed: "); 
     Integer t = x.pop(); 

     // Minimum will change as the minimum element 
     // of the stack is being removed. 
     if (t < minEle) 
     { 
         System.out.println(minEle); 
         minEle = 2*minEle - t; 
     } 

     else
         System.out.println(t); 
 }
	
public static void main(String args[]) {
	
	getMinimum x = new getMinimum();
	
	x.push(5);
	x.push(3);
	x.push(-10);
	x.getMin();
	
}
}
