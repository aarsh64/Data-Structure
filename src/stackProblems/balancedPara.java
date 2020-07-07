package stackProblems;


// to check wether the string is balanced or not...
public class balancedPara {

		static int limit = 100;
		int top;
		char item[] = new char[limit];


		balancedPara() {
			top=-1;
		}
	boolean push(char d) {
		if(top>=(limit-1)) {
			System.out.println("Stack Overflowed!");
			return false;
		}
		else {
			item[++top]=d;
			System.out.println("Data "+d+" is addded");
			return true;
		}
	}
	char pop() {
		System.out.println("Popped called!");
		if(top<0) {
			System.out.println("Stack is already empty!");
			return 0;
		}
		else {
			char x = item[top--];
			System.out.println(x+" is the popped item");
			return x;
		}
	}
	char peek() {
		return item[top];
	}
	boolean isEmpty()  
	{ 
	    return (top == -1) ? true : false; 
	} 


	public static void main(String args[]) {
		
			String s = "(){}[]";
			System.out.println("Balanced string value: "+validPara(s));
			
	}
	public static boolean validPara(String s) {
		System.out.println("Called");
		balancedPara st = new balancedPara();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==')') {
				if(!st.isEmpty() && st.peek()=='(') {
					st.pop();
				
				}
				else
					return false;
			}else if(s.charAt(i)==']') {
				if(!st.isEmpty() && st.peek() =='[') {
					st.pop();
					
				}
				else return false;
			}else if(s.charAt(i)=='}') {
				if(!st.isEmpty() && st.peek()=='{') {
					st.pop();
				}
				else return false;
			}else st.push(s.charAt(i)); 
		}			
			if(st.isEmpty()) {
				return true;
			}
			else {
				return false;		}
	}
	}
	 

