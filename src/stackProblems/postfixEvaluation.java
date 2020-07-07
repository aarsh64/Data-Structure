package stackProblems;

import java.util.Stack;

public class postfixEvaluation {

	static int postfixEval(String in) {
		
	Stack<Integer> input = new Stack<>();
	
	for(int i=0;i<in.length();i++) {
		
		char ch = in.charAt(i);
		
		if(Character.isDigit(ch)) 
			input.push(ch-'0');
		else
		{
			int v1 = input.pop();
			int v2 = input.pop();
			
			switch(ch){
			case '+':
				input.push(v1+v2);
				break;
			case '-':
				input.push(v2-v1);
				break;
			case '*':
				input.push(v1*v2);
				break;
			case '/':
				input.push(v2/v1);
				break;
			}
		}
	}	
	return input.pop();
}
	
	public static void main(String args[]) {
		String input="231*+9-";
		System.out.println("Value is:"+postfixEval(input));
	}
}

