package stackProblems;

import java.util.Arrays;
import java.util.Stack;

public class findingSpan2 {

	
	static void findSpan(int price[],int n, int S[]) {
		
		Stack<Integer> st = new Stack<>();
		
		st.push(0);
		S[0] = 1;
		
		for(int i=0; i<n;i++) {
			
			while(!st.empty() && price[st.peek()] <price[i]) {
				st.pop();
				
				S[i] =(st.empty())?(i+1) : (i-st.peek());
				
				st.push(i);
			}
		}
	}
	
	
	static void printArray(int S[]) {
		System.out.println(Arrays.toString(S));
	}
	public static void main(String[] args) {
		
		int price[] = { 10, 4, 5, 90, 120, 80 }; 
		int n = price.length;
		int S[] = new int[n];
		
		findSpan(price,n,S);
		
		printArray(S);
		}
}
