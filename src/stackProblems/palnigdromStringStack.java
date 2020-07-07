package stackProblems;

import java.util.Stack;

public class palnigdromStringStack {

	 static int checkUp(char x[]) {
		Stack<Character> s = new Stack<>();
		int i = 0;
		int j = x.length;
		int mid = j/2;
		
		while(i<mid) {
			s.push(x[i]);
			i++;
		}
		if(j%2 !=0) {
			i++;
		}
		while(i<j) {
			char p = s.pop();
			if(p!=x[i]) {
			return 0;
			}
			i++;
		}
		return 1;
	}
	
	public static void main(String args[]) {
		char p[] = "ba".toCharArray();
		if(checkUp(p) == 1) {
			System.out.println("Palingdrom!");
		}
		else {
			System.out.println("Not Palingdrom!!!");
		}
//		checkUp(p);
	}
}
