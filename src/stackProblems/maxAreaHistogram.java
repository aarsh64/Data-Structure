package stackProblems;

import java.util.Stack;

public class maxAreaHistogram {

	static int maxHistogram(int d[], int n) {
		
		Stack<Integer> hist = new Stack<>();
		int maxArea = 0;
		int tp;
		int area_with_tp;
		int i =0;
		
		while(i<n) {
			if(hist.empty() || d[hist.peek()] <=d[i]) {
				hist.push(i++);
			}
			else
			{
				tp = hist.peek();
				hist.pop();
				
				area_with_tp = d[tp] * (hist.empty() ? i: i-hist.peek() -1 );
				
				if(maxArea < area_with_tp) {
					
					maxArea = area_with_tp;
					
				}
			}
		}
		
		while(hist.empty() == false) {
			tp = hist.peek();
			hist.pop();
			area_with_tp = d[tp] * (hist.empty() ? i: i-hist.peek() -1 );
			
			if(maxArea < area_with_tp) {
				
				maxArea = area_with_tp;
				
			}
		}
		
		return maxArea;
	}
	
	 public static void main(String[] args)  
	    { 
	        int hist[] = { 6, 2, 5, 4, 5, 1, 6 }; 
	        System.out.println("Maximum area is " + maxHistogram(hist, hist.length)); 
	    } 
}
