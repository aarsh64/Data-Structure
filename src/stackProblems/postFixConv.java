package stackProblems;

import java.util.Stack;

public class postFixConv {

	
	
	
	static int precCount(char a) {
		switch (a)
		{
		case '-':
		case '+':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
		}
		return -1;
	}
	
	static String postfixCon(String in) {
		String res = new String("");
		Stack<Character> x = new Stack<>();
		
		for(int i=0;i<in.length();++i){
			char c = in.charAt(i);
			if(Character.isLetterOrDigit(c)) {
				res+=c;
			}else if(c =='(') {
				x.push(c);
			}else if(c ==')') {
				while(!x.isEmpty() && x.peek() !='(')
						res +=x.pop();
				if(!x.isEmpty() && x.peek() !='(')
					return "Invalid String";
				else {
					x.pop();
				}
				
			}	else 
				{
					while(!x.isEmpty() && precCount(c)<= precCount(x.peek())) {
						if(x.peek()=='(') 
								return "Invalid String";
							res+=x.pop();	
					}
					x.push(c);
					}
			}
			
		while (!x.isEmpty()){ 
            if(x.peek() == '(') 
                return "Invalid Expression"; 
            res += x.pop(); 
         } 
        return res; 
		}
	
	public static void main(String args[]) {
		String input = "a+b*(c^d-e)^(f+g*h)-i";
		System.out.println("The postfix conversion is: "+postfixCon(input));
	}
	
		}
