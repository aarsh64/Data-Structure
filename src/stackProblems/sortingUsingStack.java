package stackProblems;

import java.util.Stack;

public class sortingUsingStack {

	
	
	public static Stack<Integer> sortStack(Stack<Integer> stk){
		
		Stack<Integer> sStk = new Stack<Integer>();
		
		while(!stk.isEmpty()) {
			
			int temp = stk.pop();
			
			while(!sStk.isEmpty() && sStk.peek()>temp) {
				
				stk.push(sStk.pop());
				
			}
			sStk.push(temp);
		}
		return sStk;
	}
	
	public static void main(String[] args) {
		Stack<Integer> input = new Stack<Integer>(); 
        input.add(34); 
        input.add(3); 
        input.add(31); 
        input.add(98); 
        input.add(92); 
        input.add(23); 
      
        // This is the temporary stack 
        Stack<Integer> tmpStack = sortStack(input); 
        System.out.println("Sorted numbers are:"); 
      
        while (!tmpStack.empty()) 
        { 
            System.out.print(tmpStack.pop()+" "); 
        }  
	}
}
